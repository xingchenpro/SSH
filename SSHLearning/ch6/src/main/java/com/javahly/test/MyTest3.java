package com.javahly.test;

import com.javahly.entity.France;
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
public class MyTest3 {

        public static void main(String[] args) {
            ApplicationContext apc = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
            //构造注入
            France france = (France) apc.getBean("france");
            france.userAxe();
    }
}
