package com.cskaoyan.mall.bean.common;

import lombok.Data;

@Data
public class CommonResult<T> {
    T data;
    String errmsg;
    int errno;
}
