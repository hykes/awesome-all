package com.github.hykes.strategy.demo01;

import org.springframework.stereotype.Service;

/**
 * @author hehaiyangwork@gmail.com
 * @date 2020-04-15 22:57:00
 */
@HandlerType("A")
@Service(value = "AOnehandler")
public class AOnehandler implements IOneHandler {

    @Override
    public String create(String type) {
        return "AOnehandler" + type;
    }
}
