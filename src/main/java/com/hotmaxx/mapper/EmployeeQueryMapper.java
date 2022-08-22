package com.hotmaxx.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hotmaxx.model.po.EmployeeEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeQueryMapper extends BaseMapper<EmployeeEntity> {


}
