package com.satish.loggingservice.listener;

/**
 * @author : Satish Yadav
 * @purpose :
 */
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LoggingListener {

    @KafkaListener(topics = "users", groupId = "logging-group")
    public void consume(String message) {
        System.out.println("Logging user registration: " + message);
    }
}