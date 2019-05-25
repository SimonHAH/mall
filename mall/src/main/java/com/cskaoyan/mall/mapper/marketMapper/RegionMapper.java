package com.cskaoyan.mall.mapper.marketMapper;

import com.cskaoyan.mall.bean.market.specialData.RegionData;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
public interface RegionMapper extends Mapper<RegionData> {
    List<RegionData> selectProvince();
}
