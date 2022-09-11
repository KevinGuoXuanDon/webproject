package com.gxd.model.entity;

import java.util.Date;

/**
 * @author xuandongguo
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
}
