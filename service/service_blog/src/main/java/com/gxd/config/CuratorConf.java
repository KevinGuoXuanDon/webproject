package com.gxd.config;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.RetryNTimes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CuratorConf {
    @Autowired
    private WrapperZk wrapperZk;

    @Bean(initMethod ="start")
    public CuratorFramework CuratorFramework(){
        return CuratorFrameworkFactory.newClient(
                wrapperZk.getConnectionString(),
                wrapperZk.getSessionTimeOut(),
                wrapperZk.getConnectionTimeOut(),
                new RetryNTimes(wrapperZk.getRetryCount(), wrapperZk.getElapsedTime())
        );
    }
}
