package com.gxd.dao;

/**
    * me
    */
public class Me {
    /**
    * 主键
    */
    private Long id;

    /**
    * 姓
    */
    private String surname;

    /**
    * 名
    */
    private String givenName;

    /**
    * 英文名
    */
    private String nameEk;

    /**
    * 附加信息
    */
    private String info;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getNameEk() {
        return nameEk;
    }

    public void setNameEk(String nameEk) {
        this.nameEk = nameEk;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}