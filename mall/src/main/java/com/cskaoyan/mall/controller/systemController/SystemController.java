package com.cskaoyan.mall.controller.systemController;

import com.cskaoyan.mall.bean.system.Options;
import com.cskaoyan.mall.service.systemService.OptionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by HorseXInsect
 * 2019/5/22 22:36
 */
@Controller
public class SystemController {

    @RequestMapping("/role")
    @ResponseBody
    public Options options() {
        return new Options();
    }

    @Autowired
    OptionsService optionsService;

    @RequestMapping("/query")
    @ResponseBody
    public Options queryCount() {
        Options options = optionsService.queryCount();
        return options;
    }
}
