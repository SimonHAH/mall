package com.cskaoyan.mall.mapper.configuration;

import com.cskaoyan.mall.bean.configuration.MallConfig;
import org.apache.ibatis.annotations.Param;

public interface MallConfigMapper {

    String findMallName();

    String findMallAddress();

    String findMallPhone();

    String findMallQQ();

    void updateMallConfig(@Param("mallConfig") MallConfig mallConfig);
}
