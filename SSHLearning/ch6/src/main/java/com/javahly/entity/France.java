package com.javahly.entity;

import com.javahly.service.IAxe;
import com.javahly.service.IPerson;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/5/28
 * @QQ :1136513099
 * @desc :
 */
public class France implements IPerson {
    private IAxe axe;
    private IAxe axe2;
    private String name;
    public France() {
    }
    public France(IAxe axe,IAxe axe2,String name) {
        this.axe = axe;
        this.axe2 = axe2;
        this.name = name;
    }
    public void userAxe() {
        axe.chop();
        axe2.chop();
        System.out.println("在useAxe内显示："+name);
    }
}
