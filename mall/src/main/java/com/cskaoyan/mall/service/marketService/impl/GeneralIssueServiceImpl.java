package com.cskaoyan.mall.service.marketService.impl;

import com.cskaoyan.mall.bean.market.specialData.IssueData;
import com.cskaoyan.mall.mapper.marketMapper.GeneralIssueMapper;
import com.cskaoyan.mall.service.marketService.GeneralIssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class GeneralIssueServiceImpl implements GeneralIssueService {
    @Autowired
    private GeneralIssueMapper generalIssueMapper;
    @Override
    public List<IssueData> queryAllIssue() {
        return generalIssueMapper.selectAll();
    }

    @Override
    public List<IssueData> queryIssueByName(String question) {
        Example example = new Example(IssueData.class);
        example.createCriteria().andLike("question","%"+question+"%");
        return generalIssueMapper.selectByExample(example);
    }

    @Override
    public List<IssueData> insertIssue(IssueData issueData) {
        generalIssueMapper.insert(issueData);
//        Example example = new Example(IssueData.class);
//        example.createCriteria().andEqualTo("question",issueData.getQuestion()).
//                andEqualTo("answer",issueData.getAnswer());
//        IssueData data = generalIssueMapper.selectOneByExample(example);
//        System.out.println(data);

        return queryAllIssue();
    }
}
