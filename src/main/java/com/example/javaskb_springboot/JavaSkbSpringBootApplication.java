package com.example.javaskb_springboot;

import com.example.javaskb_springboot.car.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaSkbSpringBootApplication {
    public static Car car;

    public JavaSkbSpringBootApplication(Car car){
        this.car = car;
    }
    public static void main(String[] args) {
        SpringApplication.run(JavaSkbSpringBootApplication.class, args);
        System.out.println(car.getStats());
        car.wheel.spin();
    }
}
