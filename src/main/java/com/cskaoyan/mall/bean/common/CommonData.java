package com.cskaoyan.mall.bean.common;

import com.cskaoyan.mall.bean.system.Log;

import java.util.List;

/**
 * 分页结果
 * @param <T>
 */
public class CommonData<T> {

    List<T> items;
    long total;

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
}
