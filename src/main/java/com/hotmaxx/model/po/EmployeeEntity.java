package com.hotmaxx.model.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("hotmaxx_employeequery")
public class EmployeeEntity {
    private String employeeId;
    private String mobile;
    private  String states;
    @TableField(exist = false)
    private String region;
    private String position;
    private  String id;

}
