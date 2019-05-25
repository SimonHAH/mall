package com.cskaoyan.mall.bean.market.specialData;

import lombok.Data;

import java.util.List;

@Data
public class RegionData {
    private Integer code;
    private Integer id;
    private String name;
    private Integer type;
    private List<RegionData> children;
}
