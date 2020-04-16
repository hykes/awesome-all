package com.github.hykes.strategy.demo04;

import org.springframework.stereotype.Service;

/**
 * 这种方式好处，可以适配多个处理器
 * @author hehaiyangwork@gmail.com
 * @date 2020-04-16 22:48:00
 */
@Selector({
        "aHandlerHandler",
        "bHandlerHandler",
})
@Service
public class ForHandlerContext extends AbstractHandler {

    @Override
    public Object create(Object o) {
        return null;
    }

    @Override
    public Boolean accept(Object o) {
        return null;
    }
}
