package com.gxd.dao;

import java.util.Date;

/**
    * comment
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
    private Byte isTop;

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
    * 外部链接方式,比如qq、微信等授权
    */
    private String outside;

    /**
    * 创建时间
    */
    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Byte getIsTop() {
        return isTop;
    }

    public void setIsTop(Byte isTop) {
        this.isTop = isTop;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Long getBlogId() {
        return blogId;
    }

    public void setBlogId(Long blogId) {
        this.blogId = blogId;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Long getCommenterId() {
        return commenterId;
    }

    public void setCommenterId(Long commenterId) {
        this.commenterId = commenterId;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getOutside() {
        return outside;
    }

    public void setOutside(String outside) {
        this.outside = outside;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}