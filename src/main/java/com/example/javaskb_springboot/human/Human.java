package com.example.javaskb_springboot.human;

import com.example.javaskb_springboot.human.events.EatenFoodEvent;
import com.example.javaskb_springboot.human.stomach.IStomach;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class Human {

    private final IStomach _stomach;
    private final ApplicationEventPublisher publisher;

    public Human(IStomach stomach, ApplicationEventPublisher publisher){
        _stomach = stomach;
        this.publisher = publisher;
    }

    public void eat(Object food){
        publisher.publishEvent(new EatenFoodEvent(this, food.toString() + " съедено"));
        _stomach.digestFood(food);
    }
}