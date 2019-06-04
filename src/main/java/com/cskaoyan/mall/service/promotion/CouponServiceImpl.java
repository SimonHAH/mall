package com.cskaoyan.mall.service.promotion;

import com.cskaoyan.mall.bean.common.CommonData;
import com.cskaoyan.mall.bean.common.CommonResult;
import com.cskaoyan.mall.bean.promotion.Coupon;
import com.cskaoyan.mall.mapper.promotion.CouponMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CouponServiceImpl implements CouponService{

    @Autowired
    CouponMapper couponMapper;

    @Override
    public CommonResult getList(int page, int limit, String sort, String order) {

        PageHelper.startPage(page, limit);
        List<Coupon> coupons = couponMapper.findAll(sort, order);

        CommonResult result = new CommonResult();
        result.setErrmsg("成功");
        result.setErrno(0);

        PageInfo<Coupon> pageInfo = new PageInfo<>(coupons);
        CommonData<Coupon> data = new CommonData<>();

        data.setItems(coupons);
        data.setTotal(pageInfo.getTotal());
        result.setData(data);

        return result;
    }
}
