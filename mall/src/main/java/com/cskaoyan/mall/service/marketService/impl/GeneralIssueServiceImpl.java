package com.cskaoyan.mall.service.marketService.impl;

import com.cskaoyan.mall.bean.market.commonData.MyCommonResult;
import com.cskaoyan.mall.bean.market.commonData.MyCommonsData;
import com.cskaoyan.mall.bean.market.specialData.IssueData;
import com.cskaoyan.mall.mapper.marketMapper.GeneralIssueMapper;
import com.cskaoyan.mall.service.marketService.GeneralIssueService;
import com.cskaoyan.mall.utils.GetRequestPayload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

@Service
public class GeneralIssueServiceImpl implements GeneralIssueService {
    @Autowired
    private GeneralIssueMapper generalIssueMapper;
    MyCommonResult commonResult = new MyCommonResult<MyCommonsData>();
    MyCommonsData<IssueData> commonData = new MyCommonsData<>();
    List<IssueData> list;

    private MyCommonResult setResult(){
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

    @Override
    public MyCommonResult queryAllIssue() {
        list = generalIssueMapper.selectAll();
        return setResult();
    }

    @Override
    public MyCommonResult queryIssueByName(String question) {
        Example example = new Example(IssueData.class);
        example.createCriteria().andLike("question","%"+question+"%");
        list = generalIssueMapper.selectByExample(example);
        return setResult();
    }

    @Override
    public MyCommonResult insertIssue(HttpServletRequest res) {
        //设置数据结果集
        IssueData issueData = new IssueData();
        //处理请求参数
        Map map = GetRequestPayload.getRequestPayload(res);
        String question = (String) map.get("question");
        String answer = (String) map.get("answer");
        //设置插入数据的时间点
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        //设置要插入的数据
        issueData.setQuestion(question);
        issueData.setAnswer(answer);
        issueData.setAddTime(timestamp.toString());
        issueData.setUpdateTime(timestamp.toString());
        issueData.setDeleted(false);
        generalIssueMapper.insert(issueData);
//        //插入这条数据并返回这条数据
//
//        commonData.setItems(issueData);
//        commonData.setTotal(1);
//        commonResult.setData(commonData);
//        commonResult.setErrno(0);
//        commonResult.setErrmsg("成功");
        return queryAllIssue();
    }
}
