package com.cskaoyan.mall.service.marketService;

import com.cskaoyan.mall.bean.market.commonData.MyCommonResult;


public interface BrandService {

    MyCommonResult queryAllBrand(Integer page, Integer limit,String sort,String order);

    MyCommonResult queryBrandByConditions(String name,String id,Integer page, Integer limit,String sort,String order);
}
