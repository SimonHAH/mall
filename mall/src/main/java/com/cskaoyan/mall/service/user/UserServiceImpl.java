package com.cskaoyan.mall.service.user;

import com.cskaoyan.mall.bean.common.CommonData;
import com.cskaoyan.mall.bean.common.CommonResult;
import com.cskaoyan.mall.bean.user.User;
import com.cskaoyan.mall.mapper.user.UserMapper;
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
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public CommonResult getList(Integer page, Integer limit, String sort, String order, String username, String mobile) {
        PageHelper.startPage(page, limit);

        if (username == null) {
            username = "";
        }
        if (mobile == null) {
            mobile = "";
        }

        List<User> list = userMapper.getList(sort, order, username, mobile);

        /*// 取记录总条数
        PageInfo<User> pageInfo = new PageInfo<>();
        long total = pageInfo.getTotal();*/
        long total = list.size();

        CommonData<User> commonData = new CommonData<>();
        commonData.setItems(list);
        commonData.setTotal(total);

        CommonResult commonResult = new CommonResult();
        commonResult.setData(commonData);
        commonResult.setErrmsg("成功");
        commonResult.setErrno(0);

        return commonResult;
    }
}
