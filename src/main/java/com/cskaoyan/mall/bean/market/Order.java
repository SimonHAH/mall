package com.cskaoyan.mall.bean.market;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@Table(name = "cskaoyan_mall_order")
public class Order {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;
    @Column(name = "actual_price")
    private Integer actualPrice;
    @Column(name = "add_time")
    private String addTime;

    private String address;
    private Integer comments;

    @Column(name = "confirm_time")
    private String confirmTime;

    private String consignee;

    @Column(name = "coupon_price")
    private Integer couponPrice;

    private Boolean deleted;

    @Column(name = "end_time")
    private String endTime;
    @Column(name = "freight_price")
    private Integer freightPrice;
    @Column(name = "goods_price")
    private Integer goodsPrice;
    @Column(name = "groupon_price")
    private Integer grouponPrice;
    @Column(name = "integral_price")
    private Integer integralPrice;

    private String message;
    private String mobile;

    @Column(name = "order_price")
    private BigDecimal orderPrice;
    @Column(name = "order_sn")
    private String orderSn;
    @Column(name = "order_status")
    private Integer orderStatus;
    @Column(name = "pay_id")
    private String payId;
    @Column(name = "pay_time")
    private String payTime;
    @Column(name = "ship_channel")
    private String shipChannel;
    @Column(name = "ship_sn")
    private String shipSn;
    @Column(name = "ship_time")
    private String shipTime;
    @Column(name = "update_time")
    private String updateTime;
    @Column(name = "user_id")
    private Integer userId;
}
