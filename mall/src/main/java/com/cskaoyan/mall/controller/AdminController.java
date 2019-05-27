package com.cskaoyan.mall.controller;
import com.cskaoyan.mall.bean.login.UserLogin;
import com.cskaoyan.mall.bean.login.dashboard.DashboardData;
import com.cskaoyan.mall.bean.login.dashboard.DashboardParam;
import com.cskaoyan.mall.bean.login.login.UserRolesAndPermissions;
import com.cskaoyan.mall.bean.login.login.LoginResult;
import com.cskaoyan.mall.bean.login.login.MyData;
import com.cskaoyan.mall.service.LoginService;
import com.cskaoyan.mall.utils.GetRequestPayload;
import com.cskaoyan.mall.utils.StringToArray;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class AdminController {

    Subject subject;
    String username;
    String password;
    @Autowired
    LoginService loginService;

    @PostMapping(value = "/auth/login")
    @ResponseBody
    public LoginResult login(HttpServletRequest req) throws ServletException, IOException {
        Map map = GetRequestPayload.getRequestPayload(req);
        username = (String) map.get("username");
        password = (String) map.get("password");
        LoginResult loginResult = new LoginResult();
        try{
            //md5加密
            password = new Md5Hash(password,username,3).toString();
            //登陆令牌
            UsernamePasswordToken upToken = new UsernamePasswordToken(username,password);
            //获取subject
            subject = SecurityUtils.getSubject();
            //登陆验证
            subject.login(upToken);
            //成功了则包装结果返回
            loginResult.setErrno(0);
            loginResult.setData(password);
            loginResult.setErrmsg("成功");
        }catch (Exception e){
            //登陆未通过
            loginResult.setErrmsg("用户帐号或密码不正确");
            loginResult.setErrno(605);
            return loginResult;
        }
        return loginResult;
    }

    @GetMapping(value = "/auth/info")
    @ResponseBody
    public UserRolesAndPermissions info(String token){
        //登陆成功后授限
        if (token != null)
        {
            UserLogin userLogin = loginService.findByName(username);
            String[] ids = StringToArray.strToArr(userLogin.getRole_ids());
            if (ids.length < 1)
                return null;
            List<String> roles = new ArrayList<>();
            List<String> permissions = null;
            for (String id : ids) {
                //找到该用户的所有角色和对应角色的权限
                String role = loginService.findRoleById(id);
                roles.add(role);
                permissions = loginService.findPermissionByRoleId(id);
            }
            MyData data = new MyData(roles,username,permissions,userLogin.getAvatar());
            return new UserRolesAndPermissions(0,data,"成功");
        }
        return null;
    }


    @GetMapping(value = "/dashboard")
    @ResponseBody
    public DashboardParam dashboard(){
        int goodsCount = loginService.uploadMessage("cskaoyan_mall_goods");
        int productsCount = loginService.uploadMessage("cskaoyan_mall_goods_product");
        int usersCount = loginService.uploadMessage("cskaoyan_mall_user");
        int ordersCount = loginService.uploadMessage("cskaoyan_mall_order");
        return new DashboardParam(new DashboardData(goodsCount,ordersCount,productsCount,usersCount),"成功",0);
    }
}
