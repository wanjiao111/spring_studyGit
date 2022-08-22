package com.hotmaxx.model.po;

import cn.hutool.core.date.DateTime;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@TableName("hotmaxx_alliance_margin")
public class HotmaxxAllianceMarginDemo {
    private Integer id;
    /**
     * 流水号
     */
    private String flowingBizNo;
    /**
     * 保证金额度
     */
    private BigDecimal margin;
    /**
     * 保证金变动金额
     */
    private BigDecimal marginChange;
    /**
     * 加盟商名称
     */
    private String allianceName;
    /**
     * 加盟商编码
     */
    private String allianceCode;
    /**
     * 门店名称
     */
    private String shopName;
    /**
     * 门店编码
     */
    private String shopCode;
    /**
     * 保证金变动类型
     */
    private String type;
    /**
     * 保证进变动原因
     */
    private String reason;
    /**
     * 状态
     */
    private String status;
    /**
     * 创建人
     */
    private String createBy;
    /**
     * 创建时间
     */
    private LocalDate createTime;
    /**
     * 更新人
     */
    private String updateBy;
    /**
     * 更新时间
     */
    private DateTime updateTime;
    /**
     * 是否删除
     */
    private String isDelete;
}
