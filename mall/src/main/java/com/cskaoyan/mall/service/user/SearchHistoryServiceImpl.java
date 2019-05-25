package com.cskaoyan.mall.service.user;

import com.cskaoyan.mall.bean.common.CommonData;
import com.cskaoyan.mall.bean.common.CommonResult;
import com.cskaoyan.mall.bean.user.SearchHistory;
import com.cskaoyan.mall.mapper.user.SearchHistoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Nemo
 * @version 1.0
 * @date 2019/5/25
 */
@Service
public class SearchHistoryServiceImpl implements SearchHistoryService {

    @Autowired
    SearchHistoryMapper searchHistoryMapper;

    @Override
    public CommonResult getList(int page, int limit, String sort, String order, String userId, String keyword) {

        if (userId == null) {
            userId = "";
        }
        if (keyword == null) {
            keyword = "";
        }

        List<SearchHistory> list = searchHistoryMapper.getList(sort, order, userId, keyword);

        CommonData<SearchHistory> commonData = new CommonData<>();
        commonData.setTotal(list.size());
        commonData.setItems(list);

        CommonResult commonResult = new CommonResult();
        commonResult.setErrno(0);
        commonResult.setErrmsg("成功");
        commonResult.setData(commonData);

        return commonResult;
    }
}
