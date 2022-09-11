package com.gxd.util.producter;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.*;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;
@Slf4j
public class CustomerProducerCallBack {
    public static void main(String[] args) {
        Properties properties = new Properties();
        // 连接集群
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,"hadoop102:9092");
        // 指定KV的序列化类型, 调用org.apache.kafka.common.serialization方法;
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        // 设置自己写的分区器
        properties.put(ProducerConfig.PARTITIONER_CLASS_CONFIG, "com.gxd.service_dailymeal.kafka.producter");

        // 1. 生产者
        KafkaProducer kafkaProducer = new KafkaProducer<String,String>(properties);
        // 2. 发送数据，可以选择回调或者普通
        for(int i=0;i<5;i++) {
            kafkaProducer.send(new ProducerRecord<>("first", "value" + i, new Callback() {
                @Override
                public void onCompletion(RecordMetadata metadata, Exception exception) {
                    if(exception==null){
                        log.info("topic： "+metadata.topic()+" parition: "+metadata.partition());
                    }
                }
            }));
        }
        // 3. 关闭资源
        kafkaProducer.close();
    }
}
