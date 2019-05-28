package com.cskaoyan.mall.mapper.systemMapper;

import com.cskaoyan.mall.bean.system.AdRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMapper {

    List<AdRole> findRole(@Param("name") String name,@Param("add_time")String sort, @Param("desc") String order);

    int create(@Param("name") String name,@Param("desc") String desc);

    AdRole findRoleByName(@Param("name") String name);

    int delete(@Param("name") String name);

    int update(@Param("id") int id,@Param("name") String name,@Param("desc") String desc);
}
