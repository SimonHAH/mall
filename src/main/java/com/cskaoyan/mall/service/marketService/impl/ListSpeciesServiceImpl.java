package com.cskaoyan.mall.service.marketService.impl;

import com.cskaoyan.mall.bean.market.commonData.CategoryData;
import com.cskaoyan.mall.bean.market.commonData.L1Data;
import com.cskaoyan.mall.mapper.marketMapper.ListSpeciesMapper;
import com.cskaoyan.mall.service.marketService.ListSpeciesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListSpeciesServiceImpl implements ListSpeciesService {
    @Autowired
    ListSpeciesMapper listSpeciesMapper;
    @Override
    public CategoryData[] queryAllCategoryData() {
        return listSpeciesMapper.queryAllCategoryData();
    }

    @Override
    public L1Data[] queryAllCategoryName() {
        return listSpeciesMapper.queryAllCategoryName();
    }
}
