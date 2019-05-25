package com.cskaoyan.mall.controller.marketController;

import com.cskaoyan.mall.bean.market.commonData.MyCommonsResult;
import com.cskaoyan.mall.service.marketService.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegionController {

    @Autowired
    private RegionService regionService;

    @GetMapping(value = "/region/list")
    public MyCommonsResult list(){
        return regionService.selectProvince();
    }
}
