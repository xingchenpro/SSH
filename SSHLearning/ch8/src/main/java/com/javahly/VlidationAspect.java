package com.javahly;

import org.aspectj.lang.JoinPoint;

import java.util.Arrays;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/6/28
 * @QQ :1136513099
 * @desc :
 */
public class VlidationAspect {

    public void validateArgs(JoinPoint joinPoint){
        System.out.println("-->validate:" + Arrays.asList(joinPoint.getArgs()));
    }

}