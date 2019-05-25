package com.cskaoyan.mall.mapper.marketMapper;

import com.cskaoyan.mall.bean.market.specialData.CategoryData;
import com.cskaoyan.mall.bean.market.specialData.L1Data;

import java.util.List;

/**
 * 第二个模块的 商品类目 功能
 */
public interface ListSpeciesMapper{

    List<CategoryData> queryAllCategoryData();

    L1Data[] queryAllCategoryName();
}
