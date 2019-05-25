package com.cskaoyan.mall.mapper.user;

import com.cskaoyan.mall.bean.user.Footprint;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Nemo
 * @version 1.0
 * @date 2019/5/24
 */
@Mapper
public interface FootprintMapper {
    List<Footprint> getList(String userId, String goodsId, String sort, String order);

    int getTotal(String userId, String goodsId);

}
