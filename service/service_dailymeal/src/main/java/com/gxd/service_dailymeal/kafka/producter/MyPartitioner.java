package com.gxd.service_dailymeal.kafka.producter;

import org.apache.kafka.clients.producer.Partitioner;
import org.apache.kafka.common.Cluster;

import java.util.Map;

public class MyPartitioner implements Partitioner {
    @Override
    public int partition(String topic, Object key, byte[] keyBytes, Object value, byte[] valueBytes, Cluster cluster) {
        int partition;

        String valueMsg = valueBytes.toString();
        if (valueMsg.contains("special")) {
            partition = 1;
        }
        else{
            partition = 0;
        }

        return partition;
    }

    @Override
    public void close() {

    }

    @Override
    public void configure(Map<String, ?> configs) {

    }
}
