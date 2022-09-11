package com.gxd.controller;
import com.gxd.dao.Me;
import com.gxd.service.impl.MeServiceImplImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
* (me)表控制层
*
* @author xxxxx
*/
@RestController
@RequestMapping("/me")
public class MeController {
/**
* 服务对象
*/
@Resource
private MeServiceImpl meServiceImpl;

/**
* 通过主键查询单条数据
*
* @param id 主键
* @return 单条数据
*/
@GetMapping("selectOne")
public Me selectOne(Integer id) {
return meServiceImpl.selectByPrimaryKey(id);
}

}
