package com.cskaoyan.mall.service.systemService;

import com.cskaoyan.mall.bean.common.CommonResult;

public interface AdminService {
    CommonResult findAdminRole();

    CommonResult getList(Integer page, Integer limit, String sort, String order);

}
