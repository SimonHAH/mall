package com.cskaoyan.mall.service.configuration;

import com.cskaoyan.mall.bean.common.CommonResult;
import com.cskaoyan.mall.bean.configuration.MallConfig;
import com.cskaoyan.mall.mapper.configuration.MallConfigMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MallConfigServiceImpl implements MallConfigService {

    @Autowired
    MallConfigMapper mallConfigMapper;

    @Override
    public CommonResult findMallConfig() {
        MallConfig mallConfig =new MallConfig();
        mallConfig.setLitemall_mall_name(mallConfigMapper.findMallName());
        mallConfig.setLitemall_mall_address(mallConfigMapper.findMallAddress());
        mallConfig.setLitemall_mall_phone(mallConfigMapper.findMallPhone());
        mallConfig.setLitemall_mall_qq(mallConfigMapper.findMallQQ());
        CommonResult result = new CommonResult();
        result.setErrmsg("成功");
        result.setErrno(0);
        result.setData(mallConfig);
        return result;
    }

    @Override
    public CommonResult updateMallConfig(MallConfig mallConfig) {
        mallConfigMapper.updateMallConfig(mallConfig);
        CommonResult result = new CommonResult();
        result.setErrmsg("成功");
        result.setErrno(0);
        return result;
    }
}
