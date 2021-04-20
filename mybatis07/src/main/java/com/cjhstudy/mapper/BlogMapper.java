package com.cjhstudy.mapper;

import com.cjhstudy.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * @author: phil
 * @ProjectName: Mybatis
 * @Date: 2021/4/19
 */
public interface BlogMapper {
    //新增一个博客
    int addBlog(Blog blog);

    List<Blog> queryBlog(Map map);
}
