package com.github.hykes.strategy.demo03;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author hehaiyangwork@gmail.com
 * @date 2020-04-15 23:29:00
 */
public abstract class AbstractThreeHandler implements InitializingBean {

    @Autowired
    private ThreeHandlerContext threeHandlerContext;

    @Override
    public void afterPropertiesSet() throws Exception {
        threeHandlerContext.register(this);
    }

    public abstract String create(String type);

    public abstract boolean accept(String type);

}
