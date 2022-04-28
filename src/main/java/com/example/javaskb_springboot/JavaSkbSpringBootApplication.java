package com.example.javaskb_springboot;

import com.example.javaskb_springboot.human.Human;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaSkbSpringBootApplication {
    static Human human;

    public JavaSkbSpringBootApplication(Human human){
        this.human = human;
    }
    public static void main(String[] args) {
        SpringApplication.run(JavaSkbSpringBootApplication.class, args);
        human.eat("Дошик");
    }

}
