package com.liufeng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author liufeng
 * @create 2021-07-09 11:55
 * @description
 */
@SpringBootApplication
@MapperScan("com.liufeng.mapper")//扫描的mapper
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
