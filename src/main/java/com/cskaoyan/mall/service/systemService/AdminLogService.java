package com.cskaoyan.mall.service.systemService;


import com.cskaoyan.mall.bean.common.CommonResult;
import com.cskaoyan.mall.bean.system.AdminRole;

import java.util.List;

/**
 * Created by HorseXInsect
 * 2019/5/22 23:12
 */
public interface AdminLogService {


    CommonResult getList(String name, Integer page, Integer limit, String sort, String order);


}
