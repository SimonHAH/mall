package com.cskaoyan.mall.mapper.systemMapper;


import com.cskaoyan.mall.bean.system.Log;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by HorseXInsect
 * 2019/5/23 17:11
 */
@Mapper
public interface AdminLogMapper {

    List<Log> find();
}
