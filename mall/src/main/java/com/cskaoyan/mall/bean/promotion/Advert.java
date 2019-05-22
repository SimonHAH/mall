package com.cskaoyan.mall.bean.promotion;

import lombok.Data;

import java.util.Date;

@Data
public class Advert {
    int id;
    String name;
    String link;
    String url;
    int position;
    String content;
    int enabled;
    Date addTime;
    Date updateTime;
    int deleted;
}
