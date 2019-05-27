package com.cskaoyan.wx.bean.market.commonData;

import lombok.Data;

/**
 * 单数据 返回值模板
 * @param <T>
 */
@Data
public class MyCommonResult<T> {
    private T data;
    private String errmsg;
    private Integer errno;
}
