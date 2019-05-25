package com.cskaoyan.mall.controller.marketController;
import com.cskaoyan.mall.bean.market.specialData.IssueData;
import com.cskaoyan.mall.bean.market.commonData.MyCommonResult;
import com.cskaoyan.mall.bean.market.commonData.MyCommonsData;
import com.cskaoyan.mall.service.marketService.GeneralIssueService;
import com.cskaoyan.mall.utils.GetRequestPayload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.*;

@RestController
public class GeneralIssueController {

    @Autowired
    private GeneralIssueService generalIssueService;
    @GetMapping("/issue/list")
    public MyCommonResult list(String question){
        question = "".equals(question)?null:question;
        if (question==null){
            //查询全部的问题
           return generalIssueService.queryAllIssue();
        }else {
            //按照查询条件模糊搜索查询
           return generalIssueService.queryIssueByName(question);
        }
    }

    @PostMapping(value = "/issue/create")
    public MyCommonResult create(HttpServletRequest res){
        return generalIssueService.insertIssue(res);




    }
}
