package com.satish.notificationservice.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * @author : Satish Yadav
 * @purpose :
 */

@Service
public class NotificationListener {

    @KafkaListener(topics = "users", groupId = "notification-group")
    public void consume(String message) {
        System.out.println("Sending notification for: " + message);
    }
}

