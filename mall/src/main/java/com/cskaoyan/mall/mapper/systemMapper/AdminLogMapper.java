package com.cskaoyan.mall.mapper.systemMapper;


import com.cskaoyan.mall.bean.system.Log;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by HorseXInsect
 * 2019/5/23 17:11
 */
@Mapper
public interface AdminLogMapper {

    List<Log> find(@Param("name") String name, @Param("add_time") String sort, @Param("desc") String desc);
}
