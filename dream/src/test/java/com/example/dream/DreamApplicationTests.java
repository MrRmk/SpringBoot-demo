package com.example.dream;

import com.example.dream.bean.User;
import com.example.dream.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.SQLOutput;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DreamApplicationTests {

    @Autowired
    UserService userService;

    @Test
    public void contextLoads() {
        User user = userService.getInfoById("14201101");
        System.out.println("该用户名字是：");
        if(user!=null) {
            System.out.println(user.getUserRealName());
        }else{
            System.out.println("user对象为空！！系统异常！！");
        }
    }

}
