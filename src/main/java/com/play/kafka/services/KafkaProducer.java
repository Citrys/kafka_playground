package com.play.kafka.services;
import com.play.kafka.responses.Response;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public Response sendMessage(String message) {
        String TOPIC_NAME = "first-topic";
        try {
            kafkaTemplate.send(TOPIC_NAME, message);
            return new Response("OK");
        } catch (Exception ignored) {
            return new Response("Failed to send");
        }
    }
}
