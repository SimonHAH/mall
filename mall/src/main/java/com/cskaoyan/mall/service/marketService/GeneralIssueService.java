package com.cskaoyan.mall.service.marketService;

import com.cskaoyan.mall.bean.market.specialData.IssueData;

import java.util.List;

public interface GeneralIssueService {
    List<IssueData> queryAllIssue();

    List<IssueData> queryIssueByName(String question);

    List<IssueData> insertIssue(IssueData issueData);
}
