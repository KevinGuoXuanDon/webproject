package com.gxd.dao;

/**
    * tag
    */
public class Tag {
    /**
    * id
    */
    private Long id;

    /**
    * 标签名
    */
    private String name;

    /**
    * 标签的标记
    */
    private String mark;

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

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}