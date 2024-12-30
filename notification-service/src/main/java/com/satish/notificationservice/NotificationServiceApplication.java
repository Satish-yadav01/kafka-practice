package com.satish.notificationservice;

import com.satish.notificationservice.data.request.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class NotificationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotificationServiceApplication.class, args);
        User satish = new User("satish", "satish@123");
        log.info("Satish User: {}", satish.getUserName());
    }

}
