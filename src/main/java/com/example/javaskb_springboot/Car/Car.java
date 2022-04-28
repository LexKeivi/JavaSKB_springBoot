package com.example.javaskb_springboot.Car;

import com.example.javaskb_springboot.Car.Weel.IWheel;
import com.example.javaskb_springboot.config.CarConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;


@EnableConfigurationProperties(CarConfig.class)
@Component
public class Car {
    public String name;
    private float enginePower;
    private String carSerialNumber;

    public IWheel wheel;

    public Car(CarConfig carConfig, @Qualifier("secondWheel") IWheel wheel){
        name = carConfig.name;
        enginePower = carConfig.enginePower;
        carSerialNumber = carConfig.carSerialNumber;
        this.wheel = wheel;
    }

    public String GetStats() {
        return "Модель: " + name + " - " + carSerialNumber + ", " + enginePower + " у.е.мощи";
    }
}
