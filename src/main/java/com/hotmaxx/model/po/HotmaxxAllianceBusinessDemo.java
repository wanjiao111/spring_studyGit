package com.hotmaxx.model.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("hotmaxx_alliance_business")
public class HotmaxxAllianceBusinessDemo {
    /**
     * id
     */
    private  Integer id;
    /**
     * 加盟商名称
     */
    private   String name;
    /**
     * 加盟商编码
     */
    private   String code;
    /**
     * 加盟商等级
     */
    private  String grade;
    /**
     * 联系方式
     */
    private   String mobile;
    /**
     * 邮箱
     */
    private    String email;
    /**
     * 地址
     */
    private   String address;
    /**
     * 开户银行
     */
    private  String accountBank;
    /**
     * 开户支行
     */
    private  String accountBranchBank;
    /**
     * 银行卡号
     */
    private Integer accountCardNum;
    /**
     * 开户名
     */
    private  String accountName;
    /**
     * 结算方式 1周结 2 指定n天一结
     */
    private   Integer clearingForm;
    /**
     * 结算周期 1 7天一结（周六~周五，周六出）
     */
    private  Integer clearingPeriod;
    /**
     * 状态  1 生效  2 停用
     */
    private Integer status;
    /**
     * 省份
     */
    private  String province;
    /**
     * 省份编码
     */
    private   String provinceCode;
    /**
     * 城市
     */
    private String city;
    /**
     * 城市编码
     */
    private   String cityCode;
    /**
     * 区域
     */
    private  String region;
    /**
     * 区域编码
     */
    private  String regionCode;

    /**
     * 创建人
     */
    private   String createBy;
    /**
     * 创建时间
     */
    private   LocalDateTime createTime;
    /**
     * 更新人
     */
    private   String updateBy;
    /**
     * 更新时间
     */
    private  LocalDateTime updateTime;
    /**
     * 是否删除
     */
    private   Integer isDelete;
}
