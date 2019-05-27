package com.cskaoyan.wx.bean.login.login;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AdminLoginParam {
    private Integer errno;
    private MyData data;
    private String errmsg;
}
