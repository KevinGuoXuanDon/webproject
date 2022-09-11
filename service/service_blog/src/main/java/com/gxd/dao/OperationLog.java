package com.gxd.dao;

import java.util.Date;

/**
    * operation_log
    */
public class OperationLog {
    /**
    * id
    */
    private Long id;

    /**
    * 操作者名
    */
    private String username;

    /**
    * 用户代理
    */
    private String userAgent;

    /**
    * 操作内容
    */
    private String content;

    /**
    * 接口
    */
    private String url;

    /**
    * 调用方式
    */
    private String method;

    /**
    * 调用参数
    */
    private String param;

    /**
    * 创建日期
    */
    private Date createTime;

    /**
    * 操作者ip
    */
    private String ip;

    /**
    * 操作者地址
    */
    private String ipAddress;

    /**
    * 操作者系统
    */
    private String os;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
}