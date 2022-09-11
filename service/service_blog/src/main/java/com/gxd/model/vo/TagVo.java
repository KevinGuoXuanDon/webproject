package com.gxd.model.vo;

import com.gxd.model.vo.BlogVo;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xuandongguo
 */
@Data
public class TagVo {
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
    private List<BlogVo> blogList = new ArrayList<>();
}
