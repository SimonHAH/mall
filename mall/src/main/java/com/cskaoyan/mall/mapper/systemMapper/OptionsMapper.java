package com.cskaoyan.mall.mapper.systemMapper;

import com.cskaoyan.mall.bean.system.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by HorseXInsect
 * 2019/5/22 23:15
 */
public interface OptionsMapper {

    //@Select("select count(*) from cskaoyan_mall_role")

    Options selectCount();
}
