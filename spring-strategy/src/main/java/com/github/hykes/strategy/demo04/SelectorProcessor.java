package com.github.hykes.strategy.demo04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * @author hehaiyangwork@gmail.com
 * @date 2020-04-16 22:39:00
 */
@Service
public class SelectorProcessor implements BeanPostProcessor, ApplicationContextAware {

    private ApplicationContext ctx;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof AbstractSelector && bean.getClass().isAnnotationPresent(Selector.class)) {
            Class<?> clazz = bean.getClass();
            Selector selector = clazz.getAnnotation(Selector.class);
            String[] handlerNames = selector.value();
            if (handlerNames.length > 0) {
                for (String handlerName : handlerNames) {

                }
                List<AbstractHandler> handlerList = Arrays.stream(handlerNames).map(it -> {
                    AbstractHandler h = (AbstractHandler) ctx.getBean(it);
                    return h;
                }).collect(Collectors.toList());
                ((AbstractSelector) bean).setHandlerList(handlerList);
            }

        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.ctx = applicationContext;
    }
}
