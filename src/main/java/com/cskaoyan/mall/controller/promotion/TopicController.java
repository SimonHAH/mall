package com.cskaoyan.mall.controller.promotion;

import com.cskaoyan.mall.bean.common.CommonResult;
import com.cskaoyan.mall.service.promotion.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/topic")
public class TopicController {

    @Autowired
    TopicService topicService;

    @RequestMapping("/list")
    @ResponseBody
    public CommonResult list(int page, int limit, String sort, String order){
        CommonResult commonResult = topicService.getList(page, limit, sort, order);
        return commonResult;
    }
}
