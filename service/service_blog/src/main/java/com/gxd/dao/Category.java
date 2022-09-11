package com.gxd.dao;

import java.util.Date;

/**
    * category
    */
public class Category {
    /**
    * 主键
    */
    private Long id;

    /**
    * 类别
    */
    private String name;

    /**
    * 创建时间
    */
    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}