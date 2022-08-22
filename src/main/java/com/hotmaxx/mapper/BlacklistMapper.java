package com.hotmaxx.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hotmaxx.model.po.BlacklistDemo;
import com.hotmaxx.model.po.EmployeeEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BlacklistMapper extends BaseMapper<BlacklistDemo> {

//    List<BlacklistDemo> getByPhoneSQL(@Param("phone") String phone);


}
