package com.cskaoyan.mall.controller.user;

import com.cskaoyan.mall.bean.common.CommonResult;
import com.cskaoyan.mall.service.user.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Nemo
 * @version 1.0
 * @date 2019/5/24
 */
@Controller
@RequestMapping("/collect")
public class CollectController {

    @Autowired
    CollectService collectService;

    @RequestMapping("/list")
    @ResponseBody
    public CommonResult getList(int page, int limit, String userId, String valueId, String sort, String order) {
        return collectService.getList(page, limit, userId, valueId, sort, order);
    }
}
