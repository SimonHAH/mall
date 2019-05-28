package com.cskaoyan.mall.controller.systemController;

import com.cskaoyan.mall.bean.common.CommonResult;
import com.cskaoyan.mall.bean.system.AdRole;
import com.cskaoyan.mall.service.systemService.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/role")
public class RoleController {

    @Autowired
    RoleService roleService;

    @RequestMapping("/list")
    @ResponseBody
    public CommonResult role(String name,@RequestParam(defaultValue = "1") Integer page,
                             @RequestParam(defaultValue = "20") Integer limit, String sort, String order){
        CommonResult commonResult = roleService.findRole(name, page, limit, sort, order);
        return commonResult;
    }

    @RequestMapping(value = "/create",method= RequestMethod.POST)
    @ResponseBody
    public CommonResult create(@RequestBody AdRole role) throws JSONException {
        CommonResult commonResult =roleService.create(role.getName(),role.getDesc());
        return commonResult;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public CommonResult delete(@RequestBody AdRole role){
        CommonResult commonResult =roleService.delete(role.getName());
        return commonResult;
    }

    @RequestMapping("/update")
    @ResponseBody
    public CommonResult update(@RequestBody AdRole role){
        CommonResult commonResult =roleService.update(role.getId(),role.getName(),role.getDesc());
        return commonResult;
    }

}
