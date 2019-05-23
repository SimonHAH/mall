package com.cskaoyan.mall.controller.marketController;


import com.cskaoyan.mall.bean.market.ReturnRegionData;
import com.cskaoyan.mall.bean.market.RegionData;
import com.cskaoyan.mall.service.marketService.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MarketController {

    @Autowired
    private RegionService regionService;

    @GetMapping(value = "/region/list")
    @ResponseBody
    public ReturnRegionData list(){
        List<RegionData> regionDataList = regionService.selectProvince();
        ReturnRegionData region = new ReturnRegionData();
        region.setData(regionDataList.stream().toArray(RegionData[]::new));

        region.setErrmsg("成功");
        region.setErrno(0);

        return region;
    }
}
