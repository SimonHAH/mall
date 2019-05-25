package com.cskaoyan.mall.service.user;

import com.cskaoyan.mall.bean.common.CommonResult;

/**
 * @author Nemo
 * @version 1.0
 * @date 2019/5/25
 */
public interface SearchHistoryService {
    CommonResult getList(int page, int limit, String sort, String order, String userId, String keyword);
}
