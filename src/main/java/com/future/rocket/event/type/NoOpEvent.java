package com.future.rocket.event.type;

import lombok.Builder;
import lombok.ToString;

import java.io.Serializable;

@Builder
@ToString
public class NoOpEvent implements Serializable {
    private static final long serialVersionUID = 3717619887122463695L;
}
