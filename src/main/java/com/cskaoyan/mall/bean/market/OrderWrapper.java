package com.cskaoyan.mall.bean.market;

import lombok.Data;

import java.util.List;

@Data
public class OrderWrapper {
    private List<Order> items;
    private Integer total;
}
