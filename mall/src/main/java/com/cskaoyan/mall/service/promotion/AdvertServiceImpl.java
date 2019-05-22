package com.cskaoyan.mall.service.promotion;

import com.cskaoyan.mall.bean.common.CommonData;
import com.cskaoyan.mall.bean.common.CommonResult;
import com.cskaoyan.mall.bean.promotion.Advert;
import com.cskaoyan.mall.mapper.promotion.AdvertMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdvertServiceImpl implements AdvertService {

    @Autowired
    AdvertMapper advertMapper;


    @Override
    public CommonResult getList(int page, int limit, String sort, String order) {
        //分页处理
        PageHelper.startPage(page, limit);
        List<Advert> adverts = advertMapper.find(sort,order);
        //创建一个返回值对象
        CommonResult result = new CommonResult();
        result.setErrmsg("成功");
        result.setErrno(0);

        //取记录总条数
        PageInfo<Advert> pageInfo = new PageInfo<>(adverts);
        CommonData<Advert> data = new CommonData<>();
        data.setItems(adverts);
        data.setTotal(pageInfo.getTotal());
        result.setData(data);

        return result;
    }
}
