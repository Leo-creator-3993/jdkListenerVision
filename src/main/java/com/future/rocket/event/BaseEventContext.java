package com.future.rocket.event;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BaseEventContext {

    private final List<BaseEventListener> listenerList;

    public BaseEventContext() {
        listenerList = new ArrayList<>();
    }

    //增加事件监听器
    void addEventListener(BaseEventListener eventListener) {
        listenerList.add(eventListener);
        System.out.println(" ==Debug== listenerList ==>" + listenerList);
    }


    //发布事件同时调用其onEvent()方法
    public void publishEvent(BaseEvent event) {
        listenerList.stream()
                .forEach(listener -> {
                    listener.onEvent(event);
                });
    }
}
