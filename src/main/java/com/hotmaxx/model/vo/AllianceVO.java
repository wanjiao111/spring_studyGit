package com.hotmaxx.model.vo;

import cn.hutool.core.date.DateTime;
import lombok.Data;

@Data
public class AllianceVO {
    /**
     * id
     */
    int id;
    /**
     * 加盟商名称
     */
    String name;
    /**
     * 加盟商编码
     */
    String code;
    /**
     * 加盟商等级
     */
    String grade;
    /**
     * 联系方式
     */
    String mobile;
    /**
     * 邮箱
     */
    String email;
    /**
     * 地址
     */
    String address;
    /**
     * 开户银行
     */
    String accountBank;
    /**
     * 开户支行
     */
    String accountBranchBank;
    /**
     * 银行卡号
     */
    Integer accountCardNum;
    /**
     * 开户名
     */
    String accountName;
    /**
     * 结算方式 1周结 2 指定n天一结
     */
    int clearingForm;
    /**
     * 结算周期 1 7天一结（周六~周五，周六出）
     */
    int clearingPeriod;
    /**
     * 状态  1 生效  2 停用
     */
    int status;
    /**
     * 省份
     */
    String province;
    /**
     * 省份编码
     */
    String provinceCode;
    /**
     * 城市
     */
    String city;
    /**
     * 城市编码
     */
    String cityCode;
    /**
     * 区域
     */
    String region;
    /**
     * 区域编码
     */
    String regionCode;
    /**
     * 加盟商绑定门店编码
     */
    String allianceBindShopCode;
    /**
     * 创建人
     */
    String createBy;
    /**
     * 创建时间
     */
    String createTime;
    /**
     * 更新人
     */
    String updateBy;
    /**
     * 更新时间
     */
    DateTime updateTime;
    /**
     * 是否删除
     */
    int isDelete;
}
