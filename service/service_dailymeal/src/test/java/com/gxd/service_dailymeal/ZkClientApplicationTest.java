package com.gxd.service_dailymeal;

import lombok.extern.slf4j.Slf4j;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.recipes.cache.NodeCache;
import org.apache.curator.framework.recipes.cache.NodeCacheListener;
import org.apache.curator.framework.recipes.locks.InterProcessLock;
import org.apache.curator.framework.recipes.locks.InterProcessReadWriteLock;
import org.apache.curator.retry.RetryNTimes;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class ZkClientApplicationTest {
    @Autowired
    CuratorFramework curatorFramework;


    @Test
    public void connectionTest() {
        try {
            String connectionString = "127.0.0.1:2181";
            CuratorFramework client = CuratorFrameworkFactory.newClient(
                    connectionString,
                    10000,
                    10000,
                    new RetryNTimes(10, 5000)
            );
            client.start();
            Thread.sleep(10000000);
            client.close();
        }
        catch (Exception e){
            System.out.println(e);
        }

    }

    @Test
    public void createNodes() throws Exception{
        String path = curatorFramework.create().forPath("/ttttest");
        System.in.read();
    }
    @Test
    public void addNodeListener() throws Exception {
        NodeCache nodeCache = new NodeCache(curatorFramework,"/ttttest");
        nodeCache.getListenable().addListener(new NodeCacheListener() {
            @Override
            public void nodeChanged() throws Exception {
                log.info("{} path changed: ","/ttttest");
            }
        });
        nodeCache.start();
        System.in.read();
    }

    @Test
    public void getReadLock() throws Exception{
        // ReadWriteLock
        InterProcessReadWriteLock interProcessReadWriteLock = new InterProcessReadWriteLock(curatorFramework,"/test");
        InterProcessLock lock = interProcessReadWriteLock.readLock();
        System.out.println("Waiting for readLock");
        lock.acquire();
        System.out.println("Get read lcok");
        // stimulate opera
        for(int i=0;i<10;i++){
            Thread.sleep(300);
        }
        lock.release();
    }
    @Test
    public void getWriteLock() throws Exception{
        // ReadWriteLock
        InterProcessReadWriteLock interProcessReadWriteLock = new InterProcessReadWriteLock(curatorFramework,"/test");
        InterProcessLock lock = interProcessReadWriteLock.writeLock();
        System.out.println("Waiting for readLock");
        lock.acquire();
        System.out.println("Get read lcok");
        // stimulate opera
        for(int i=0;i<10;i++){
            Thread.sleep(300);
        }
        lock.release();
    }
}
