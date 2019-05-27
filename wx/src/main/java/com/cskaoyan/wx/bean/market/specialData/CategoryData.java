package com.cskaoyan.wx.bean.market.specialData;

import lombok.Data;

@Data
public class CategoryData {

    private String desc;
    private String iconUrl;
    private Integer id;
    private String keywords;
    private String level;
    private String name;
    private String picUrl;
    private CategoryData[] children;
}
