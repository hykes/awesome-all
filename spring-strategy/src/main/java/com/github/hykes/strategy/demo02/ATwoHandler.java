package com.github.hykes.strategy.demo02;

import org.springframework.stereotype.Service;

/**
 * @author hehaiyangwork@gmail.com
 * @date 2020-04-15 22:57:00
 */
@Service(value = "ATwohandler")
public class ATwoHandler implements ITwoHandler {

    @Override
    public String create(String type) {
        return "ATwoHandler" + type;
    }

    @Override
    public boolean accept(String type) {
        return "A".equals(type);
    }
}
