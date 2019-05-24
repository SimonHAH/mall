package com.cskaoyan.mall.controller.marketController;

import com.cskaoyan.mall.bean.market.commonData.CategoryData;
import com.cskaoyan.mall.bean.market.commonData.MyCommonsData;
import com.cskaoyan.mall.bean.market.commonData.L1Data;
import com.cskaoyan.mall.mapper.marketMapper.ListSpeciesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListSpeciesController {

    @Autowired
    ListSpeciesMapper listSpeciesMapper;

    @GetMapping("/category/list")
    public MyCommonsData list(){
        CategoryData[] categoryData = listSpeciesMapper.queryAllCategoryData();
        MyCommonsData<CategoryData> commonData = new MyCommonsData<>();
        commonData.setData(categoryData);
        commonData.setErrmsg("成功");
        commonData.setErrno(0);
        return commonData;
    }

    @GetMapping("/category/l1")
    public L1Data[] l1(){
        return listSpeciesMapper.queryAllCategoryName();
    }
}
