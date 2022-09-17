package com.gxd.mapper;

import com.gxd.model.entity.Blog;

/**
 * @author xuandongguo
 */
public interface BlogMapper {
    /**
     * 根据主键删除
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入博客
     * @param record
     * @return
     */
    int insert(Blog record);

    /**
     * 根据所选条件插入
     * @param record
     * @return
     */
    int insertSelective(Blog record);

    /**
     * 根据主键id获取博客
     * @param id
     * @return
     */
    Blog selectByPrimaryKey(Long id);

    /**
     * 通过主键更新
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Blog record);

    /**
     * 更新博客
     * @param record
     * @return
     */
    int updateByPrimaryKey(Blog record);
}