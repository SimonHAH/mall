package com.cskaoyan.mall.service.user;

import com.cskaoyan.mall.bean.common.CommonData;
import com.cskaoyan.mall.bean.common.CommonResult;
import com.cskaoyan.mall.bean.user.Footprint;
import com.cskaoyan.mall.mapper.user.FootprintMapper;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Nemo
 * @version 1.0
 * @date 2019/5/24
 */
@Service
public class FootprintServiceImpl implements FootprintService {


    @Autowired
    FootprintMapper footprintMapper;

    @Override
    public CommonResult getList(int page, int limit, String userId, String goodsId, String sort, String order) {

        // PageHelper.startPage(page, limit);

        if (userId == null) {
            userId = "";
        }
        if (goodsId == null) {
            goodsId = "";
        }

        List<Footprint> list = footprintMapper.getList(userId, goodsId, sort, order);

        int total = footprintMapper.getTotal(userId, goodsId);

        CommonData<Footprint> commonData = new CommonData<>();
        commonData.setTotal(total);
        commonData.setItems(list);

        CommonResult commonResult = new CommonResult();
        commonResult.setData(commonData);
        commonResult.setErrno(0);
        commonResult.setErrmsg("成功");

        return commonResult;
    }
}
