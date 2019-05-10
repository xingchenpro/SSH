package com.javahly.controller;


import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/3/6
 */
public class UserController extends ActionSupport {

    private static final long serialVersionUID = 1L;
    private String userName;
    private String password;
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String login(){
        HttpServletRequest request = ServletActionContext.getRequest();
        ServletContext application = ServletActionContext.getServletContext();
        String referrer = request.getHeader("referer");
        int onlineUserCount = 0;
        if(referrer!=null&&userName.length()>0&&password.length()>0){
            request.getSession().setAttribute("username", userName);
            synchronized (application) {
                try {
                    onlineUserCount = (Integer) application.getAttribute("onlineUserCount");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                application.setAttribute("onlineUserCount",onlineUserCount+1);
            }
            return "success";
        }else{
            return "input";
        }
    }

    public String logout(){

        ServletContext application = ServletActionContext.getServletContext();
        int onlineUserCount = 0;
        synchronized (application) {
            try {
                onlineUserCount = (Integer) application.getAttribute("onlineUserCount");
            } catch (Exception e) {
                e.printStackTrace();
            }
            application.setAttribute("onlineUserCount",onlineUserCount-1);
        }
        return "success";
    }
}
//http://localhost:8080/user_login.action
