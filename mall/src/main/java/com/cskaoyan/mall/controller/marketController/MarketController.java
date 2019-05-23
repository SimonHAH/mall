package com.cskaoyan.mall.controller.marketController;


import com.cskaoyan.mall.bean.market.Region;
import com.cskaoyan.mall.bean.market.RegionData;
import com.cskaoyan.mall.mapper.marketMapper.RegionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MarketController {

    @Autowired
    private RegionMapper regionMapper;

    @GetMapping(value = "/region/list")
    @ResponseBody
    public Region list(){
        List<RegionData> regionDataList = regionMapper.selectProvince();
        Region region = new Region();
        region.setData(regionDataList.stream().toArray(RegionData[]::new));

        region.setErrmsg("成功");
        region.setErrno(0);

        return region;
    }
}
