package com.liufeng.entity;

import lombok.Data;

/**
 * @author liufeng
 * @create 2021-07-09 11:51
 * @description 实体类User
 */
@Data
public class User {
    private Integer id;
    private String userName;
    private String passWord;
    private String realName;
}
