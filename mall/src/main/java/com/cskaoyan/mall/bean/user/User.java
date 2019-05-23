package com.cskaoyan.mall.bean.user;

import lombok.Data;

import java.sql.Timestamp;
import java.sql.Date;

/**
 * @author Nemo
 * @version 1.0
 * @date 2019/5/22
 */
@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private Integer gender;
    private Date birthday;
    private Timestamp lastLoginTime;
    private String lastLoginIp;
    private Integer userLevel;
    private String nickname;
    private String mobile;
    private String avatar;
    private String weixinOpenId;
    private Integer status;
    private Timestamp addTime;
    private Timestamp updateTime;
    private Integer deleted;
}
