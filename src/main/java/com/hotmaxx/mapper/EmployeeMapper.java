package com.hotmaxx.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hotmaxx.model.po.EmployeeDemo;
import com.hotmaxx.model.vo.EmployeeDemoVO;
import com.hotmaxx.model.vo.InformationVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EmployeeMapper extends BaseMapper<EmployeeDemo> {

//
    List<EmployeeDemo> getByPhoneSQL(@Param("phone") String phone);

    List<EmployeeDemo> getByPostName();
    List<EmployeeDemoVO> getThePhone();
//    String getTheManager();

//    String getTheManagerMap();
    List<EmployeeDemoVO> getTheManagerMap();
    List<InformationVO> getHsrByShopCode(String shopCode);


}
