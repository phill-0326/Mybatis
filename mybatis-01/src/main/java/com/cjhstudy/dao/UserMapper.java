package com.cjhstudy.dao;

import com.cjhstudy.pojo.User;

import java.util.List;

/**
 * @author: phil
 * @ProjectName: Mybatis
 * @Date: 2021/4/18
 */
public interface UserMapper {
    List<User>selectUser();
}
