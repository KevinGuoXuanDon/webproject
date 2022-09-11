package com.gxd.model.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author xuandongguo
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

    private List<Blog> blogList = new ArrayList<>();
}
