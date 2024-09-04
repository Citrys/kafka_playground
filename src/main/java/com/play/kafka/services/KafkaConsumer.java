package com.play.kafka.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "first-topic", groupId = "your-consumer-group-id")
    public void consumeMessage(String message) {
        System.out.println("Received message: " + message);
    }
}
