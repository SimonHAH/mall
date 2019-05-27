package com.cskaoyan.wx.bean.user;

import lombok.Data;

import java.util.HashMap;

/**
 * @author Nemo
 * @version 1.0
 * @date 2019/5/25
 */
@Data
public class AddressVoData {

    HashMap<String, String> items;
    Long total;
}
