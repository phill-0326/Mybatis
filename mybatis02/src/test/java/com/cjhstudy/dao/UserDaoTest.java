package com.cjhstudy.dao;

import com.cjhstudy.pojo.User;
import com.cjhstudy.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: phil
 * @ProjectName: Mybatis
 * @Date: 2021/4/18
 */
public class UserDaoTest {
    @Test
    public void test(){
        //第一步获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        //方式二 ：getMapper
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userDao.getUserList();

        for (User user : userList) {
            System.out.println(user);
        }

        //关闭流
        sqlSession.close();

    }

    @Test
    public void testSelectUserById(){
        //第一步获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        //第二步：getMapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.selectUserById(1);
        System.out.println(user);

        //关闭流
        sqlSession.close();
    }

    //增删改要提交事务
    @Test
    public void testUpdateUser(){
        //第一步获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        //第二步：getSession
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.updateUser(new User(2,"阿达","2342q"));

        //提交事务
        sqlSession.commit();

        //关闭流
        sqlSession.close();
    }

    //新增一个用户信息
    @Test
    public void testAddUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.addUser(new User(4,"三等奖ad","123765"));
        //提交事务
        sqlSession.commit();
        //关闭流
        sqlSession.close();
    }

    //删除一个用户
    @Test
    public void testDeleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser(4);

        //提交事务
        sqlSession.commit();
        //关闭流
        sqlSession.close();
    }

    //万能 Map
    @Test
    public void testUpdateUser2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        Map<String ,Object> map = new HashMap<String, Object>();
        map.put("helloName","jasldj");
        map.put("helloId","2");
        mapper.updateUser2(map);
        sqlSession.commit();
        sqlSession.close();

    }

}
