package com.future.rocket.event;

import java.util.EventListener;

public interface BaseEventListener extends EventListener {
    //监听器被触发时执行此方法
    void onEvent(BaseEvent baseEvent);
}
