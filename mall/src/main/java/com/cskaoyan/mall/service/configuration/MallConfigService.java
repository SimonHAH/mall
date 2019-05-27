package com.cskaoyan.mall.service.configuration;

import com.cskaoyan.mall.bean.common.CommonResult;
import com.cskaoyan.mall.bean.configuration.MallConfig;


public interface MallConfigService {
    CommonResult findMallConfig();

    CommonResult updateMallConfig(MallConfig mallConfig);
}
