package com.github.hykes.strategy.demo02;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 使用 Spring 的 @Autowired 注解按照类型自动装配的功能。可以装配 list, map。
 * @author hehaiyangwork@gmail.com
 * @date 2020-04-15 23:25:00
 */
@Component
public class TwoHandlerContext {

    @Autowired
    private List<ITwoHandler> handlerList;

    public String create(String type) {
        ITwoHandler handler = Optional.ofNullable(handlerList).orElse(null).stream()
                .filter(it -> it.accept(type)).findFirst().orElse(null);
        if (handler != null) {
            throw new RuntimeException("can not find handler");
        }
        return handler.create(type);
    }

}
