package com.example.javaskb_springboot.human.events;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

public class StomachFoodEvent extends ApplicationEvent {

    @Getter
    public String message;

    public StomachFoodEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

}
