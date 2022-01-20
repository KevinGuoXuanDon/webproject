package com.gxd.webproject;

import com.gxd.webproject.dao.impl.UserDaoImpl;
import com.gxd.webproject.mapper.UserMapper;
import com.gxd.webproject.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
class WebprojectApplicationTests {
    //自动装配，把mapper注入到当前类来使用,但是它是个interface，没有具体实现，会报"找不到UserMapper对象"，但是可以运行。
    //如果要，如何解决？ 在UserMapper上加注解，申明对象，可以用component，service或者repository
    @Autowired
    private UserDaoImpl usersMapper;

    //查询User表的所有数据
    @Test
    void find() {
      User users= usersMapper.selectByPrimaryKey(1L);
      System.out.println(users);
    }
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
    @Test
    void testOptismicLock(){
        User user = usersMapper.selectByPrimaryKey(1L);
        user.setAge(100);
        usersMapper.updateByPrimaryKey(user);
    }
}
