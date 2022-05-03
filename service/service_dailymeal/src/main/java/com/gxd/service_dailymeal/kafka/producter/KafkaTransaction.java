package com.gxd.service_dailymeal.kafka.producter;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.*;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;
@Slf4j
public class KafkaTransaction {
    public static void main(String[] args) {
        Properties properties = new Properties();
        // 连接集群
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,"hadoop102:9092");
        // 指定KV的序列化类型, 调用org.apache.kafka.common.serialization方法;
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        // 设置自己写的分区器
        properties.put(ProducerConfig.PARTITIONER_CLASS_CONFIG, "com.gxd.service_dailymeal.kafka.producter");

        properties.put(ProducerConfig.TRANSACTIONAL_ID_CONFIG,"id_1");
        // 生产者开启事务
        KafkaProducer kafkaProducer = new KafkaProducer<String,String>(properties);
        kafkaProducer.initTransactions();
        kafkaProducer.beginTransaction();

        try {
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
            kafkaProducer.commitTransaction();
        }catch (Exception e){
            kafkaProducer.abortTransaction();
        }
        finally {
            // 3. 关闭资源
            kafkaProducer.close();
        }
    }
}
