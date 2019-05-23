package com.cskaoyan.mall.service.systemService.impl;

import com.cskaoyan.mall.bean.system.Options;
import com.cskaoyan.mall.mapper.systemMapper.OptionsMapper;
import com.cskaoyan.mall.service.systemService.OptionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by HorseXInsect
 * 2019/5/22 23:13
 */
@Service
public class OptionsServiceImpl implements OptionsService {

    @Autowired
    OptionsMapper optionsMapper;


    @Override
    public Options queryCount() {
        Options options = optionsMapper.selectCount();
        return options;


        /*int i = optionsMapper.selectCount();
        return i;*/
    }
}
