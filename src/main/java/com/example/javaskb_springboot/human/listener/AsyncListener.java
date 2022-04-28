package com.example.javaskb_springboot.human.listener;

import com.example.javaskb_springboot.human.events.StomachFoodEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Async
public class AsyncListener {
    @EventListener
    public void onApplicationEvent(StomachFoodEvent event) throws InterruptedException {
        System.out.println("AsyncListener: Поймал событие");
        Thread.sleep(5000);
        System.out.println(event.getMessage());

    }
}
