package com.gxd.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author xuandongguo
 * @description 评论类
 */
public class Comment {
    /**
     * id
     */
    private Long id;
    /**
     * 评论内容
     */
    private String content;
    /**
     * 评论状态
     */
    private Integer status;
    /**
     * 置顶
     */
    private Boolean isTop;
    /**
     * 评论用户昵称
     */
    private String nickname;
    /**
     * 评论的博客id
     */
    private Long blogId;
    /**
     * 评论者的头像
     */
    private String avatar;
    /**
     * 评论者id
     */
    private Long commenterId;
    /**
     * 评论者的链接
     */
    private String href;
    /**
     * 评论者的ip
     */
    private String ip;
    /**
     * 评论的点赞数
     */
    private Integer like;
    /**
     * 父评论id.
     */
    private Long parentId;
    /**
     * 回复这一条评论的子评论
     */
    private List<Comment> subReply = new ArrayList<>();
    /**
     * 外部链接方式,比如qq、微信等授权
     */
    private String outside;
    /**
     * 创建时间
     */
    private Date createTime;
}
