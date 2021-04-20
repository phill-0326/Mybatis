package com.cjhstudy.dao;

import com.cjhstudy.pojo.Teacher;

/**
 * @author: phil
 * @ProjectName: Mybatis
 * @Date: 2021/4/19
 */
public interface TeacherMapper {
//获取指定老师，及老师下的所学生
    public Teacher getTeacher(int id);

}
