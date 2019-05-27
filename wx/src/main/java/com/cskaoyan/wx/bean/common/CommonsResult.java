package com.cskaoyan.wx.bean.common;

import lombok.Data;

import java.util.List;

@Data
public class CommonsResult<T> {
    List<T> data;
    String errmsg;
    int errno;
}
