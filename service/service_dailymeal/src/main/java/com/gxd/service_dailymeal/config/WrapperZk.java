package com.gxd.service_dailymeal.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "curator")
public class WrapperZk {
    private int retryCount;
    private int elapsedTime;
    private String connectionString;
    private int sessionTimeOut;
    private int connectionTimeOut;
}
