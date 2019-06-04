package com.cskaoyan.mall.bean.login.dashboard;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DashboardData {
    private Integer goodsTotal;
    private Integer orderTotal;
    private Integer productTotal;
    private Integer userTotal;
}
