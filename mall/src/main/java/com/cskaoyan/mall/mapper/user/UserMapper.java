package com.cskaoyan.mall.mapper.user;

import com.cskaoyan.mall.bean.user.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Nemo
 * @version 1.0
 * @date 2019/5/23
 */
@Mapper
public interface UserMapper {
    List<User> getList(Integer page, Integer limit, String sort, String order, String username, String mobile);

    int getTotal(String username, String mobile);
}
