package com.cskaoyan.mall.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by HorseXInsect
 * 2019/5/22 21:26
 */
@RestController
public class TestController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
