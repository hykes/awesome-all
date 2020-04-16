package com.github.hykes.strategy.demo03;

import org.springframework.stereotype.Service;

/**
 * @author hehaiyangwork@gmail.com
 * @date 2020-04-15 22:57:00
 */
@Service(value = "AThreeHandler")
public class AThreeHandler extends AbstractThreeHandler {

    @Override
    public String create(String type) {
        return "ATwoHandler" + type;
    }

    @Override
    public boolean accept(String type) {
        return "A".equals(type);
    }
}
