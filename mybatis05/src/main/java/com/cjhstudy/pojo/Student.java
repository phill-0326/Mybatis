package com.cjhstudy.pojo;

import lombok.Data;

/**
 * @author: phil
 * @ProjectName: Mybatis
 * @Date: 2021/4/19
 */
@Data//Get,SET,ToString, 有参，无参构造
public class Student {
    private int id;
    private String name;

    //多个学生可以是同一哥老师，即多对一
    private Teacher teacher;
}
