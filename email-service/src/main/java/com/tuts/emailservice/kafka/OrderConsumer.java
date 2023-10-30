package com.tuts.emailservice.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.tuts.basedomains.dto.OrderEvent;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class OrderConsumer {
    @KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "${spring.kafka.consumer.group-id}") // subscribe to
                                                                                                         // topic
    public void consume(OrderEvent event) {
        log.info("Order event received in email service: " + event.toString());
    }
}