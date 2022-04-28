package com.example.javaskb_springboot.Car.Weel;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Primary
@Profile("test")
public class TestWheel implements IWheel{
    @Override
    public void Spin() {
        System.out.println("Spin the wheel for new revolution method");
    }
}
