package com.cskaoyan.mall.service.marketService;

import com.cskaoyan.mall.bean.market.commonData.MyCommonResult;


public interface BrandService {

    /**
     * 查找所有品牌
     * @param page  页码
     * @param limit 每一页的页数
     * @param sort  排序所依赖的字段
     * @param order 排序的顺序
     * @return
     */
    MyCommonResult queryAllBrand(Integer page, Integer limit,String sort,String order);

    /**
     * 按条件搜索品牌
     * @param name  品牌的名称
     * @param id    品牌的id
     * @param page  页码
     * @param limit 每一页的页数
     * @param sort  排序所依赖的字段
     * @param order 排序的顺序
     * @return
     */
    MyCommonResult queryBrandByConditions(String name,String id,Integer page, Integer limit,String sort,String order);
}
