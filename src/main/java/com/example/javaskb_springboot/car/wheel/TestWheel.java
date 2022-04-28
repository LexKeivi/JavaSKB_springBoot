package com.example.javaskb_springboot.car.wheel;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Primary
@Profile("test")
public class TestWheel implements IWheel{
    @Override
    public void spin() {
        System.out.println("Spin the wheel for new revolution method");
    }
}
