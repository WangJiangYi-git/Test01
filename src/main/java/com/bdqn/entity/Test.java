package com.bdqn.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

@TableName("test01")
public class Test {

    @TableId(value = "id",type = IdType.ID_WORKER_STR)
    private String id;
    @TableField("name")
    private String name;
    @TableField("sex")
    private String sex;
    @TableField("age")
    private int age;
    @TableField("hobby")
    private String hobby;
}
