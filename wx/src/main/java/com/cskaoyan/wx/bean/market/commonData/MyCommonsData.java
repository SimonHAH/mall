package com.cskaoyan.wx.bean.market.commonData;

import lombok.Data;

import java.util.List;

/**
 *
 * @param <T>
 */
@Data
public class MyCommonsData<T> {
    private long total;
    private List<T> items;
}
