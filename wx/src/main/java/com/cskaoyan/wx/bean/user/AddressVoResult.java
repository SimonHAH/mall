package com.cskaoyan.wx.bean.user;

import lombok.Data;

/**
 * @author Nemo
 * @version 1.0
 * @date 2019/5/25
 */
@Data
public class AddressVoResult {
    AddressVoData data;
    String errmsg;
    int errno;
}
