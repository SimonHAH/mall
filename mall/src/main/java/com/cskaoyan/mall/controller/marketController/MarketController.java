package com.cskaoyan.mall.controller.marketController;

import com.cskaoyan.mall.bean.market.Region;
import com.cskaoyan.mall.bean.market.RegionData;
import com.cskaoyan.mall.service.marketService.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MarketController {
    @Autowired
    private RegionService regionService;

    @GetMapping(value = "/list")
    @ResponseBody
    public Region list(){
        Region region = new Region();

        return region;
    }
}
