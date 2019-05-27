package com.cskaoyan.wx.bean.common;

import lombok.Data;

@Data
public class CommonResult<T> {
    T data;
    String errmsg;
    int errno;
}
