package com.javahly.action;

import com.opensymphony.xwork2.ActionSupport;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/5/12
 */
//http://localhost:8080/gotoindex.action
//https://www.cnblogs.com/baichangfu/p/6955187.html
//https://blog.csdn.net/zsbgood/article/details/81114038
public class CheckAction extends ActionSupport {
    private String username;
    private String password;
    private String password2;
    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void validate() {
        System.out.println("全局验证中");
        if (getUsername() == null || "".equals(getUsername().trim())) {
            this.addFieldError("usernameMsg", "用户名不能为空!");
        }
        if (getPassword().trim().length() == 0) {
            this.addFieldError("passwordMsg", "密码不能为空!");
        }
        if (!getPassword().equals(getPassword2())) {
            this.addFieldError("password2Msg", "两次输入密码不同!");
        }
        else {
            Pattern p = Pattern.compile("^[A-Za-z\\d]+([-_.][A-Za-z\\d]+)*@([A-Za-z\\d]+[-.])+[A-Za-z\\d]{2,4}$");
            Matcher m = p.matcher(getEmail().trim());
            if(!m.matches()){
                this.addFieldError("emailMsg","请输入正确邮箱");
            }
        }
    }

    @Override
    public String execute() {
        System.out.println("go to success.jsp");
        return SUCCESS;
    }
}

