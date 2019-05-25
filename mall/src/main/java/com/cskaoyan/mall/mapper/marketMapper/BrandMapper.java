package com.cskaoyan.mall.mapper.marketMapper;
import com.cskaoyan.mall.bean.market.specialData.BrandItem;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface BrandMapper extends Mapper<BrandItem> {
    /**
     * 搜索满足条件的商品的总数
     * @param name 商品的名称
     * @param id    商品的id
     * @return
     */
    int countByConditions(@Param("name")String name,@Param("id")String id);

    /**
     * 查找所有品牌
     * @param sort 按照sort排序
     * @param order 结果集的顺序(顺序,逆序)
     * @return
     */
    List<BrandItem> queryAllBrand(@Param("sort") String sort,@Param("order") String order);

    /**
     * 按照关键字去查找
     * @param name 商品的名称
     * @param id    商品的id
     * @param sort  按照sort排序
     * @param order 结果集的顺序(顺序,逆序)
     * @return
     */
    List<BrandItem> queryBrandByConditions(@Param("name")String name,@Param("id")String id,
                                           @Param("sort")String sort,@Param("order")String order);
}
