package com.cskaoyan.mall.bean.promotion;

import lombok.Data;

import java.math.BigDecimal;
import java.sql.Date;

@Data
public class Coupon {
    private int id;
    private String name;
    private String desc;
    private String tag;
    private int total;
    private BigDecimal discount;
    private BigDecimal min;
    private int limit;
    private int type;
    private int status;
    private int goodsType;
    private String goodsValue;
    private int timeType;
    private int days;
    private Date addTime;
    private int deleted;
    private Date updateTime;
}
