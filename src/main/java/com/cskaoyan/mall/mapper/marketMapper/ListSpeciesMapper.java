package com.cskaoyan.mall.mapper.marketMapper;

import com.cskaoyan.mall.bean.market.commonData.CategoryData;
import com.cskaoyan.mall.bean.market.commonData.L1Data;

/**
 * 第二个模块的 商品类目 功能
 */
public interface ListSpeciesMapper {
    CategoryData[] queryAllCategoryData();

    L1Data[] queryAllCategoryName();
}
