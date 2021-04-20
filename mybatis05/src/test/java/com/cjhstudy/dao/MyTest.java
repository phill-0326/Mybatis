package com.cjhstudy.dao;

import com.cjhstudy.pojo.Student;
import com.cjhstudy.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author: phil
 * @ProjectName: Mybatis
 * @Date: 2021/4/19
 */
public class MyTest {
    @Test
    public void getStudentTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student = mapper.getStudent();
        System.out.println(student);

        sqlSession.close();
    }
    @Test
    public void getStudentTest2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student = mapper.getStudent2();
        for (Student student1 : student){
            System.out.println(
                    "学生名:"+ student1.getName()
                            +"\t老师:"+student1.getTeacher().getName());
        }

        sqlSession.close();
    }

}
