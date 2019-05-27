package com.cskaoyan.wx.bean.common;

import lombok.Data;

@Data
public class CommonData<T> {
    T items;
    long total;
}
