package com.cskaoyan.mall.bean.promotion;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Topic {

    private int id;
    private String title;
    private String subtitle;
    private String content;
    private BigDecimal price;
    private String readCount;
    private String picUrl;
    private int sortOrder;
    private String goods;
    private Date addTime;
    private Date updateTime;
    private int deleted;
}