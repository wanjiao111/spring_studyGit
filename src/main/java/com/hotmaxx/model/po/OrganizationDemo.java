package com.hotmaxx.model.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("hotmaxx_organization")
public class OrganizationDemo {
    private String name;
    private LocalDateTime createTime;
    private String createBy;
    int a=10;
    int b=10;
    int c=10;
    int d=10;


}
