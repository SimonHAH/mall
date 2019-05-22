package com.cskaoyan.mall.mapper.promotion;

import com.cskaoyan.mall.bean.promotion.Advert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface AdvertMapper {

    //@Select("select * from cskaoyan_mall_ad order by #{sort} #{order}")
    List<Advert> find(@Param("sort") String sort,@Param("order") String order);
}
