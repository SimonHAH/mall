package com.cskaoyan.mall.bean.market;

import lombok.Data;

@Data
public class Region {
    private RegionData[] data;
    private String errmsg;
    private Integer errno;
}
