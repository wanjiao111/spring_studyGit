package com.hotmaxx.model.po;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("hotmaxx_employee")
public class EmployeeDemo {


    private Long id;

    private String name;

//    @TableField(value = "name")
//    private String userName;

    private String mobile;
    private String postName;
    private String shopCode;
    private String createBy;
    private LocalDateTime createTime;
    private String ename;



//    @TableField(value = "post_name")
//    private String employeePostName;

}
