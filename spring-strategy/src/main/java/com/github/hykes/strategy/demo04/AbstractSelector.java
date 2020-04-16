package com.github.hykes.strategy.demo04;

import java.util.List;

/**
 * @author hehaiyangwork@gmail.com
 * @date 2020-04-16 22:35:00
 */
public abstract class AbstractSelector<K, T> {

    private List<AbstractHandler<K, T>> handlerList;

    public void setHandlerList(List<AbstractHandler<K, T>> handlerList) {
        this.handlerList = handlerList;
    }

    public T create(K k) {
        AbstractHandler<K, T> handler = selectOne(k);
        return handler.create(k);
    }

    public AbstractHandler<K, T> selectOne(K k) {
        AbstractHandler handler = handlerList.stream().filter(it -> it.accept(k)).findFirst().orElse(null);
        if (handler == null) {
            throw new RuntimeException("handler not found");
        }
        return handler;
    }
}
