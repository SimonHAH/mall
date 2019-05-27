package com.cskaoyan.mall.mapper.systemMapper;

import com.cskaoyan.mall.bean.system.Admin;
import com.cskaoyan.mall.bean.system.AdminRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdminMapper {
    List<AdminRole> findAdminRole();

    List<Admin> findAdmins(@Param("add_time")String sort,@Param("desc") String order);
}
