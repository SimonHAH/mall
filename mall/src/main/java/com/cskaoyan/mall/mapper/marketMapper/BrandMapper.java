package com.cskaoyan.mall.mapper.marketMapper;
import com.cskaoyan.mall.bean.market.specialData.BrandItem;

import java.util.List;

public interface BrandMapper {

    List<BrandItem> queryAllBrand();

    Integer queryRecords();

    List<BrandItem> queryBrandByConditions(String name, String id);
}
