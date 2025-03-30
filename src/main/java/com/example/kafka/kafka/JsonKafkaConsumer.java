package com.example.kafka.kafka;

import com.example.kafka.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class JsonKafkaConsumer {
    @KafkaListener(topics = "topic2", groupId = "myGroup")
    // topic2 came from KafkaTopicConfig file & groupId came from application.properties
    public void consume(User user) {
        log.info("Json Message received: {}", user.toString());
    }
}
