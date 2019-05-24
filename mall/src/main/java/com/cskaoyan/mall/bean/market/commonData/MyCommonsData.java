package com.cskaoyan.mall.bean.market.commonData;

import lombok.Data;

@Data
public class MyCommonsData<T> {
    private T[] data;
    private String errmsg;
    private Integer errno;
}
