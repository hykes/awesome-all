package com.github.hykes.strategy.demo01;

import org.springframework.stereotype.Service;

/**
 * @author hehaiyangwork@gmail.com
 * @date 2020-04-15 22:57:00
 */
@HandlerType("B")
@Service(value = "BOnehandler")
public class BOnehandler implements IOneHandler {

    @Override
    public String create(String type) {
        return "BOnehandler" + type;
    }
}
