package com.hotmaxx.model.vo;

import cn.hutool.core.date.DateTime;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class AllianceMarginVO {
    /**
     * 流水号
     */
    String flowingBizNo;
    /**
     * 加盟商名称
     */
    String allianceName;
    /**
     * 门店名称
     */
    String shopName;
    /**
     * 门店编码
     */
    String shopCode;
    /**
     * 创建时间
     */
    LocalDateTime createTime;
    /**
     * 保证金变动类型
     */
    String marginType;
    /**
     *保证金变动原因
     */
    String reason;

}
