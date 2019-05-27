package com.cskaoyan.wx.bean.common;

import lombok.Data;

@Data
public class CommonResult {
    CommonData data;
    String errmsg;
    int errno;
}
