package com.cskaoyan.mall.service.user;

import com.cskaoyan.mall.bean.common.CommonData;
import com.cskaoyan.mall.bean.common.CommonResult;
import com.cskaoyan.mall.bean.user.User;
import org.springframework.stereotype.Service;

/**
 * @author Nemo
 * @version 1.0
 * @date 2019/5/23
 */
public interface UserService {

    CommonResult getList(Integer page, Integer limit, String sort, String order);
}
