package com.cskaoyan.wx.bean.user;

import lombok.Data;

/**
 * @author Nemo
 * @version 1.0
 * @date 2019/5/23
 */
@Data
public class Address {
    private int id;
    private String name;
    private int userId;
    private int provinceId;
    private int cityId;
    private int areaId;
    private String address;
    private String mobile;
    private int isDefault;
    private String addTime;
    private String updateTime;
    private Boolean deleted;
}
