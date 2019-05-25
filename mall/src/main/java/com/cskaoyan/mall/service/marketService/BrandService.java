package com.cskaoyan.mall.service.marketService;

import com.cskaoyan.mall.bean.market.specialData.BrandItem;

import java.util.List;


public interface BrandService {

    List<BrandItem> queryAllBrand();

    Integer queryRecords();

    List<BrandItem> queryBrandByConditions(String name, String id);
}
