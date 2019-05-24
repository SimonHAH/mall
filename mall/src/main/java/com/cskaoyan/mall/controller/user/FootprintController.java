package com.cskaoyan.mall.controller.user;

import com.cskaoyan.mall.bean.common.CommonResult;
import com.cskaoyan.mall.service.user.FootprintService;
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
@RequestMapping("/footprint")
public class FootprintController {

    @Autowired
    FootprintService footprintService;

    @RequestMapping("/list")
    @ResponseBody
    public CommonResult getList(int page, int limit, String userId, String goodsId, String sort, String order) {
        return footprintService.getList(page, limit, userId, goodsId, sort, order);
    }

}
