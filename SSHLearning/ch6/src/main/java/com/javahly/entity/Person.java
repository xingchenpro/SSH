package com.javahly.entity;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/5/28
 * @QQ :1136513099
 * @desc :
 */
public class Person {
    private String name;

    public void sayHello(){
        System.out.println("hello, i am " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

