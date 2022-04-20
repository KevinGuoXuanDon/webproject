package com.gxd.service_dailymeal;

import lombok.extern.slf4j.Slf4j;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.api.CreateModable;
import org.apache.curator.framework.recipes.cache.NodeCache;
import org.apache.curator.framework.recipes.cache.NodeCacheListener;
import org.apache.curator.framework.recipes.locks.InterProcessLock;
import org.apache.curator.framework.recipes.locks.InterProcessReadWriteLock;
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
