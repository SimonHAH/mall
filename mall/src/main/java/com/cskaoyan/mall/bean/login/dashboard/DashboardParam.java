package com.cskaoyan.mall.bean.login.dashboard;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DashboardParam {
    private DashboardData data;
    private String errmsg;
    private Integer errno;
}
