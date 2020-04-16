package com.github.hykes.strategy.demo01;

/**
 * @author hehaiyangwork@gmail.com
 * @date 2020-04-15 22:53:00
 */
public interface IOrderService {

    /**
     * 根据不同类型创建订单
     * @param type
     * @return
     */
    String create(String type);

}
