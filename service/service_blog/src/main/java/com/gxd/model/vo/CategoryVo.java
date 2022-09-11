package com.gxd.model.vo;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author xuandongguo
 */
@Data
public class CategoryVo {
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

    private List<BlogVo> blogList = new ArrayList<>();
}
