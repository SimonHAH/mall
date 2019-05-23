package com.cskaoyan.mall.controller.user;

import com.cskaoyan.mall.bean.common.CommonResult;
import com.cskaoyan.mall.service.user.AddressService;
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
@RequestMapping("/address")
public class AddressController {

    @Autowired
    AddressService addressService;

    @RequestMapping("/list")
    @ResponseBody
    public CommonResult getList(int page, int limit, String sort, String order) {
        return addressService.getList(page, limit, sort, order);
    }
}
