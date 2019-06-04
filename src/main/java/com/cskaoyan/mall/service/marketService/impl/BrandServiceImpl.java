package com.cskaoyan.mall.service.marketService.impl;

import com.cskaoyan.mall.bean.market.BrandItem;
import com.cskaoyan.mall.mapper.marketMapper.BrandMapper;
import com.cskaoyan.mall.service.marketService.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    BrandMapper brandMapper;

    @Override
    public BrandItem[] queryAllBrand() {
        return brandMapper.queryAllBrand();
    }

    @Override
    public Integer queryRecords() {
        return brandMapper.queryRecords();
    }

    @Override
    public BrandItem[] queryBrandByConditions(String name, String id) {
        return brandMapper.queryBrandByConditions(name,id);
    }
}
