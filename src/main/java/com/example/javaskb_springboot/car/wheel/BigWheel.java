package com.example.javaskb_springboot.car.wheel;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnExpression("'${car.name}' != 'default'")
public class BigWheel implements IWheel{

    @Override
    public void spin() {
        System.out.println("spin big wheel");
    }
}
