package com.cskaoyan.mall.bean.login.login;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class MyData {
    private List<String> roles;
    private String name;//
    private List<String> perms;
    private String avatar;//
}
