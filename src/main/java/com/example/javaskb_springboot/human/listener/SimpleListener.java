package com.example.javaskb_springboot.human.listener;

import com.example.javaskb_springboot.human.events.EatenFoodEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class SimpleListener{
    @EventListener
    public void onApplicationEvent(EatenFoodEvent event) {
        System.out.println("SimpleListener: Поймал событие");
        System.out.println(event.getMessage());
    }
}
