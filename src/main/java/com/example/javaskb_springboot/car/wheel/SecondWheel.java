package com.example.javaskb_springboot.car.wheel;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnBean(name = "TestWheel")
public class SecondWheel implements IWheel{
    @Override
    public void spin() {
        System.out.println("Spin second wheel");
    }
}
