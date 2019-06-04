package com.cskaoyan.mall.service.promotion;

import com.cskaoyan.mall.bean.common.CommonData;
import com.cskaoyan.mall.bean.common.CommonResult;
import com.cskaoyan.mall.bean.promotion.Topic;
import com.cskaoyan.mall.mapper.promotion.TopicMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicServiceImpl implements TopicService{

    @Autowired
    TopicMapper topicMapper;

    @Override
    public CommonResult getList(int page, int limit, String sort, String order) {
        PageHelper.startPage(page, limit);
        List<Topic> topics = topicMapper.findAll(sort, order);
        CommonResult result = new CommonResult();
        result.setErrmsg("成功");
        result.setErrno(0);

        PageInfo<Topic> pageInfo = new PageInfo<>(topics);
        CommonData<Topic> data = new CommonData<>();
        data.setItems(topics);
        data.setTotal(pageInfo.getTotal());
        result.setData(data);

        return result;
    }
}
