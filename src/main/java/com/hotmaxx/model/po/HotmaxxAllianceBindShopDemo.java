package com.hotmaxx.model.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("hotmaxx_alliance_bind_shop")
public class HotmaxxAllianceBindShopDemo {
    private String id;
    /**
     * 加盟商绑定门店名
     */
    private String shopName;
    /**
     * 加盟商绑定门店编码
     */
    private String shopCode;
    /**
     * 保证金额度
     */
    private String marginLine;
    /**
     * 开业时间
     */
    private LocalDateTime openingTime;
    /**
     * 授信额度
     */
    private String creditLine;
    /**
     * 加盟商编码
     */
    private String allianceCode;
    /**
     * 虚拟开户银行
     */
    private String virtualAccountBank;
    /**
     * 虚拟卡号
     */
    private Integer virtualAccountCardNum;
    /**
     * 虚拟开户主体
     */
    private String virtualAccountName;
    /**
     * 创建人
     */
    private String createBy;
    /**
     * 创建时间
     */
    private LocalDateTime createTime;
    /**
     * 更新人
     */
    private String updateBy;
    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
    /**
     * 是否删除
     */
    private String isDelete;

}
