package com.cskaoyan.mall.controller.marketController;

import com.cskaoyan.mall.bean.market.specialData.BrandItem;
import com.cskaoyan.mall.bean.market.commonData.MyCommonsData;
import com.cskaoyan.mall.bean.market.commonData.MyCommonResult;
import com.cskaoyan.mall.service.marketService.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class BrandController {

    @Autowired
    private BrandService brandService;

    @GetMapping("/brand/list")
    @ResponseBody
    public MyCommonResult list(String name,String id){
        //处理请求参数 传入空参则同意按照null处理
        name = "".equals(name) ? null : name;
        id = "".equals(id) ? null : id;
        //建立空的结果集
        MyCommonResult commonResult = new MyCommonResult<MyCommonsData>();
        MyCommonsData commonData = new MyCommonsData();
        //查询参数为空说明是查询全部 不为空则是按条件检索
        if (name == null && id == null )
        {
            //查找数据
            List<BrandItem> brandItems = brandService.queryAllBrand();
            Integer records = brandService.queryRecords();
            //将查找到的数据封装进结果集
            commonData.setTotal(records);
            commonData.setItems(brandItems);
            commonResult.setData(commonData);

        } else {
            //按照品牌名或者id去查找
            List<BrandItem> brandItems = brandService.queryBrandByConditions(name, id);
            int records = brandItems.size();
            //封装结果集
            commonData.setTotal(records);
            commonData.setItems(brandItems);
            commonResult.setData(commonData);
        }

        //统一处理结果集
        if (commonData.getTotal()<1){
            //没有数据则返回null
            return null;
        }else {
            //有则设置成功响应并返回结果
            commonResult.setErrmsg("成功");
            commonResult.setErrno(0);
            return commonResult;
        }
    }
}
