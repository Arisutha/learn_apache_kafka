/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2021 All Rights Reserved.
 */
package com.demo.app;

import java.util.Properties;
import java.util.logging.LogManager;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.IntegerSerializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author muhammad suta (muhammad.suta@dana.id)
 * @version $Id: StorageDemo.java, v 0.1 2021‐12‐11 05.27 muhammad suta (muhammad.suta@dana.id) Exp $$
 */
public class StorageDemo {

    private static final Logger logger = LoggerFactory.getLogger(StorageDemo.class);

    public static void main(String[] args) {
        logger.info("Creating Kafka Producers...");
        Properties props = new Properties();
        props.put(ProducerConfig.CLIENT_ID_CONFIG, AppConfigs.applicationID);
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, AppConfigs.bootsrapServers);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, IntegerSerializer.class.getName());
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        KafkaProducer<Integer, String> producer = new KafkaProducer<Integer, String>(props);
        logger.info("Start sending messages,,,");

        for (int i = 1; i<=AppConfigs.sumEvents; i++){
            producer.send(new ProducerRecord<Integer, String>(AppConfigs.topicName, i, "Simple Message = " + i));
        }

        logger.info("done sending messages,,,");
    }

}