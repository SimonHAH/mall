package com.cskaoyan.mall.controller.marketController;

import com.cskaoyan.mall.bean.market.specialData.CategoryData;
import com.cskaoyan.mall.bean.market.commonData.MyCommonsResult;
import com.cskaoyan.mall.bean.market.specialData.L1Data;
import com.cskaoyan.mall.service.marketService.ListSpeciesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ListSpeciesController {

    @Autowired
    ListSpeciesService listSpeciesService;

    @GetMapping("/category/list")
    public MyCommonsResult list(){

        List<CategoryData> categoryData = listSpeciesService.queryAllCategoryData();
        MyCommonsResult<CategoryData> commonData = new MyCommonsResult<>();
        commonData.setData(categoryData);
        commonData.setErrmsg("成功");
        commonData.setErrno(0);
        return commonData;
    }

    @GetMapping("/category/l1")
    public L1Data[] l1(){
        return listSpeciesService.queryAllCategoryName();
    }
}
