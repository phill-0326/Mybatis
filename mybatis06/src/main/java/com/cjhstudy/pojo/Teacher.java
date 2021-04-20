package com.cjhstudy.pojo;

import lombok.Data;

import java.util.List;

/**
 * @author: phil
 * @ProjectName: Mybatis
 * @Date: 2021/4/19
 */
@Data
public class Teacher {
    private int id;
    private String name;
    //一个老师对应多个学生
    private List<Student> students;
}
