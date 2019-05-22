package com.cskaoyan.mall.bean.market;

import lombok.Data;

@Data
public class Region {
    private RegionData[][][] regionData;
    private String errmsg;
    private Integer errno;
}
