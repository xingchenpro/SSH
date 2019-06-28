package com.javahly.test;

import com.javahly.entity.American;
import com.javahly.entity.Chinese;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/5/28
 * @QQ :1136513099
 * @desc :
 */
public class MyTest2 {
    public static void main(String[] args) {
        ApplicationContext apc = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //second 配置类及使用bean
        Chinese chinese = (Chinese) apc.getBean("chinese");
        chinese.userAxe();

        American american = (American) apc.getBean("american");
        american.userAxe();

    }

}
