package com.javahly.entity;

import com.javahly.service.IAxe;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/5/28
 * @QQ :1136513099
 * @desc :
 */
public class StoneAxe implements IAxe {
    public void chop() {
        System.out.println("stoneAxe is slow!!!");
    }
}

