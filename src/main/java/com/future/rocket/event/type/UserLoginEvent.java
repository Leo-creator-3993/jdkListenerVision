package com.future.rocket.event.type;

import lombok.Builder;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;

@Builder
@ToString
public class UserLoginEvent implements Serializable {
    private static final long serialVersionUID = -8593247031790541018L;

    private String userName;
    private LocalDateTime loginTime;
}
