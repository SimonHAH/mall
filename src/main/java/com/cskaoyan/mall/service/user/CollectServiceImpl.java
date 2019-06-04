package com.cskaoyan.mall.service.user;

import com.cskaoyan.mall.bean.common.CommonData;
import com.cskaoyan.mall.bean.common.CommonResult;
import com.cskaoyan.mall.bean.user.Collect;
import com.cskaoyan.mall.mapper.user.CollectMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Nemo
 * @version 1.0
 * @date 2019/5/24
 */
@Service
public class CollectServiceImpl implements CollectService {

    @Autowired
    CollectMapper collectMapper;

    @Override
    public CommonResult getList(int page, int limit, String userId, String valueId, String sort, String order) {

        PageHelper.startPage(page, limit);

        if (userId == null) {
            userId = "";
        }
        if (valueId == null) {
            valueId = "";
        }

        List<Collect> list = collectMapper.getList(userId, valueId, sort, order);

        /*PageInfo<Collect> pageInfo = new PageInfo<>();
        long total = pageInfo.getTotal();*/
        long total = list.size();

        CommonData<Collect> commonData = new CommonData<>();
        commonData.setItems(list);
        commonData.setTotal(total);

        CommonResult commonResult = new CommonResult();
        commonResult.setData(commonData);
        commonResult.setErrmsg("成功");
        commonResult.setErrno(0);

        return commonResult;
    }
}
