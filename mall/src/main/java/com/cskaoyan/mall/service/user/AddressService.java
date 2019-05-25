package com.cskaoyan.mall.service.user;

import com.cskaoyan.mall.bean.common.CommonResult;

/**
 * @author Nemo
 * @version 1.0
 * @date 2019/5/23
 */
public interface AddressService {
    CommonResult getList(int page, int limit, String sort, String order, String name, String userId);
}
