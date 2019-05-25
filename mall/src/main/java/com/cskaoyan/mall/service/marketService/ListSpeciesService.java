package com.cskaoyan.mall.service.marketService;

import com.cskaoyan.mall.bean.market.specialData.CategoryData;
import com.cskaoyan.mall.bean.market.specialData.L1Data;

import java.util.List;

public interface ListSpeciesService {

    List<CategoryData> queryAllCategoryData();

    L1Data[] queryAllCategoryName();
}
