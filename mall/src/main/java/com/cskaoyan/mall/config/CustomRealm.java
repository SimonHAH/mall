package com.cskaoyan.mall.config;

import com.cskaoyan.mall.bean.login.UserLogin;
import com.cskaoyan.mall.service.LoginService;
import com.cskaoyan.mall.utils.StringToArray;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CustomRealm extends AuthorizingRealm {

    @Autowired
    LoginService loginService;

    private void setName(){
        super.setName("customRealm");
    }

    /**
     * 授权
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        UserLogin userLogin = (UserLogin) principalCollection.getPrimaryPrincipal();
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        Set<String> roles = new HashSet<>();
        Set<String> perms = new HashSet<>();
        String[] role_ids = StringToArray.strToArr(userLogin.getRole_ids());
        for (String role_id : role_ids) {
            //按照role_id查找Role并添加到roles
            String role = loginService.findRoleById(role_id);
            roles.add(role);
            //按照role_id查找permission并添加到perms
            List<String> permissions = loginService.findPermissionByRoleId(role_id);
            for (String permission : permissions) {
                perms.add(permission);
            }
        }
        info.setStringPermissions(perms);
        info.setRoles(roles);
        return info;
    }

    /**
     * 登陆
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String username = token.getUsername();
        String password = new String(token.getPassword());
        UserLogin userLogin = loginService.findByName(username);
        if (userLogin !=null && userLogin.getPassword().equals(password)){
            SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(userLogin, userLogin.getPassword(),this.getName());
            return info;
        }
        return null;
    }
}
