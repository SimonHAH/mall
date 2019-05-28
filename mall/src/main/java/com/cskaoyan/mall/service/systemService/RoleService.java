package com.cskaoyan.mall.service.systemService;

import com.cskaoyan.mall.bean.common.CommonResult;

public interface RoleService {

    CommonResult findRole(String name,Integer page, Integer limit, String sort, String order);

    CommonResult create(String name, String desc);

    CommonResult delete(String name);

    CommonResult update(int id,String name, String desc);
}
