package com.cskaoyan.mall.controller.marketController;

import com.cskaoyan.mall.bean.market.BrandData;
import com.cskaoyan.mall.bean.market.BrandItem;
import com.cskaoyan.mall.bean.market.ReturnBrandData;
import com.cskaoyan.mall.mapper.marketMapper.BrandMapper;
import com.cskaoyan.mall.service.marketService.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class BrandController {

    @Autowired
    private BrandService brandService;

    @GetMapping("/brand/list")
    @ResponseBody
    public ReturnBrandData list(String name,String id){

        if ("".equals(name) || "".equals(id)){
            name = null;
            id = null;
        }
        ReturnBrandData returnBrandData = new ReturnBrandData();
        BrandData brandData = new BrandData();
        if (name == null && id == null )
        {
            BrandItem[] brandItems = brandService.queryAllBrand();
            Integer records = brandService.queryRecords();

            brandData.setTotal(records);
            brandData.setItems(brandItems);

            returnBrandData.setData(brandData);

        } else {
            //按照品牌名或者id去查找
            BrandItem[] brandItems = brandService.queryBrandByConditions(name, id);
            int records = brandItems.length;
            brandData.setTotal(records);
            brandData.setItems(brandItems);

            returnBrandData.setData(brandData);
        }

        if (returnBrandData.getData().getTotal()<1){
            return null;
        }else {
            returnBrandData.setErrmsg("成功");
            returnBrandData.setErrno(0);
            return returnBrandData;
        }
    }
}
