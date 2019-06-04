package com.cskaoyan.mall.bean.market;

import lombok.Data;

@Data
public class ReturnBrandData {
    private String errmsg;
    private Integer errno;
    private BrandData data;
}
