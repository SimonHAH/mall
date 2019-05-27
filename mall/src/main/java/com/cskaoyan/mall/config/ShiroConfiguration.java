package com.cskaoyan.mall.config;

import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.DelegatingFilterProxy;

import java.util.LinkedHashMap;


@Configuration
public class ShiroConfiguration {

    /**
     * 创建realm
     */
    @Bean
    public CustomRealm getRealm(){
        return new CustomRealm();
    }

    /**
     * 创建安全管理器
     */
    @Bean
    public SecurityManager getSecurityManager(CustomRealm realm){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(realm);
        return securityManager;
    }

    @Bean
    public ShiroFilterFactoryBean shiroFilter(SecurityManager securityManager){
        //过滤器工厂
        ShiroFilterFactoryBean filterFactory = new ShiroFilterFactoryBean();
        filterFactory.setSecurityManager(securityManager);
//        filterFactory.setLoginUrl("/");//跳转url
//        filterFactory.setUnauthorizedUrl("/");//未授权的url
        /**
         * key = 拦截的url
         * value = 过滤器类型
         */
        LinkedHashMap<String, String> filterMap = new LinkedHashMap<>();
//        filterMap.put("/admin","anon");
//        filterMap.put("/#/login","anon");
//        filterMap.put("/#/**","authc");
//        filterMap.put("/admin/**","authc");//认证访问
        filterFactory.setFilterChainDefinitionMap(filterMap);
        return filterFactory;
    }

    //开启对shiro注解的支持
    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(SecurityManager securityManager){
        AuthorizationAttributeSourceAdvisor advisor = new AuthorizationAttributeSourceAdvisor();
        advisor.setSecurityManager(securityManager);
        return advisor;
    }
}
