package com.example.javaskb_springboot;

import com.example.javaskb_springboot.human.Human;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@Configuration
@EnableAsync
public class JavaSkbSpringBootApplication {
    public static Human human;

    public JavaSkbSpringBootApplication(Human human){
        JavaSkbSpringBootApplication.human = human;
    }
    public static void main(String[] args) {
        SpringApplication.run(JavaSkbSpringBootApplication.class, args);
        human.eat("Яблоко");
    }

}
