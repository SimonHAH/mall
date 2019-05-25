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

        MyCommonResult commonResult = new MyCommonResult<MyCommonsData>();
        MyCommonsData<IssueData> commonData = new MyCommonsData<>();
        List<IssueData> list;

        if (question==null){
            //查询全部的问题
            list = generalIssueService.queryAllIssue();
        }else {
            //按照查询条件模糊搜索查询
            list = generalIssueService.queryIssueByName(question);
        }
        //检查查询结果
        if (list.size()<1){
            //没有查到数据
            return null;
        }
        //查到了数据封装结果集
        commonData.setItems(list);
        commonData.setTotal(list.size());
        commonResult.setData(commonData);
        commonResult.setErrmsg("成功");
        commonResult.setErrno(0);
        return commonResult;
    }

    @PostMapping(value = "/issue/create")
    public MyCommonResult create(HttpServletRequest res){
        //设置数据结果集
        MyCommonResult commonResult = new MyCommonResult<MyCommonsData>();
        MyCommonsData<IssueData> commonData = new MyCommonsData<>();
        IssueData data = new IssueData();
        //处理请求参数
        Map map = GetRequestPayload.getRequestPayload(res);
        String question = (String) map.get("question");
        String answer = (String) map.get("answer");
        //设置插入数据的时间点
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        //设置要插入的数据
        data.setQuestion(question);
        data.setAnswer(answer);
        data.setAddTime(timestamp.toString());
        data.setUpdateTime(timestamp.toString());
        data.setDeleted(false);

        //插入这条数据并返回这条数据
        List<IssueData> issueData = generalIssueService.insertIssue(data);
        commonData.setItems(issueData);
        commonData.setTotal(1);
        commonResult.setData(commonData);
        commonResult.setErrno(0);
        commonResult.setErrmsg("成功");
        return commonResult;
    }
}
