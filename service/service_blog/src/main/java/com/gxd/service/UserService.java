package com.gxd.service;

import com.gxd.model.entity.User;

/**
 * @author: Xuandong Guo
 */
public interface UserService {

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}
