package com.future.rocket.event.listener;

import com.future.rocket.event.AbstractBaseEventListener;
import com.future.rocket.event.BaseEvent;
import com.future.rocket.event.type.RegisterUserEvent;
import org.springframework.stereotype.Component;

@Component
public class RegisterUserEventListener extends AbstractBaseEventListener {

    @Override
    public void onEvent(BaseEvent baseEvent) {
        Object source = baseEvent.getSource();
        if(source instanceof RegisterUserEvent) {
            System.out.println("事件监听器触发 RegisterUserEvent ==> " + source);
        }
    }
}
