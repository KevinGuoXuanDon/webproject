package com.gxd.webproject.model;

import lombok.Data;

@Data
public class User {
    /**
     * 主键
     */
    private Long id;

    private String name;

    private Integer age;

    private String email;
}