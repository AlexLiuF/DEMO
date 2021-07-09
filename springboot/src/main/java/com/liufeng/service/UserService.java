package com.liufeng.service;

import com.liufeng.entity.User;
import com.liufeng.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liufeng
 * @create 2021-07-09 11:59
 * @description
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User Sel(int id){
        return userMapper.Sel(id);
    }
}

