package com.gxd.model.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xuandongguo
 * 文章标签类
 */
@Data
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
    /**
     * 标签对应的博客列表
     */
    private List<Blog> blogList = new ArrayList<>();

}
