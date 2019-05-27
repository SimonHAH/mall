package com.cskaoyan.wx.bean.common;

import lombok.Data;

import java.util.List;

/**
 * 分页结果
 * @param <T>
 */
@Data
public class CommonsData<T> {

    List<T> items;
    long total;
}
