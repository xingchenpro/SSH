<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:form action="register">
<s:textfield name="username" label="用户名"/>
<s:password name="password" label="密码"/>
<s:select list="questionList" label="答案"/>
<s:textfield name="question" label="答案"/>
<s:radio name="sex" label="性别" list="{'男','女'}"/>
<s:checkbox name="accept" fieldValue="true" label="我接受条款"/>
<s:submit/>
</s:form>
</body>
</html>