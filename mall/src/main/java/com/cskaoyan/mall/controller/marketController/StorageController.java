package com.cskaoyan.mall.controller.marketController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StorageController {

    @GetMapping("/storage/create")
    public String create(){

        return "";
    }
}
