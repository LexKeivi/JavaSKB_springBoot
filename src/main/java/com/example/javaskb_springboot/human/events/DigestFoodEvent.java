package com.example.javaskb_springboot.human.events;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

public class DigestFoodEvent extends ApplicationEvent {

    @Getter public String message;
    public DigestFoodEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

}
