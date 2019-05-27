package com.cskaoyan.mall.bean.login;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "cskaoyan_mall_admin")
public class UserLogin {

    @Id
    private int id;
    private String username;//
    private String password;
    private String avatar;//
    private String role_ids;
}
