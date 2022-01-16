package com.gxd.webproject.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxd.webproject.model.User;
import org.springframework.stereotype.Repository;

//这里使用了通用mapper，可以点击进去查看，它实现了底层的一些通用方法如增删改查，但是无法自定义，所以还是少用.

@Repository
public interface UserMapper extends BaseMapper<User> {

}
