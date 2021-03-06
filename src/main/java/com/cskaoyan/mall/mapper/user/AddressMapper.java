package com.cskaoyan.mall.mapper.user;

import com.cskaoyan.mall.bean.user.Address;
import com.cskaoyan.mall.bean.user.AddressVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Nemo
 * @version 1.0
 * @date 2019/5/23
 */
@Mapper
public interface AddressMapper {


    List<AddressVO> getList(String sort, String order);

}
