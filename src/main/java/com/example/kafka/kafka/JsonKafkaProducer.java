package com.example.kafka.kafka;

import com.example.kafka.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class JsonKafkaProducer {
    private final KafkaTemplate<String, User> kafkaTemplate;

    // Constructor Injection
    public JsonKafkaProducer(KafkaTemplate<String, User> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(User dataObj) {

        Message<User> message1 = MessageBuilder
                .withPayload(dataObj)
                .setHeader(KafkaHeaders.TOPIC, "topic1")
                .build();

        log.info("Message sent {}", dataObj.toString());

        kafkaTemplate.send("topic2", dataObj); // topic name from KafkaTopicConfig
    }
}
