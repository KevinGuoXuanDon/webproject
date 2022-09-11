package com.gxd.dao;

import java.util.Date;

/**
    * visitor
    */
public class Visitor {
    /**
    * 主键
    */
    private Long id;

    /**
    * 用户标识
    */
    private String uuid;

    /**
    * ip
    */
    private String ip;

    /**
    * ip地址
    */
    private String ipAddress;

    /**
    * Operation System
    */
    private String os;

    /**
    * 最后访问时间
    */
    private Date lastVisit;

    /**
    * 创建时间
    */
    private Date createTIme;

    /**
    * 浏览器
    */
    private String browser;

    /**
    * 浏览次数
    */
    private Long visitCount;

    /**
    * 用户代理
    */
    private String userAgent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public Date getLastVisit() {
        return lastVisit;
    }

    public void setLastVisit(Date lastVisit) {
        this.lastVisit = lastVisit;
    }

    public Date getCreateTIme() {
        return createTIme;
    }

    public void setCreateTIme(Date createTIme) {
        this.createTIme = createTIme;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public Long getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(Long visitCount) {
        this.visitCount = visitCount;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }
}