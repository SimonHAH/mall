package com.cskaoyan.mall.service.marketService;

import com.cskaoyan.mall.bean.market.commonData.MyCommonResult;

import javax.servlet.http.HttpServletRequest;

public interface GeneralIssueService {
    MyCommonResult queryAllIssue();

    MyCommonResult queryIssueByName(String question);

    MyCommonResult insertIssue(HttpServletRequest res);
}
