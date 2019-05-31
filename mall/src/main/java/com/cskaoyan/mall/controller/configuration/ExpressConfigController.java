package com.cskaoyan.mall.controller.configuration;

import com.cskaoyan.mall.bean.common.CommonResult;
import com.cskaoyan.mall.service.configuration.ExpressConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/config")
public class ExpressConfigController {

    @Autowired
    ExpressConfigService expressConfigService;

    @RequestMapping("/express")
    @ResponseBody
    public CommonResult findExpress(){
        CommonResult commonResult = expressConfigService.findExpress();
        return commonResult;
    }
}
