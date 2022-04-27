package com.example.javaskb_springboot.Human;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Stomach implements IStomach{

    private void DoBulkBulk(){
        System.out.println("Я желудок, я делаю бульк-бульк");
    }
    @Override
    public void DigestFood(Object food){
        System.out.println("Я желудок, я перевариваю " + food);
        DoBulkBulk();
    }
    @PostConstruct
    public void PostConstruct(){
        System.out.println("Здоровый желудок создан");
    }
    @PreDestroy
    public void PreDestroy(){
        System.out.println("Здоровый желудок удален");
    }
}
