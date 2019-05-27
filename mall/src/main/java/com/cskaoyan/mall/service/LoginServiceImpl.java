package com.cskaoyan.mall.service;

import com.cskaoyan.mall.bean.login.UserLogin;
import com.cskaoyan.mall.mapper.LoginMapper;
import com.cskaoyan.mall.mapper.UserLoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    LoginMapper loginMapper;
    @Autowired
    UserLoginMapper userLoginMapper;
    @Override
    public UserLogin findByName(String username) {
        Example example = new Example(UserLogin.class);
        example.createCriteria().andEqualTo("username",username);
        return userLoginMapper.selectOneByExample(example);
    }

    @Override
    public String findRoleById(String role_id) {
        return loginMapper.findRoleById(role_id);
    }

    @Override
    public List<String> findPermissionByRoleId(String role_id) {
        return loginMapper.findPermissionByRoleId(role_id);
    }

    @Override
    public int uploadMessage(String tableName) {
        return loginMapper.findCountByTableName(tableName);
    }
}
