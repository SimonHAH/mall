package com.cskaoyan.mall.bean.promotion;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Groupon {

    private int id;
    private Date addTime;
    private int deleted;
    private BigDecimal discount;
    private int discountMember;
    private Date expireTime;
    private int goodsId;
    private String goodsName;
    private String picUrl;
    private Date updateTime;
}
