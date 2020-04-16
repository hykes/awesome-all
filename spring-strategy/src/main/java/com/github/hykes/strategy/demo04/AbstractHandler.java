package com.github.hykes.strategy.demo04;

/**
 * @author hehaiyangwork@gmail.com
 * @date 2020-04-16 22:32:00
 */
public abstract class AbstractHandler<K, T> {

    public abstract T create(K k);

    public abstract Boolean accept(K k);

}
