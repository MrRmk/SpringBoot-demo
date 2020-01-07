package com.example.dream.controller;

import com.example.dream.bean.User;
import com.example.dream.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@EnableAutoConfiguration
public class HelloController {

    @Autowired
    UserService userService;

    @RequestMapping("/index")
    public String sayHello(){
        return "index";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/loginIn",method = RequestMethod.POST)
    public String loginIn(@RequestParam("userId") String userId, @RequestParam("userPassword")String userPassword){
        User user = userService.getInfoByIdAndPsd(userId, userPassword);
        if(user !=null){
            return "success";
        }else{
            return "error";
        }
    }


}
