package com.javahly;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/6/28
 * @QQ :1136513099
 * @desc :
 */
public class Main {

    public static void main(String[] args){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-xml.xml");
        ArithmeticCalculator arithmeticCalculator = (ArithmeticCalculator) ctx.getBean("arithmeticCalculator");
        System.out.println("arithmeticCalculator:"+arithmeticCalculator.getClass().getName());
        int result = arithmeticCalculator.add(1,2);
        System.out.println("result:"+result);
        result = arithmeticCalculator.div(1000,0);
        System.out.println("result:"+result);

    }
}
