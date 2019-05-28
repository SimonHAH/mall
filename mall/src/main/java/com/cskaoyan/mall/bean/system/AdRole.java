package com.cskaoyan.mall.bean.system;

import lombok.Data;

import java.util.Date;

@Data
public class AdRole {
    int id;
    String name;
    String desc;
    boolean deleted;
    boolean enabled;
    Date addTime;
    Date updateTime;

}
