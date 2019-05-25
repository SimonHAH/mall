package com.cskaoyan.mall.controller.marketController;

import com.cskaoyan.mall.bean.market.specialData.Order;
import com.cskaoyan.mall.bean.market.commonData.MyCommonsData;
import com.cskaoyan.mall.bean.market.commonData.MyCommonResult;
import com.cskaoyan.mall.service.marketService.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping("/order/list")
    public MyCommonResult list(String userId, String orderSn, String orderStatusArray){
        //处理请求参数 传入空则按照null处理
        userId = "".equals(userId) ? null:userId;
        orderSn = "".equals(orderSn) ? null:orderSn;
        orderStatusArray = "".equals(orderStatusArray) ? null:orderStatusArray;
        //初始化将要返回的结果集
        MyCommonsData commonData = new MyCommonsData<Order>();
        MyCommonResult<MyCommonsData> commonResult = new MyCommonResult<>();
        //条件判断
        if (userId==null && orderSn==null && orderStatusArray==null){
            //这是查询全部的
            List<Order> orders = orderService.queryAllOrder();
            commonData.setTotal(orders.size());
            commonData.setItems(orders);
            commonResult.setData(commonData);
        }else {
            //这是按条件查询
            List<Order> orders = orderService.queryOrderByConditions(userId,orderSn,orderStatusArray);
            if (orders.size() < 1)
                return null;
            commonData.setTotal(orders.size());
            commonData.setItems(orders);
            commonResult.setData(commonData);
        }
        //没有查询到数据则返回null
        if (commonData.getTotal()<1){
            return null;
        }
        commonResult.setErrno(0);
        commonResult.setErrmsg("成功");
        return commonResult;
    }
}
