package com.cskaoyan.mall.service.marketService.impl;

import com.cskaoyan.mall.bean.market.specialData.RegionData;
import com.cskaoyan.mall.mapper.marketMapper.RegionMapper;
import com.cskaoyan.mall.service.marketService.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionServiceImpl implements RegionService {

    @Autowired
    RegionMapper regionMapper;
    @Override
    public List<RegionData> selectProvince() {
        return regionMapper.selectProvince();
    }
}
