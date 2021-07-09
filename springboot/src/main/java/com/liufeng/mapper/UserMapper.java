package com.liufeng.mapper;

import com.liufeng.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author liufeng
 * @create 2021-07-09 11:58
 * @description
 */
@Mapper
public interface UserMapper {

    User Sel(int id);
}

