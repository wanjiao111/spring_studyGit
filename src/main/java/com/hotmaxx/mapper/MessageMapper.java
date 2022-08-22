package com.hotmaxx.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hotmaxx.model.po.MessageDemo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MessageMapper extends BaseMapper<MessageDemo> {

}
