package com.oyeks.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class kafkaMessageListener {

    Logger logger = LoggerFactory.getLogger(kafkaMessageListener.class);

    /**
     *
     Note that in real time, you should not write your consumers like this.
     */

    @KafkaListener(topics = "oyeks-topic", groupId = "oyeks-group")
    public void consume1(String message){

        logger.info("Consumer1 consume the message {}", message);

    }
    @KafkaListener(topics = "oyeks-topic", groupId = "oyeks-group")
    public void consume2(String message){

        logger.info("Consumer2 consume the message {}", message);

    }
    @KafkaListener(topics = "oyeks-topic", groupId = "oyeks-group")
    public void consume3(String message){

        logger.info("Consumer3 consume the message {}", message);

    }
    @KafkaListener(topics = "oyeks-topic", groupId = "oyeks-group")
    public void consume4(String message){

        logger.info("Consumer4 consume the message {}", message);

    }
}
