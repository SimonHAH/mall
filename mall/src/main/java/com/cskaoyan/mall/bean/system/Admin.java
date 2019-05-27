package com.cskaoyan.mall.bean.system;

import lombok.Data;

import java.util.List;

@Data
public class Admin {
    int id;
    String username;
    String avatar;
    List<Integer> roleIds;

}
