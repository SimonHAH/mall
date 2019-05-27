package com.cskaoyan.wx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author Nemo
 * @version 1.0
 * @date 2019/5/27
 * 启动入口
 */
@SpringBootApplication
@MapperScan(value = "com.cskaoyan.mall.mapper")
public class WxApplication {
    public static void main(String[] args) {
        SpringApplication.run(WxApplication.class, args);
    }
}
