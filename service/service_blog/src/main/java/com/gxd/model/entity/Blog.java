package com.gxd.model.entity;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xuandongguo
 * 博客实体
 */
public class Blog {
    /**
     * id
     */
    private Long id;
    /**
     * 标题
     */
    private String title;
    /**
     * 图片
     */
    private String pic;
    /**
     * 描述
     */
    private String description;
    /**
     * 正文
     */
    private String content;
    /**
     * 访问权限
     */
    private Boolean accessPermission;
    /**
     * commentEnable
     */
    private Boolean commentEnable;
    /**
     * top
     */
    private Boolean isTop;
    /**
     * 点赞数
     */
    private Integer like;
    /**
     * 评论数
     */
    private Integer commentCount;
    /**
     * 浏览数
     */
    private Integer views;
    /**
     * 被推荐否？
     */
    private Boolean recommended;
    /**
     * 字数统计
     */
    private Integer wordCount;
    /**
     * 类别
     */
    private Long categoryId;
    /**
     * 作者
     */
    private Long authorId;
}
