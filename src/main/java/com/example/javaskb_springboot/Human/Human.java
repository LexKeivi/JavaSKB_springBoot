package com.example.javaskb_springboot.Human;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
@Component

public class Human {

    @Autowired
    private @Qualifier("stomach") IStomach _stomach;

    public void Eat(Object food){
        _stomach.DigestFood(food);
    }
}
