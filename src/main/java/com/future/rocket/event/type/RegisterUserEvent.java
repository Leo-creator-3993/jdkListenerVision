package com.future.rocket.event.type;

import lombok.Builder;
import lombok.ToString;

import java.io.Serializable;

@Builder
@ToString
public class RegisterUserEvent implements Serializable {
    private static final long serialVersionUID = 1768057956391320087L;

    private String userName;
    private int age;
    private String gender;
}
