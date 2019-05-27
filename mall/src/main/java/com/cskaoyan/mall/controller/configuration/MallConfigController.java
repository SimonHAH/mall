package com.cskaoyan.mall.controller.configuration;

import com.cskaoyan.mall.bean.common.CommonResult;
import com.cskaoyan.mall.bean.configuration.MallConfig;
import com.cskaoyan.mall.service.configuration.MallConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/config")
public class MallConfigController {

    @Autowired
    MallConfigService mallConfigService;

    @RequestMapping(value = "/mall",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult findMall(){
        CommonResult commonResult = mallConfigService.findMallConfig();
        return commonResult;
    }

    @RequestMapping(value = "/mall",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateMall(@RequestBody MallConfig mallConfig){
        //接收的数据不对
        //MallConfig mallConfig = new MallConfig(litemall_mall_name, litemall_mall_address, litemall_mall_phone, litemall_mall_qq);
        CommonResult commonResult = mallConfigService.updateMallConfig(mallConfig);
        return commonResult;
    }

}
