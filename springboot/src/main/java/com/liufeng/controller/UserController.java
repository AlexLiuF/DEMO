package com.liufeng.controller;

import com.liufeng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liufeng
 * @create 2021-07-09 12:00
 * @description
 */
@RestController
@RequestMapping("/testBoot")
public class UserController {
  @Autowired
    private UserService userService;

    @GetMapping("getUser/{id}")
    public String GetUser(@PathVariable int id){
        System.err.println("11111111111111111111 = ");
        return userService.Sel(id).toString();
    }
}

