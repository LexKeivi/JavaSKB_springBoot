package com.example.javaskb_springboot.Human;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
@Component
public class Human {
    @Autowired
    private IStomach stomach;

    public void Eat(Object food){
        stomach.DigestFood(food);
    }
}
