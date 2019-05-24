package com.cskaoyan.mall.controller.marketController;

import com.cskaoyan.mall.bean.market.Order;
import com.cskaoyan.mall.bean.market.OrderWrapper;
import com.cskaoyan.mall.bean.market.commonData.MyCommonData;
import com.cskaoyan.mall.service.marketService.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;
//?page=1&limit=20&orderStatusArray=101&sort=add_time&order=desc&userId=2&orderSn=1213
    @GetMapping("/order/list")
    public MyCommonData list(String userId, String orderSn, String orderStatusArray){
        //传入空则按照null处理
        userId = "".equals(userId) ? null:userId;
        orderSn = "".equals(orderSn) ? null:orderSn;
        orderStatusArray = "".equals(orderStatusArray) ? null:orderStatusArray;
        //初始化
        OrderWrapper orderWrapper = new OrderWrapper();
        MyCommonData<OrderWrapper> commonData = new MyCommonData<>();
        //条件判断
        if (userId==null && orderSn==null && orderStatusArray==null){
            //这是查询全部的
            List<Order> orders = orderService.queryAllOrder();
            orderWrapper.setTotal(orders.size());
            orderWrapper.setItems(orders);
            commonData.setData(orderWrapper);
        }else {
            //这是按条件查询
            List<Order> orders = orderService.queryOrderByConditions(userId,orderSn,orderStatusArray);
            if (orders.size() < 1)
                return null;
            orderWrapper.setTotal(orders.size());
            orderWrapper.setItems(orders);
            commonData.setData(orderWrapper);
        }
        //数据库有这样的数据吗
        if (commonData.getData().getTotal()<1){
            return null;
        }
        commonData.setErrno(0);
        commonData.setErrmsg("成功");
        return commonData;
    }
}
