package com.cskaoyan.mall.bean.common;

import lombok.Data;

@Data
public class CommonResult {
    CommonData data;
    String errmsg;
    int errno;
}
