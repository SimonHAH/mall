package com.cskaoyan.mall.controller;
import com.cskaoyan.mall.bean.login.dashboard.DashboardData;
import com.cskaoyan.mall.bean.login.dashboard.DashboardParam;
import com.cskaoyan.mall.bean.login.login.AdminLoginParam;
import com.cskaoyan.mall.bean.login.login.LoginResult;
import com.cskaoyan.mall.bean.login.login.MyData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class AdminController {

    @PostMapping(value = "/auth/login")
    @ResponseBody
    public LoginResult login() {
        LoginResult loginResult = new LoginResult();
        loginResult.setErrno(0);
        loginResult.setData("6e414ab9-f63e-4826-9831-7a8c52c6d6ff");
        loginResult.setErrmsg("成功");
        return loginResult;
    }

    @GetMapping(value = "/auth/info")
    @ResponseBody
    public AdminLoginParam info(){
        String[] roles = {"超级管理员"};
        String[] perms = {"*"};
        return new AdminLoginParam(0,new MyData(roles,"admin123",perms,"https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif"),"成功");
    }


    @GetMapping(value = "/dashboard")
    @ResponseBody
    public DashboardParam dashboard(){
        System.out.println("h");
        return new DashboardParam(new DashboardData(238,0,243,0),"成功",0);
    }
}
