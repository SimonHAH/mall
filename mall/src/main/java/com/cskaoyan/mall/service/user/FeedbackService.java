package com.cskaoyan.mall.service.user;

import com.cskaoyan.mall.bean.common.CommonResult;

/**
 * @author Nemo
 * @version 1.0
 * @date 2019/5/25
 */
public interface FeedbackService {
    CommonResult getList(int page, int limit, String username, String id, String sort, String order);
}
