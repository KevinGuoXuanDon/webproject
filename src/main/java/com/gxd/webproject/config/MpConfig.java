package com.gxd.webproject.config;

import com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.gxd.webproject.mapper")
public class MpConfig {
    //乐观锁插件
    @Bean
    public OptimisticLockerInnerInterceptor optimisticLockerInnerInterceptor(){
        return new OptimisticLockerInnerInterceptor();
    }
}
