package com.cjhstudy.utils;

import java.util.UUID;

/**
 * @author: phil
 * @ProjectName: Mybatis
 * @Date: 2021/4/19
 */
public class IDUtil {

    public static String genId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

}