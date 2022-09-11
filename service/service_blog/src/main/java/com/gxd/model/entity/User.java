package com.gxd.model.entity;

import java.util.Date;
import lombok.Data;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @author xuandongguo
 */
@Data
public class User{
    /**
     * 主键id
     */
    private Long id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 可修改昵称
     */
    private String nickname;
    /**
     * 头像信息
     */
    private String profile;
    /**
     * 邮箱地址
     */
    private String email;
    /**
     * 创建时间
     */
    private Date createDate;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 权限角色
     */
    private String authority;

}
