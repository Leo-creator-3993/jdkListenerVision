package com.future.rocket.event;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public abstract class AbstractBaseEventListener implements InitializingBean, BaseEventListener {
    @Autowired
    private BaseEventContext baseEventContext;

    //子类将被自动添加到监听列表中
    @Override
    public void afterPropertiesSet() {
        System.out.println("Bean 后置初始化新增监听器 ==> " + this);
        baseEventContext.addEventListener(this);
    }
}