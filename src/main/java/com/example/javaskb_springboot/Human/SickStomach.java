package com.example.javaskb_springboot.Human;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class SickStomach implements IStomach{

    private void DoBulkBulk(){
        System.out.println("Я больной желудок, я делаю грустные бульк-бульк");
    }
    @Override
    public void DigestFood(Object food){
        System.out.println("Я больной желудок, я кое как пытаюсь переваривать " + food);
        DoBulkBulk();
    }

    @PostConstruct
    public void PostConstruct(){
        System.out.println("Больной желудок создан");
    }

    @PreDestroy
    public void PreDestroy(){
        System.out.println("Больной желудок удален");
    }
}
