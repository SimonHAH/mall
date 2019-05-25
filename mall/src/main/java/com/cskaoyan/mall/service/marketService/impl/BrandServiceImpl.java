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
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * list装数据的容器 封装进commonData
 * commonData 封装数据装入commonResult
 * commonResult 返回的结果集
 */
@Service
public class BrandServiceImpl implements BrandService {

    MyCommonResult commonResult = new MyCommonResult<MyCommonsData>();
    MyCommonsData commonData = new MyCommonsData();
    List<BrandItem> list;

    @Autowired
    BrandMapper brandMapper;

    /**
     * 返回结果集之前设置commonResult和commonData数据
     * @param total 满足条件的数据总数
     * @return com.cskaoyan.mall.bean.market.commonData.MyCommonResult
     */
    private MyCommonResult setResult(long total){
        commonData.setItems(list);
        commonData.setTotal(total);
        commonResult.setData(commonData);
        commonResult.setErrmsg("成功");
        commonResult.setErrno(0);
        return commonResult;
    }

    /**
     * @param page  页码
     * @param limit 每一页的页数
     * @param sort  排序所依赖的字段
     * @param order 排序的顺序
     * @return
     */
    @Override
    public MyCommonResult queryAllBrand(Integer page, Integer limit,String sort,String order) {
        PageHelper.startPage(page,limit);
        list = brandMapper.queryAllBrand(sort,order);
        return setResult(brandMapper.countByConditions(null,null));
    }

    /**
     * @param name  品牌的名称
     * @param id    品牌的id
     * @param page  页码
     * @param limit 每一页的页数
     * @param sort  排序所依赖的字段
     * @param order 排序的顺序
     * @return
     */
    @Override
    public MyCommonResult queryBrandByConditions(String name,String id,Integer page, Integer limit,String sort,String order) {
        name = "".equals(name) ? null : name;
        id = "".equals(id) ? null : id;

        if (name == null && id == null){
            return queryAllBrand(page,limit,sort,order);
        }else {
            PageHelper.startPage(page,limit);
            list = brandMapper.queryBrandByConditions(name, id,sort, order);
            return setResult(brandMapper.countByConditions(name,id));
        }
    }
}
