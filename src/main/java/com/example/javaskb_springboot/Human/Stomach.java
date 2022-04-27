package com.example.javaskb_springboot.Human;

import org.springframework.stereotype.Component;

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
}
