package com.heavent.spring.dao;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Title 部门类
 * @Description 简要
 * @Author Heavent
 * @Date 2020-03-29
 * @Version 1.0.0
 **/
@Data
public class Department {

    private int id;
    private String code;
    private String name;
    private User minister;
    private Set<User> employee;
    private List<User> excellentEmployee;
    private String[] teams;
    private Map<String, User> leader;

}
