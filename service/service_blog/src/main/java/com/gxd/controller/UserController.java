package com.gxd.controller;
import com.gxd.dao.User;
import com.gxd.service.impl.UserServiceImplImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
* (user)表控制层
*
* @author xxxxx
*/
@RestController
@RequestMapping("/user")
public class UserController {
/**
* 服务对象
*/
@Resource
private UserServiceImpl userServiceImpl;

/**
* 通过主键查询单条数据
*
* @param id 主键
* @return 单条数据
*/
@GetMapping("selectOne")
public User selectOne(Integer id) {
return userServiceImpl.selectByPrimaryKey(id);
}

}
