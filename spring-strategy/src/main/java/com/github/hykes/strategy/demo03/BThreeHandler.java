package com.github.hykes.strategy.demo03;

import org.springframework.stereotype.Service;

/**
 * @author hehaiyangwork@gmail.com
 * @date 2020-04-15 22:57:00
 */
@Service(value = "BThreeHandler")
public class BThreeHandler extends AbstractThreeHandler {

    @Override
    public String create(String type) {
        return "BThreeHandler" + type;
    }

    @Override
    public boolean accept(String type) {
        return "B".equals(type);
    }
}
