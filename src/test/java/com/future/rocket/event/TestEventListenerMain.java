package com.future.rocket.event;

import com.future.rocket.event.type.NoOpEvent;
import com.future.rocket.event.type.RegisterUserEvent;
import com.future.rocket.event.type.UserLoginEvent;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;

public class TestEventListenerMain {

    @Test
    public void test0() {
        System.out.println("hi");
    }

    @Test
    public void test1() {
        System.out.println("==> Spring 容器开始启动...");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MainConfig.class);
        context.refresh();
        System.out.println("==> Spring 容器启动结束!");

        //发布用户注册事件
        BaseEventContext baseEventContext = context.getBean(BaseEventContext.class);
        baseEventContext.publishEvent(new BaseEvent(RegisterUserEvent.builder()
                .userName("Leo")
                .age(18)
                .gender("Male")
                .build()));

        //发布登录事件
        baseEventContext.publishEvent(new BaseEvent(UserLoginEvent.builder()
                .userName("Leo")
                .loginTime(LocalDateTime.now())
                .build()));

        //发布NoOp事件
        baseEventContext.publishEvent(new BaseEvent(NoOpEvent.builder().build()));
    }
}
