package com.cjhstudy.dao;

import com.cjhstudy.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author: phil
 * @ProjectName: Mybatis
 * @Date: 2021/4/18
 */
public interface UserMapper {
    //查询
    List<User> getUserList();

    //根据id查询用户
    User selectUserById(int id);

    //修改一个用户
    int updateUser(User user);

    //增加一个用户
    int addUser(User user);

    //删除一个用户
    int deleteUser(int id);


    //万能Map
    int updateUser2(Map<String ,Object> map);

}
