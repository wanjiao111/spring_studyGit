package com.hotmaxx.model.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
@Data
@TableName("hotmaxx_blacklist")
public class BlacklistDemo {


        private long id;
        private String name;
        private String phone;


        private String isDelete;

        private String createTime;

        private String createBy;




}
