package com.gxd.webproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@MapperScan能够扫描对应包的mapper接口，并且找到它的实现类

@SpringBootApplication
@ComponentScan(basePackages = {"com.gxd"})
@MapperScan("com.gxd.webproject.mapper")
public class WebprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebprojectApplication.class, args);
    }

}
