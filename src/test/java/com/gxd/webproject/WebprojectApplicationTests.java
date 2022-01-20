package com.gxd.webproject;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gxd.webproject.dao.impl.UserDaoImpl;
import com.gxd.webproject.mapper.TestMapper;
import com.gxd.webproject.mapper.UserMapper;
import com.gxd.webproject.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class WebprojectApplicationTests {
    //自动装配，把mapper注入到当前类来使用,但是它是个interface，没有具体实现，会报"找不到UserMapper对象"，但是可以运行。
    //如果要，如何解决？ 在UserMapper上加注解，申明对象，可以用component，service或者repository
    @Autowired
    private UserDaoImpl usersMapper;

    @Autowired
    private TestMapper mapper;
    //查询User表的测试
    @Test
    void find() {
      User users= usersMapper.selectByPrimaryKey(1L);
      System.out.println(users);
    }
    //插入测试
    @Test
    void test(){
        User user = new User();
        user.setAge(30);
        user.setEmail("");
        user.setName("K");
        //如果不写id，则mybatis_plus会随机生成id
        int insert = usersMapper.insert(user);
        System.out.println(insert);
    }
    //乐观锁测试
    @Test
    void testOptismicLock(){
        User user = usersMapper.selectByPrimaryKey(1L);
        user.setAge(100);
        usersMapper.updateByPrimaryKey(user);
    }
    //分页查询
    @Test
    void getByBatchIds(){
        Page<User> page = new Page<>();
        //把所有数据封装到Page里
        mapper.selectPage(page,null);
        System.out.println(page.getCurrent());
    }
    //条件查询测试
    @Test
    void testBaseMapper(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
    }
}
