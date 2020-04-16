package com.github.hykes.strategy.demo01;

import java.lang.reflect.Method;
import java.util.Map;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

/**
 * @author hehaiyangwork@gmail.com
 * @date 2020-04-15 23:00:00
 */
@Component
public class OneHandlerContext implements BeanFactoryPostProcessor, ApplicationContextAware {

    private ApplicationContext ctx;

    private Map<String, Class<?>> handlerMap;

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory)
            throws BeansException {
        String[] beanNams = beanFactory.getBeanDefinitionNames();
        for (String beanName : beanNams) {
            BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanName);
            if (beanDefinition instanceof AnnotatedBeanDefinition) {
                AnnotatedBeanDefinition annotatedBeanDefinition = (AnnotatedBeanDefinition) beanDefinition;
                AnnotationMetadata annotationMetadata = annotatedBeanDefinition.getMetadata();
                if (annotationMetadata.hasAnnotation(HandlerType.class.getName())) {

                    Map<String, Object> annotationAttributes = annotationMetadata
                            .getAnnotationAttributes(HandlerType.class.getName());

                    Method method = HandlerType.class.getMethods()[0];
                    Object object = annotationAttributes.get(method.getName());

                    handlerMap.put(object.toString(), ((AbstractBeanDefinition) beanDefinition).getBeanClass());

                    // 初始化HandlerContext，将其注册到spring容器中
//                    HandlerContext context = new HandlerContext(handlerMap);
//                    beanFactory.registerSingleton(HandlerContext.class.getName(), context);
                }
            }
        }
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.ctx = applicationContext;
    }

    public Object getInstance(String type) {
        Class<?> clazz = handlerMap.get(type);
        if (clazz == null) {
            throw new IllegalArgumentException("not found handler for type: " + type);
        }
        return ctx.getBean(clazz);
    }

}
