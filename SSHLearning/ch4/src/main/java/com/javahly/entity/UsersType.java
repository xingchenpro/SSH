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
public class UsersType {
    private int typeId;
    private String typeName;

    private Set<Users> userSet = new HashSet<Users>(0);

    public Set<Users> getUserSet() {
        return userSet;
    }
    public void setUserSet(Set<Users> userSet) {
        this.userSet = userSet;
    }
    public int getTypeId() {
        return typeId;
    }
    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }
    public String getTypeName() {
        return typeName;
    }
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

}
