package com.qinliang.transactiontest.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("beauty")
public class Beauty {


    @TableId("id")
    private Integer id;

    private String name;

    private String sex;

    private Date bornDate;

    private String phone;

    private String photo;

    private Integer boyfriendId;


}
