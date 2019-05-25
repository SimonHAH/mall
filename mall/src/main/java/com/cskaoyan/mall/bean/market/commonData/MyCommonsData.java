package com.cskaoyan.mall.bean.market.commonData;

import lombok.Data;

import java.util.List;

/**
 *
 * @param <T>
 */
@Data
public class MyCommonsData<T> {
    private Integer total;
    private List<T> items;
}
