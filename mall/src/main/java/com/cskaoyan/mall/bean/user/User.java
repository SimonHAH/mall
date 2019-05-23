package com.cskaoyan.mall.bean.user;

import lombok.Data;
import java.sql.Date;

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
    private Date birthday;
    private Date lastLoginTime;
    private String lastLoginIp;
    private int userLevel;
    private String nickname;
    private String mobile;
    private String avatar;
    private String weixinOpenId;
    private int status;
    private Date addTime;
    private Date updateTime;
    private int deleted;
}
