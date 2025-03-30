package com.example.kafka.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "topic1", groupId = "myGroup")
    // topic1 came from KafkaTopicConfig file & groupId came from application.properties
    public void consume(String message) {
        log.info("Message received: {}", message);

    }
}
