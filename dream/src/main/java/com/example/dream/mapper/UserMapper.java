package com.example.dream.mapper;

import com.example.dream.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    User getInfoById(String userId);

    User getInfoByIdAndPsd(@Param("userId")String userId, @Param("userPassword")String userPassword);



}
