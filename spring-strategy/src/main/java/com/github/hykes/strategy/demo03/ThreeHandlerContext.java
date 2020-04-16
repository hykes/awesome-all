package com.github.hykes.strategy.demo03;

import com.google.common.collect.Lists;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * 使用 Spring 的 @Autowired 注解按照类型自动装配的功能。可以装配 list, map。
 *
 * @author hehaiyangwork@gmail.com
 * @date 2020-04-15 23:25:00
 */
@Component
public class ThreeHandlerContext {

    private List<AbstractThreeHandler> handlerList = Lists.newArrayList();

    public void register(AbstractThreeHandler threeHandler) {
        handlerList.add(threeHandler);
    }

    public AbstractThreeHandler selectOne(String type) {
        AbstractThreeHandler handler = handlerList.stream().filter(it -> it.accept(type)).findFirst().orElse(null);
        if (handler != null) {
            throw new RuntimeException("can not find handler");
        }
        return handler;
    }

}
