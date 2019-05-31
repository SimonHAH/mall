package com.cskaoyan.mall.service.configuration;

import com.cskaoyan.mall.bean.common.CommonResult;
import com.cskaoyan.mall.bean.configuration.ExpressConfig;
import com.cskaoyan.mall.mapper.configuration.ExpressConfigMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpressConfigServiceImpl implements ExpressConfigService{

    @Autowired
    ExpressConfigMapper expressConfigMapper;

    @Override
    public CommonResult findExpress() {
        ExpressConfig expressConfig = new ExpressConfig();
        expressConfig.setLitemall_express_freight_min(expressConfigMapper.findMin());
        expressConfig.setLitemall_express_freight_value(expressConfigMapper.findValue());
        CommonResult result = new CommonResult();
        result.setErrmsg("成功");
        result.setErrno(0);
        result.setData(expressConfig);
        return result;
    }
}
