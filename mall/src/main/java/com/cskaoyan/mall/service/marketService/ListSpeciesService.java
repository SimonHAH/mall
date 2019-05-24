package com.cskaoyan.mall.service.marketService;

import com.cskaoyan.mall.bean.market.commonData.CategoryData;
import com.cskaoyan.mall.bean.market.commonData.L1Data;

public interface ListSpeciesService {

    CategoryData[] queryAllCategoryData();

    L1Data[] queryAllCategoryName();
}
