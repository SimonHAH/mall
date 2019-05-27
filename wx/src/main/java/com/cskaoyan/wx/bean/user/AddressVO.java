package com.cskaoyan.wx.bean.user;

import lombok.Data;

/**
 * @author Nemo
 * @version 1.0
 * @date 2019/5/23
 */
@Data
public class AddressVO extends Address {
    private String area;
    private String city;
    private String priovince;
}
