package com.gxd.service_dailymeal.dto;


import lombok.Data;

/**
 * 日志类，用作切面输出模板
 */
@Data
public class WebLog {
    // 描述
    private String description;
    // 用户名
    private String username;
    // 开始时长
    private Long startTime;
    // 花费时长
    private Integer spendTime;
    // 根路径
    private String basePath;
    // url
    private String url;
    // 请求方法
    private String method;
    // ip
    private String ip;
    // 请求参数
    private Object parameter;
    // 返回结果
    private Object res;
}
