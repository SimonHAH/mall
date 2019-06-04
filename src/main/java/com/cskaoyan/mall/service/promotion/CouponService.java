package com.cskaoyan.mall.service.promotion;

import com.cskaoyan.mall.bean.common.CommonResult;

public interface CouponService {

    CommonResult getList(int page, int limit, String sort, String order);
}
