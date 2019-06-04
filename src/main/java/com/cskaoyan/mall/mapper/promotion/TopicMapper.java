package com.cskaoyan.mall.mapper.promotion;

import com.cskaoyan.mall.bean.promotion.Topic;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TopicMapper {

    List<Topic> findAll(@Param("sort") String sort, @Param("order") String order);
}
