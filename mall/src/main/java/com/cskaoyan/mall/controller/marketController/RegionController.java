package com.cskaoyan.mall.controller.marketController;

import com.cskaoyan.mall.bean.market.specialData.RegionData;
import com.cskaoyan.mall.bean.market.commonData.MyCommonsResult;
import com.cskaoyan.mall.service.marketService.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class RegionController {

    @Autowired
    private RegionService regionService;

    @GetMapping(value = "/region/list")
    @ResponseBody
    public MyCommonsResult list(){

        List<RegionData> regionDataList = regionService.selectProvince();

        MyCommonsResult<RegionData> commonsResult = new MyCommonsResult<>();
        commonsResult.setData(regionDataList);

        commonsResult.setErrmsg("成功");
        commonsResult.setErrno(0);

        return commonsResult;
    }
}
