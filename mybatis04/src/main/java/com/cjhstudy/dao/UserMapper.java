package com.cjhstudy.dao;

import com.cjhstudy.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

/**
 * @author: phil
 * @ProjectName: Mybatis
 * @Date: 2021/4/18
 */
public interface UserMapper {
    //查询
    @Select("select * from user")
    List<User> getUserList();

    //根据id查询用户
    @Select("select * from user where id = #{id}")
    User selectUserById(int id);

    //修改一个用户
    @Update("update user set name=#{name},pwd=#{pwd} where id = #{id}")
    int updateUser(User user);

    //增加一个用户
    @Insert("insert into user (id,name,pwd) values(#{id},#{name},#{pwd})")
    int addUser(User user);

    //删除一个用户
    @Delete("delete from user where id = #{id}")
    int deleteUser(int id);


}
