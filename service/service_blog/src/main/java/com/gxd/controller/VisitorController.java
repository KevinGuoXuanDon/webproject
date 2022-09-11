package com.gxd.controller;
import com.gxd.dao.Visitor;
import com.gxd.service.impl.VisitorServiceImplImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
* (visitor)表控制层
*
* @author xxxxx
*/
@RestController
@RequestMapping("/visitor")
public class VisitorController {
/**
* 服务对象
*/
@Resource
private VisitorServiceImpl visitorServiceImpl;

/**
* 通过主键查询单条数据
*
* @param id 主键
* @return 单条数据
*/
@GetMapping("selectOne")
public Visitor selectOne(Integer id) {
return visitorServiceImpl.selectByPrimaryKey(id);
}

}
