package com.github.hykes.strategy.demo01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author hehaiyangwork@gmail.com
 * @date 2020-04-15 23:18:00
 */
@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private OneHandlerContext oneHandlerContext;

    @Override
    public String create(String type) {
        return ((IOneHandler) oneHandlerContext.getInstance(type)).create(type);
    }

}
