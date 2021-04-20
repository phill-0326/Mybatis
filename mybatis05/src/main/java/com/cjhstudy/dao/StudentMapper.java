package com.cjhstudy.dao;

import com.cjhstudy.pojo.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author: phil
 * @ProjectName: Mybatis
 * @Date: 2021/4/19
 */
public interface StudentMapper {
    @Select("select * from student")
    public List<Student> getStudent();

    public List<Student> getStudent2();
}
