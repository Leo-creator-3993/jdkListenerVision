package com.future.rocket.event;

import java.io.Serializable;
import java.util.EventObject;

public class BaseEvent extends EventObject implements Serializable {

    private static final long serialVersionUID = 8994636528698020472L;

    public BaseEvent(Object source) {
        super(source);
    }
}
