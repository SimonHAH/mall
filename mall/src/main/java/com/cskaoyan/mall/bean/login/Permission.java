package com.cskaoyan.mall.bean.login;

import lombok.Data;

import javax.persistence.Table;

@Data
@Table(name = "cskaoyan_mall_permission")
public class Permission {
    private int id;
    private int roleId;
    private String permission;
}
