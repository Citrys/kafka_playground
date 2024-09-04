package com.play.kafka.controllers;

import com.play.kafka.responses.Response;
import com.play.kafka.services.KafkaProducer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    private final KafkaProducer kafkaProducer;

    public MessageController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping("/message")
    public Response sendMessageToKafka(@RequestBody String message) {
       return kafkaProducer.sendMessage(message);
    }
}
