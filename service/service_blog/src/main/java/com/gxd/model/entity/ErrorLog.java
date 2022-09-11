package com.gxd.model.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author xuandongguo
 */
@Data
public class ErrorLog {
    /**
     * 异常id
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
     * 错误内容
     */
    private String content;
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
}
