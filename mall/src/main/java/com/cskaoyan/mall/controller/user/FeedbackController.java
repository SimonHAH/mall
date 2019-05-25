package com.cskaoyan.mall.controller.user;

import com.cskaoyan.mall.bean.common.CommonResult;
import com.cskaoyan.mall.service.user.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Nemo
 * @version 1.0
 * @date 2019/5/25
 */
@Controller
@RequestMapping("/feedback")
public class FeedbackController {

    @Autowired
    FeedbackService feedbackService;

    @RequestMapping("/list")
    @ResponseBody
    public CommonResult getList(int page, int limit, String username, String id, String sort, String order) {
        return feedbackService.getList(page, limit, username, id, sort, order);
    }
}
