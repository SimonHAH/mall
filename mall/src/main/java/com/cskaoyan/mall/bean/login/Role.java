package com.cskaoyan.mall.bean.login;

import lombok.Data;

import javax.persistence.Table;

@Data
@Table(name = "cskaoyan_mall_role")
public class Role {

    private int id;
    private String name;
    private String desc;
}
