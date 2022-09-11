package com.gxd.controller;
import com.gxd.dao.ErrorLog;
import com.gxd.service.impl.ErrorLogServiceImplImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
* (error_log)表控制层
*
* @author xxxxx
*/
@RestController
@RequestMapping("/error_log")
public class ErrorLogController {
/**
* 服务对象
*/
@Resource
private ErrorLogServiceImpl errorLogServiceImpl;

/**
* 通过主键查询单条数据
*
* @param id 主键
* @return 单条数据
*/
@GetMapping("selectOne")
public ErrorLog selectOne(Integer id) {
return errorLogServiceImpl.selectByPrimaryKey(id);
}

}
