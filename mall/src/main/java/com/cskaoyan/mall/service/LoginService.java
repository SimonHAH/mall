package com.cskaoyan.mall.service;

import com.cskaoyan.mall.bean.login.UserLogin;

import java.util.List;

public interface LoginService {
    UserLogin findByName(String username);

    String findRoleById(String role_id);

    List<String> findPermissionByRoleId(String role_id);

    int uploadMessage(String tableName);
}
