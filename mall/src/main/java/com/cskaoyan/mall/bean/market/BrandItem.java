package com.cskaoyan.mall.bean.market;

import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
public class BrandItem {

    private Timestamp addTime;
    private Integer deleted;
    private String desc;
    private BigDecimal floorPrice;
    private Integer id;
    private String name;
    private String picUrl;
    private Integer sortOrder;
    private Timestamp updateTime;
}
