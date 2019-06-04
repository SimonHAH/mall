package com.cskaoyan.mall.bean.system;

import lombok.Data;

import java.util.Date;

/**
 * Created by HorseXInsect
 * 2019/5/23 16:51
 */
@Data
public class Log {

    Integer id;
    String admin;
    String action;
    Date addTime;
    String comment;
    Boolean deleted;
    String ip;
    String result;
    Boolean status;
    Integer type;
    Date updateTime;

}
