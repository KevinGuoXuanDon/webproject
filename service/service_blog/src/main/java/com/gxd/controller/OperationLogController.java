package com.gxd.controller;

import com.gxd.service.impl.OperationLogServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (operation_log)表控制层
 *
 * @author xxxxx
 */
@RestController
@RequestMapping("/operation_log")
public class OperationLogController {
    /**
     * 服务对象
     */
    @Resource
    private OperationLogServiceImpl operationLogServiceImpl;

/**
 * 通过主键查询单条数据
 *
 * @param id 主键
 * @return 单条数据
 */
//@GetMapping("selectOne")
//public OperationLog selectOne(Integer id) {
//return operationLogServiceImpl.selectByPrimaryKey(id);
//}

}
