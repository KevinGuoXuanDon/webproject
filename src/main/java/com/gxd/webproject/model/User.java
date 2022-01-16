package com.gxd.webproject.model;

import lombok.Data;

//@Data 默认实现了get和set方法
@Data
public class User {
    private long id;
    private String name;
    private Integer age;
    private String email;
}
