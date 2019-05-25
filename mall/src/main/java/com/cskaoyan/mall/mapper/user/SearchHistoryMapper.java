package com.cskaoyan.mall.mapper.user;

import com.cskaoyan.mall.bean.user.SearchHistory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Nemo
 * @version 1.0
 * @date 2019/5/25
 */
@Mapper
public interface SearchHistoryMapper {
    List<SearchHistory> getList(String sort, String order, String userId, String keyword);
}
