package com.example.javaskb_springboot;

import com.example.javaskb_springboot.Human.Human;
import com.example.javaskb_springboot.Human.IStomach;
import com.example.javaskb_springboot.Human.Stomach;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaSkbSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaSkbSpringBootApplication.class, args);

        Human human = new Human();
        human.Eat("Дошик");
    }

}
