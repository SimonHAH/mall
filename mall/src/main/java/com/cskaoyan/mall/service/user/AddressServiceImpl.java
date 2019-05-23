package com.cskaoyan.mall.service.user;

import com.cskaoyan.mall.bean.common.CommonData;
import com.cskaoyan.mall.bean.common.CommonResult;
import com.cskaoyan.mall.bean.user.AddressVO;
import com.cskaoyan.mall.mapper.user.AddressMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Nemo
 * @version 1.0
 * @date 2019/5/23
 */
@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressMapper addressMapper;

    @Override
    public CommonResult getList(int page, int limit, String sort, String order) {

        PageHelper.startPage(page, limit);

        List<AddressVO> list = addressMapper.getList(sort, order);

        PageInfo<AddressVO> pageInfo = new PageInfo<>();
        long total = pageInfo.getTotal();

        CommonData<AddressVO> commonData = new CommonData<>();
        commonData.setTotal(total);
        commonData.setItems(list);

        CommonResult commonResult = new CommonResult();
        commonResult.setData(commonData);
        commonResult.setErrno(0);
        commonResult.setErrmsg("成功");


        return null;
    }
}
