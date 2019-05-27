package com.cskaoyan.mall.controller.systemController;

import com.cskaoyan.mall.bean.common.CommonResult;
import com.cskaoyan.mall.service.systemService.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdminShowController {

    @Autowired
    AdminService adminService;

    @RequestMapping(value = "/role/options",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult options(){
        CommonResult commonResult = adminService.findAdminRole();
        return commonResult;
    }

    @RequestMapping("/admin/list")
    @ResponseBody
    public CommonResult getList(@RequestParam(defaultValue = "1") Integer page,
                                @RequestParam(defaultValue = "20") Integer limit, String sort, String order){
        CommonResult commonResult = adminService.getList(page, limit, sort, order);
        return commonResult;
    }
}
