package com.future.rocket.event.listener;

import com.future.rocket.event.AbstractBaseEventListener;
import com.future.rocket.event.BaseEvent;
import com.future.rocket.event.type.UserLoginEvent;
import org.springframework.stereotype.Component;

@Component
public class UserLoginEventListener extends AbstractBaseEventListener {
    @Override
    public void onEvent(BaseEvent baseEvent) {
        Object source = baseEvent.getSource();
        if(source instanceof UserLoginEvent) {
            System.out.println("事件监听器触发 UserLoginEvent ==> " + source);
        }
    }
}
