package com.cskaoyan.mall.mapper.marketMapper;
import com.cskaoyan.mall.bean.market.specialData.BrandItem;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface BrandMapper extends Mapper<BrandItem> {

    int count();

    List<BrandItem> queryAllBrand(@Param("sort") String sort,@Param("order") String order);

    List<BrandItem> queryBrandByConditions(@Param("name")String name,@Param("id")String id,
                                           @Param("sort")String sort,@Param("order")String order);
}
