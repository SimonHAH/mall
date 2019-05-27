package com.cskaoyan.mall.bean.configuration;

import lombok.Data;

@Data
public class MallConfig {
    private String litemall_mall_name;
    private String litemall_mall_address;
    private String litemall_mall_phone;
    private String litemall_mall_qq;

    public MallConfig() {
    }

    public MallConfig(String litemall_mall_name, String litemall_mall_address, String litemall_mall_phone, String litemall_mall_qq) {
        this.litemall_mall_name = litemall_mall_name;
        this.litemall_mall_address = litemall_mall_address;
        this.litemall_mall_phone = litemall_mall_phone;
        this.litemall_mall_qq = litemall_mall_qq;
    }
}
