package com.hotmaxx.model.query;

import cn.hutool.core.date.DateTime;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class AllianceMarginQuery {
    /**
     * 加盟商名称编码
     */
    String allianceNameCode;
    /**
     * 加盟商绑定门店名称
     */
    String shopNameCode;
    /**
     * 保证金流水查询创建开始时间
      */
    LocalDate createTimeStart;
    /**
     * 保证金流水查询创建结束时间
     */
    LocalDate createTimeEnd;
    /**
     * 保证金变动类型
     */
    String type;
}
