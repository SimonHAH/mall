package com.cskaoyan.mall.service.systemService.impl;

import com.cskaoyan.mall.bean.common.CommonData;
import com.cskaoyan.mall.bean.common.CommonResult;
import com.cskaoyan.mall.bean.system.Admin;
import com.cskaoyan.mall.bean.system.AdminRole;
import com.cskaoyan.mall.mapper.systemMapper.AdminMapper;
import com.cskaoyan.mall.service.systemService.AdminService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminMapper adminMapper;

    @Override
    public CommonResult findAdminRole() {
        CommonResult<Object> commonResult = new CommonResult<>();

        List<AdminRole> roles= adminMapper.findAdminRole();
        commonResult.setErrmsg("成功");
        commonResult.setErrno(0);
        commonResult.setData(roles);
        return commonResult;
    }

    @Override
    public CommonResult getList(Integer page, Integer limit, String sort, String order) {
        // 分页
        PageHelper.startPage(page, limit);

        List<Admin> list = adminMapper.findAdmins(sort,order);

        CommonResult commonResult = new CommonResult();
        CommonData<Admin> commonData = new CommonData<>();

        commonData.setItems(list);
        PageInfo<Admin> pageInfo = new PageInfo<>(list);
        commonData.setTotal(pageInfo.getTotal());

        commonResult.setData(commonData);
        commonResult.setErrmsg("成功");
        commonResult.setErrno(0);

        return commonResult;

    }
}
