package com.cskaoyan.mall.service.marketService;

import com.cskaoyan.mall.bean.market.BrandItem;


public interface BrandService {

    BrandItem[] queryAllBrand();

    Integer queryRecords();

    BrandItem[] queryBrandByConditions(String name, String id);
}
