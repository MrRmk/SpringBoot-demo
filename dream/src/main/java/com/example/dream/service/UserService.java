package com.example.dream.service;

import com.example.dream.bean.User;

public interface UserService {

    User getInfoById(String userId);

    User getInfoByIdAndPsd(String userId, String userPassword);

}
