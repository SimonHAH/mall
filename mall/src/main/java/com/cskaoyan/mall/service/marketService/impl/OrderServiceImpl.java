package com.cskaoyan.mall.service.marketService.impl;

import com.cskaoyan.mall.bean.market.specialData.Order;
import com.cskaoyan.mall.mapper.marketMapper.OrderMapper;
import com.cskaoyan.mall.service.marketService.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderMapper orderMapper;
    @Override
    public List<Order> queryAllOrder() {
        return orderMapper.selectAll();
    }

    @Override
    public List<Order> queryOrderByConditions(String userId, String orderSn, String orderStatusArray) {
        Example example = new Example(Order.class);
        Example.Criteria criteria = example.createCriteria();
        if (userId!=null){
            criteria.andEqualTo("userId",userId);
        }
        if (orderSn!=null){
            criteria.andEqualTo("orderSn",orderSn);
        }
        if (orderStatusArray!=null){
            criteria.andEqualTo("orderStatus",orderStatusArray);
        }
        List<Order> orders = orderMapper.selectByExample(example);
        return orders;
    }
}
