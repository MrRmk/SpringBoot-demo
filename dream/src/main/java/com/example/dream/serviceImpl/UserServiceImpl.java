package com.example.dream.serviceImpl;

import com.example.dream.bean.User;
import com.example.dream.mapper.UserMapper;
import com.example.dream.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    //将DAO注入Service层
    @Autowired(required = false)
    private UserMapper userMapper;

    @Override
    public User getInfoById(String userId) {
        return userMapper.getInfoById(userId);
    }

    @Override
    public User getInfoByIdAndPsd(String userId, String userPassword) {
        return userMapper.getInfoByIdAndPsd(userId,userPassword);
    }
}
