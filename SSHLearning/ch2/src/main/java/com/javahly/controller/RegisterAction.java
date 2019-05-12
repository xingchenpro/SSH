package com.javahly.controller;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hly
 * @blog:www.javahly.com
 * @github:https://github.com/SiriusHly
 * @date 2019年4月2日 下午7:17:26
 */

//http://localhost:8080/register_enter.action
public class RegisterAction {

	private String username;
	private String password;
	private String question;
	private String sex;
	private boolean accept;

	public Map<String, String> getQuestionList() {
		Map<String, String> question = new HashMap<>();
		question.put("1", "你的生日");
		question.put("2", "爸爸的生日");
		question.put("3", "妈妈的生日");
		return question;
	}

	public String execute() {
		return "success";
	}

	public String register_enter() {
		return "register_enter_page";
	}

	public RegisterAction() {
	}

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

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public boolean isAccept() {
		return accept;
	}

	public void setAccept(boolean accept) {
		this.accept = accept;
	}
}


