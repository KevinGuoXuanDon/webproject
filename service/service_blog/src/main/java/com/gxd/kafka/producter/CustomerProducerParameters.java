package com.gxd.kafka.producter;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

public class CustomerProducerParameters {
    public static void main(String[] args) {
        // conf
        Properties properties = new Properties();

        // connector
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,"hadoop102:9092");

        // serializer
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        // partitioner
        properties.put(ProducerConfig.PARTITIONER_CLASS_CONFIG,"com.gxd.service_dailymeal.kafka.producter");

        // buffer default 32m, now is 64m
        properties.put(ProducerConfig.BUFFER_MEMORY_CONFIG,33554432*2);

        // Batch size default is 16k, now is 32k
        properties.put(ProducerConfig.BATCH_SIZE_CONFIG, 16384*2);

        // lingers default 5ms
        properties.put(ProducerConfig.LINGER_MS_CONFIG,5);

        // compression model : snappy
        properties.put(ProducerConfig.COMPRESSION_TYPE_CONFIG, "snappy");

        // ack： default is all, now is 1
        properties.put(ProducerConfig.ACKS_CONFIG,"1");

        // retries: use with ack. When kafka failed to response to clients, clients will retry
        // default Integer.MAX_VALUE, now is 5
        properties.put(ProducerConfig.RETRIES_CONFIG,"5");

        // create producer
        KafkaProducer<String,String> producer = new KafkaProducer<String, String>(properties);

        // send data
        for (int i = 0; i < 50; i++) {
            producer.send(new ProducerRecord<>("topic","special"+i));
        }
        // close
        producer.close();;
    }
}
