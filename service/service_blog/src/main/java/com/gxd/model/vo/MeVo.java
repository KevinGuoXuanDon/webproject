package com.gxd.model.vo;

import lombok.Data;

/**
 * @author xuandongguo
 */
@Data
public class MeVo {
    private Long id;
    /**
     * 姓
     */
    private String surname;
    /**
     * 名
     */
    private String givenName;
    /**
     * 英文名
     */
    private String nameEk;
    /**
     * 附加信息
     */
    private String info;
}
