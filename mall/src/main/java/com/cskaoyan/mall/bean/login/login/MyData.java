package com.cskaoyan.mall.bean.login.login;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MyData {
    private String[] roles;
    private String name;
    private String[] perms;
    private String avatar;
}
