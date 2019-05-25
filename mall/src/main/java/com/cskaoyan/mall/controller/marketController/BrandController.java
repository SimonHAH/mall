package com.cskaoyan.mall.controller.marketController;

import com.cskaoyan.mall.bean.market.specialData.BrandItem;
import com.cskaoyan.mall.bean.market.commonData.MyCommonsData;
import com.cskaoyan.mall.bean.market.commonData.MyCommonResult;
import com.cskaoyan.mall.service.marketService.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class BrandController {

    @Autowired
    private BrandService brandService;

    @GetMapping("/brand/list")
    @ResponseBody
    public MyCommonResult list(String name,String id,Integer page,
                               Integer limit,String sort,String order){
        return brandService.queryBrandByConditions(name,id,page,limit,sort,order);
    }
}
