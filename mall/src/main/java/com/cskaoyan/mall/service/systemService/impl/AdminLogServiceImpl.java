package com.cskaoyan.mall.service.systemService.impl;

import com.cskaoyan.mall.bean.common.CommonData;
import com.cskaoyan.mall.bean.common.CommonResult;
import com.cskaoyan.mall.bean.system.Log;
import com.cskaoyan.mall.mapper.systemMapper.AdminLogMapper;
import com.cskaoyan.mall.mapper.systemMapper.AdminRoleMapper;
import com.cskaoyan.mall.service.systemService.AdminLogService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by HorseXInsect
 * 2019/5/22 23:13
 */
@Service
public class AdminLogServiceImpl implements AdminLogService {

    @Autowired
    AdminLogMapper adminLogMapper;

    @Override
    public CommonResult getList(Integer page, Integer limit, String sort, String order) {
        // 分页
        PageHelper.startPage(page, limit);
        List<Log> list =adminLogMapper.find();

        CommonResult commonResult = new CommonResult();
        CommonData<Log> commonData = new CommonData<>();
        commonData.setItems(list);

        PageInfo<Log> pageInfo = new PageInfo<>(list);
        commonData.setTotal(pageInfo.getTotal());

        commonResult.setData(commonData);

        return commonResult;
    }
}
