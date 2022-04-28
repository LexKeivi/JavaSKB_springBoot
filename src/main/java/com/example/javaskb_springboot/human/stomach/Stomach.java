package com.example.javaskb_springboot.human.stomach;

import com.example.javaskb_springboot.human.events.DigestFoodEvent;
import com.example.javaskb_springboot.human.events.EatenFoodEvent;
import com.example.javaskb_springboot.human.events.StomachFoodEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class Stomach implements IStomach{
    @Autowired
    @Lazy
    Stomach stomach;
    private final ApplicationEventPublisher publisher;

    public Stomach(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public void digestFood(Object food){
        System.out.println(food.toString() + " попало в желудок");
        publisher.publishEvent(new StomachFoodEvent(this, food + " переварилось"));
        stomach.nextStep(food);
        stomach.nextNextStep(food);
    }
    @Transactional
    public void nextStep(Object digestedFood){
        publisher.publishEvent(new DigestFoodEvent(this, digestedFood + " пошло на следущий шаг цикла :)"));
    }
    @Transactional
    public void nextNextStep(Object digestedDigestedFood) {
        publisher.publishEvent(new DigestFoodEvent(this, digestedDigestedFood + " пошло на следущий следущий шаг цикла :))"));
        throw new RuntimeException();
    }
}