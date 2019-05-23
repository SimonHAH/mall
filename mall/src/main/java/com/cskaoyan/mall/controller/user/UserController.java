package com.cskaoyan.mall.controller.user;

import com.cskaoyan.mall.bean.common.CommonData;
import com.cskaoyan.mall.bean.common.CommonResult;
import com.cskaoyan.mall.bean.user.User;
import com.cskaoyan.mall.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Nemo
 * @version 1.0
 * @date 2019/5/23
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/list")
    @ResponseBody
    public CommonResult getList(Integer page, Integer limit, String sort, String order) {
        return userService.getList(page, limit, sort, order);
    }


}
