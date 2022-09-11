package com.gxd.dao;

/**
    * blog
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
    private Byte accessPermission;

    /**
    * commentEnable
    */
    private Byte commentEnable;

    /**
    * top
    */
    private Byte isTop;

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
    private Byte recommended;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Byte getAccessPermission() {
        return accessPermission;
    }

    public void setAccessPermission(Byte accessPermission) {
        this.accessPermission = accessPermission;
    }

    public Byte getCommentEnable() {
        return commentEnable;
    }

    public void setCommentEnable(Byte commentEnable) {
        this.commentEnable = commentEnable;
    }

    public Byte getIsTop() {
        return isTop;
    }

    public void setIsTop(Byte isTop) {
        this.isTop = isTop;
    }

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Byte getRecommended() {
        return recommended;
    }

    public void setRecommended(Byte recommended) {
        this.recommended = recommended;
    }

    public Integer getWordCount() {
        return wordCount;
    }

    public void setWordCount(Integer wordCount) {
        this.wordCount = wordCount;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }
}