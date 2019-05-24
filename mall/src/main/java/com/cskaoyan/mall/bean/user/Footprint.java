package com.cskaoyan.mall.bean.user;

import lombok.Data;

/**
 * @author Nemo
 * @version 1.0
 * @date 2019/5/24
 */
@Data
public class Footprint {

    private int id;
    private int userId;
    private int goodsId;
    private String addTime;
    private String updateTime;
    private Boolean deleted;

}
