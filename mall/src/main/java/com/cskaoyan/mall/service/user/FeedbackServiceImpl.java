package com.cskaoyan.mall.service.user;

import com.cskaoyan.mall.bean.common.CommonData;
import com.cskaoyan.mall.bean.common.CommonResult;
import com.cskaoyan.mall.bean.user.Feedback;
import com.cskaoyan.mall.mapper.user.FeedbackMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Nemo
 * @version 1.0
 * @date 2019/5/25
 */
@Service
public class FeedbackServiceImpl implements FeedbackService {

    @Autowired
    FeedbackMapper feedbackMapper;

    @Override
    public CommonResult getList(int page, int limit, String username, String id, String sort, String order) {

        if (username == null) {
            username = "";
        }
        if (id == null) {
            id = "";
        }

        List<Feedback> list = feedbackMapper.getList(username, id, sort, order);

        CommonData<Feedback> commonData = new CommonData<>();
        commonData.setItems(list);
        commonData.setTotal(list.size());

        CommonResult commonResult = new CommonResult();
        commonResult.setData(commonData);
        commonResult.setErrmsg("成功");
        commonResult.setErrno(0);

        return commonResult;
    }
}
