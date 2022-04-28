package com.example.javaskb_springboot.human;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Stomach implements IStomach{

    private void DoBulkBulk(){
        System.out.println("Я желудок, я делаю бульк-бульк");
    }
    @Override
    public void digestFood(Object food){
        System.out.println("Я желудок, я перевариваю " + food);
        DoBulkBulk();
    }
    @PostConstruct
    public void postConstruct(){
        System.out.println("Здоровый желудок создан");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("Здоровый желудок удален");
    }
}
