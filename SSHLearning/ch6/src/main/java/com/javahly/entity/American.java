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
public class American implements IPerson {
    private IAxe axe;
    public void userAxe() {
        axe.chop();
    }

    public void setAxe(IAxe axe) {
        this.axe = axe;
    }
}

