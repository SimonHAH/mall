package com.cskaoyan.mall.mapper.user;

import com.cskaoyan.mall.bean.user.Feedback;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Nemo
 * @version 1.0
 * @date 2019/5/25
 */
@Mapper
public interface FeedbackMapper {
    List<Feedback> getList(String username, String id, String sort, String order);

    int getTotal(String username, String id);
}
