package com.cskaoyan.wx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Nemo
 * @version 1.0
 * @date 2019/5/27
 */
@Controller
@RequestMapping("/catalog")
public class CatalogController {



    @RequestMapping("/all")
    @ResponseBody
    public void getAllCategory() {

    }
}
