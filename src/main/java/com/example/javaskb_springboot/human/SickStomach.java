package com.example.javaskb_springboot.human;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class SickStomach implements IStomach{

    private void doBulkBulk(){
        System.out.println("Я больной желудок, я делаю грустные бульк-бульк");
    }
    @Override
    public void digestFood(Object food){
        System.out.println("Я больной желудок, я кое как пытаюсь переваривать " + food);
        doBulkBulk();
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Больной желудок создан");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Больной желудок удален");
    }
}
