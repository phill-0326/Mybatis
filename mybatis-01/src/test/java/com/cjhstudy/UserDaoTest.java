package com.cjhstudy;

import com.cjhstudy.dao.UserMapper;
import com.cjhstudy.pojo.User;
import com.cjhstudy.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author: phil
 * @ProjectName: Mybatis
 * @Date: 2021/4/18
 */
public class UserDaoTest {
    @Test
    public void selectUser() {
        SqlSession session = MybatisUtils.getSession();
        //方法一:
      //  List<User> users = session.selectList("com.cjhstudy.dao.UserMapper.selectUser");
        //方法二:
        UserMapper userMapper = session.getMapper(UserMapper.class);
        List<User> users = userMapper.selectUser();

        for (User user: users){
            System.out.println(user);
        }
        session.close();
    }
}
