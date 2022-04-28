package com.example.javaskb_springboot.human.listener;

import com.example.javaskb_springboot.human.events.DigestFoodEvent;
import org.springframework.stereotype.Service;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

@Service
public class TransactionalListener {
    @TransactionalEventListener(phase = TransactionPhase.AFTER_ROLLBACK )
    public void onApplicationEvent(DigestFoodEvent event) {
        System.out.println("TransactionalListener: Поймал событие");
        System.out.println(event.getMessage());
    }
}
