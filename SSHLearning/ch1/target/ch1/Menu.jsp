<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Menu</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global">
	<p>
		Welcome.<span><s:property value="#session.username"/></span> Number of users online: 
		<s:property value="#application.onlineUserCount"/>
	</p>	
	<p>
		<a href="user_logout.action">Log out</a>
		<a href="user_login.action">return</a>
	</p>
</div>
</body>
</html>
