package com.cskaoyan.mall.mapper.marketMapper;
import com.cskaoyan.mall.bean.market.BrandItem;

public interface BrandMapper {

    BrandItem[] queryAllBrand();

    Integer queryRecords();

    BrandItem[] queryBrandByConditions(String name,String id);
}
