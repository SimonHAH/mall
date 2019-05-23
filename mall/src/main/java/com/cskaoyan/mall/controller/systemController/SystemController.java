package com.cskaoyan.mall.controller.systemController;

import com.cskaoyan.mall.bean.common.CommonResult;
import com.cskaoyan.mall.bean.system.AdminRole;
import com.cskaoyan.mall.service.systemService.AdminLogService;
import com.cskaoyan.mall.utils.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by HorseXInsect
 * 2019/5/22 22:36
 */
@Controller
public class SystemController {


    @Autowired
    AdminLogService adminLogService;


    @RequestMapping("/log/list")
    @ResponseBody
    public CommonResult getList(String name, @RequestParam(defaultValue = "1") Integer page,
                                @RequestParam(defaultValue = "10") Integer limit, String sort, String order) {
        CommonResult commonResult = adminLogService.getList(name, page, limit, sort, order);
        return commonResult;
    }




}
