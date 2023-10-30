package com.tuts.stockservice.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.tuts.basedomains.dto.OrderEvent;

@Service
public class OrderConsumer {
    @KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "${spring.kafka.consumer.group-id}") // subscribe to
                                                                                                         // topic
    public void consume(OrderEvent event) {
    }
}