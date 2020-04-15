package com.heavent.spring.dao;

import lombok.Data;

/**
 * @Title 类说明
 * @Description 简要
 * @Author Heavent
 * @Date 2020-03-28
 * @Version 1.0.0
 **/
@Data
public class User {

    private String id;
    private String name;
    private int age;
    private int gender;
    private String email;
    private String phone;
    private String address;
    private int availd;
    private String createTime;
    private String createBy;
    private String updateTime;
    private String updateBy;

}
