package com.cskaoyan.mall.bean.market;

import lombok.Data;

@Data
public class ReturnRegionData {
    private RegionData[] data;
    private String errmsg;
    private Integer errno;
}
