<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Login Form</title>
<style type="text/css">
@import url(css/main.css);
</style>
</head>
<body>
	<div id="global">
		<s:actionerror />
		<h3>Login</h3>
		<p>
		Number of users online: 
		<s:property value="#application.onlineUserCount"/>
	</p>	
		
		<s:form action="user_login">
			<s:textfield label="User Name" key="userName" />
			<s:password label="Password" key="password" />
			<s:submit />
		</s:form>
	</div>
</body>
</html>

