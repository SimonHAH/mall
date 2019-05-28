package com.cskaoyan.mall.service.systemService.impl;

import com.cskaoyan.mall.bean.common.CommonData;
import com.cskaoyan.mall.bean.common.CommonResult;
import com.cskaoyan.mall.bean.system.AdRole;
import com.cskaoyan.mall.mapper.systemMapper.RoleMapper;
import com.cskaoyan.mall.service.systemService.RoleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleMapper roleMapper;


    @Override
    public CommonResult findRole(String name ,Integer page, Integer limit, String sort, String order) {
        // 分页
        PageHelper.startPage(page, limit);

        if (null == name) {
            name = "";
        }

        List<AdRole> list = roleMapper.findRole(name,sort,order);

        CommonResult commonResult = new CommonResult();
        CommonData<AdRole> commonData = new CommonData<>();

        commonData.setItems(list);
        PageInfo<AdRole> pageInfo = new PageInfo<>(list);
        commonData.setTotal(pageInfo.getTotal());

        commonResult.setData(commonData);
        commonResult.setErrmsg("成功");
        commonResult.setErrno(0);

        return commonResult;
    }

    @Override
    public CommonResult create(String name, String desc) {
        CommonResult commonResult = new CommonResult();
        AdRole role= roleMapper.findRoleByName(name);
        if (role==null){
            roleMapper.create(name,desc);
            AdRole role1= roleMapper.findRoleByName(name);
            commonResult.setData(role1);
            commonResult.setErrmsg("成功");
            commonResult.setErrno(0);
        }else {
            //已经存在
            commonResult.setErrmsg("角色已经存在");
            commonResult.setErrno(640);
        }
        return commonResult;
    }

    @Override
    public CommonResult delete(String name) {
        CommonResult commonResult = new CommonResult();
        int i = roleMapper.delete(name);
        if (i==1){
            commonResult.setErrmsg("成功");
            commonResult.setErrno(0);
        }
        return commonResult;
    }

    @Override
    public CommonResult update(int id,String name, String desc) {
        CommonResult commonResult = new CommonResult();
        int i = roleMapper.update(id,name,desc);
        if (i==1){
            commonResult.setErrmsg("成功");
            commonResult.setErrno(0);
        }
        return commonResult;
    }
}
