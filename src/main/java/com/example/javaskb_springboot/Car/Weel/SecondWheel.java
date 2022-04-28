package com.example.javaskb_springboot.Car.Weel;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnBean(name = "TestWheel")
public class SecondWheel implements IWheel{
    @Override
    public void Spin() {
        System.out.println("Spin second wheel");
    }
}
