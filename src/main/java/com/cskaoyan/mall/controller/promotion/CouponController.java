package com.cskaoyan.mall.controller.promotion;

import com.cskaoyan.mall.bean.common.CommonResult;
import com.cskaoyan.mall.service.promotion.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/coupon")
public class CouponController {

    @Autowired
    CouponService couponService;

    @RequestMapping("/list")
    @ResponseBody
    public CommonResult list(int page, int limit, String sort, String order){
        CommonResult commonResult = couponService.getList(page, limit, sort, order);
        return commonResult;
    }
}
