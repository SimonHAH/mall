package com.cskaoyan.mall.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LoginMapper{

    String findRoleById(String role_id);

    List<String> findPermissionByRoleId(String role_id);

    int findCountByTableName(@Param("tableName") String tableName);
}
