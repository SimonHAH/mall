package com.cskaoyan.mall.service.marketService.impl;

import com.cskaoyan.mall.bean.market.commonData.MyCommonResult;
import com.cskaoyan.mall.bean.market.commonData.MyCommonsData;
import com.cskaoyan.mall.bean.market.specialData.BrandItem;
import com.cskaoyan.mall.mapper.marketMapper.BrandMapper;
import com.cskaoyan.mall.service.marketService.BrandService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BrandServiceImpl implements BrandService {

    MyCommonResult commonResult = new MyCommonResult<MyCommonsData>();
    MyCommonsData commonData = new MyCommonsData();
    List<BrandItem> list;
    PageInfo<BrandItem> pageInfo = new PageInfo<>();

    @Autowired
    BrandMapper brandMapper;

    private MyCommonResult setResult(long total){
        commonData.setItems(list);
        commonData.setTotal(total);
        commonResult.setData(commonData);
        commonResult.setErrmsg("成功");
        commonResult.setErrno(0);
        return commonResult;
    }

    @Override
    public MyCommonResult queryAllBrand(Integer page, Integer limit,String sort,String order) {
        PageHelper.startPage(page,limit);
        list = brandMapper.queryAllBrand(sort,order);

        return setResult(brandMapper.count());
    }

    @Override
    public MyCommonResult queryBrandByConditions(String name,String id,Integer page, Integer limit,String sort,String order) {
        name = "".equals(name) ? null : name;
        id = "".equals(id) ? null : id;

        if (name == null && id == null){
            return queryAllBrand(page,limit,sort,order);
        }else {
            list = brandMapper.queryBrandByConditions(name, id,sort, order);
            pageInfo.setList(list);
            return setResult(pageInfo.getTotal());
        }
    }
}
