package com.cskaoyan.mall.service.user;

import com.cskaoyan.mall.bean.common.CommonResult;

/**
 * @author Nemo
 * @version 1.0
 * @date 2019/5/24
 */
public interface CollectService {
    CommonResult getList(int page, int limit, String userId, String valueId, String sort, String order);

}
