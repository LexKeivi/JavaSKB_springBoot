package com.example.javaskb_springboot.config;

import com.example.javaskb_springboot.Car.Car;
import lombok.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@Value
@ConstructorBinding
@ConfigurationProperties("car")
public class CarConfig {
    public String name;
    public float enginePower;
    public String carSerialNumber;
}
