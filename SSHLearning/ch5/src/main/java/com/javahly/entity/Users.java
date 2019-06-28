package com.javahly.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/5/12
 */
public class Users {
    private int uid;
    private String uname;
    private Set<Role> userroles = new HashSet<Role>();

    public int getUid() {
        return uid;
    }
    public void setUid(int uid) {
        this.uid = uid;
    }
    public String getUname() {
        return uname;
    }
    public void setUname(String uname) {
        this.uname = uname;
    }
    public Set<Role> getUserroles() {
        return userroles;
    }
    public void setUserroles(Set<Role> userroles) {
        this.userroles = userroles;
    }
}

