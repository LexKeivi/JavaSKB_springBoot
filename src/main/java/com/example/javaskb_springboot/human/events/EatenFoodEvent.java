package com.example.javaskb_springboot.human.events;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

public class EatenFoodEvent extends ApplicationEvent {

    @Getter public String message;
    public EatenFoodEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

}
