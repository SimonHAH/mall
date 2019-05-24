package com.cskaoyan.mall.service.marketService;


import com.cskaoyan.mall.bean.market.Order;

import java.util.List;

public interface OrderService {
    List<Order> queryAllOrder();

    List<Order> queryOrderByConditions(String userId, String orderSn, String orderStatusArray);
}
