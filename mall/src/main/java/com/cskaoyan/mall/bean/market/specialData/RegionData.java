package com.cskaoyan.mall.bean.market.specialData;

import lombok.Data;

@Data
public class RegionData {
    private Integer code;
    private Integer id;
    private String name;
    private Integer type;
    private RegionData[] children;
}
