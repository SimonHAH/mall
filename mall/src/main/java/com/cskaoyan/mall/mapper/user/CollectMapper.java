package com.cskaoyan.mall.mapper.user;

import com.cskaoyan.mall.bean.user.Collect;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Nemo
 * @version 1.0
 * @date 2019/5/24
 */
@Mapper
public interface CollectMapper {
    List<Collect> getList(String userId, String valueId, String sort, String order);

    int getTotal(String userId, String valueId);
}
