package com.github.hykes.strategy.demo02;

/**
 * @author hehaiyangwork@gmail.com
 * @date 2020-04-15 22:56:00
 */
public interface ITwoHandler {

    String create(String type);

    boolean accept(String type);

}
