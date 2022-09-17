package com.gxd.mapper;

import com.gxd.model.entity.Category;

/**
 * @author xuandongguo
 */
public interface CategoryMapper {
    /**
     * 通过主键删除类别
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入类别
     * @param record
     * @return
     */
    int insert(Category record);

    /**
     * 插入所选字段
     * @param record
     * @return
     */
    int insertSelective(Category record);

    /**
     * 更具主键查询
     * @param id
     * @return
     */
    Category selectByPrimaryKey(Long id);

    /**
     * 更具主键修改部分字段
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Category record);

    /**
     * 更具主键修改
     * @param record
     * @return
     */
    int updateByPrimaryKey(Category record);
}