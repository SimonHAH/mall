package com.cskaoyan.wx.bean.user;

import lombok.Data;

/**
 * @author Nemo
 * @version 1.0
 * @date 2019/5/24
 */
@Data
public class SearchHistory {

    private int id;
    private int userId;
    private String keyword;
    private String from;
    private String addTime;
    private String updateTime;
    private Boolean deleted;
}
