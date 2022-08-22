package com.hotmaxx.model.vo;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AllianceShopVO {
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
     * 保证金额度
     */
    String marginLine;
    /**
     * 授信额度
     */
    String creditLine;
    /**
     * 创建时间
     */
    LocalDateTime createTime;
    /**
     * 开户银行
     */
    String accountBank;
    /**
     * 银行卡号
     */
    Integer accountCardNum;
    /**
     * 开户名
     */
    String accountName;
    /**
     * 虚拟开户银行
     */
    String virtualAccountBank;
    /**
     * 虚拟卡号
     */
    String virtualAccountCardNum;



}
