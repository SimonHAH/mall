package com.cskaoyan.mall.bean.user;

import lombok.Data;

/**
 * @author Nemo
 * @version 1.0
 * @date 2019/5/25
 */
@Data
public class Feedback {

    private int id;
    private int userId;
    private String username;
    private String mobile;
    private String feedType;
    private String content;
    private int status;
    private int hasPicture;
    private String picUrls;
    private String addTime;
    private String updateTime;
    private Boolean deleted;
}
