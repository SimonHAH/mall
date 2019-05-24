package com.cskaoyan.mall.bean.user;

import lombok.Data;

/**
 * @author Nemo
 * @version 1.0
 * @date 2019/5/22
 */
@Data
public class User {
    private int id;
    private String username;
    private String password;
    private int gender;
    private String birthday;
    private String lastLoginTime;
    private String lastLoginIp;
    private int userLevel;
    private String nickname;
    private String mobile;
    private String avatar;
    private String weixinOpenId;
    private int status;
    private String addTime;
    private String updateTime;
    private Boolean deleted;
}
