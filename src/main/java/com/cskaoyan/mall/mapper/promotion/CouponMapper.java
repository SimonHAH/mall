package com.cskaoyan.mall.mapper.promotion;

import com.cskaoyan.mall.bean.promotion.Coupon;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CouponMapper {

    //@Select("select * from cskaoyan_mall_coupon order by #{sort} #{order}")
    List<Coupon> findAll(@Param("sort") String sort, @Param("order") String order);
}
