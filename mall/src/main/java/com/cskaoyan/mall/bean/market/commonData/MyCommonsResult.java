package com.cskaoyan.mall.bean.market.commonData;

import lombok.Data;

import java.util.List;

/**
 * 多数据 返回值模板
 * @param <T>
 */
@Data
public class MyCommonsResult<T> {
    private List<T> data;
    private String errmsg;
    private Integer errno;
}
