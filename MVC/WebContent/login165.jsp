<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	Pls login.
	<br />
	<form action="process" method="post">
		<input type="text" name="username" value="Siddiq"> <input type="password"
			name="password" value="pass123"> <input type="Submit" name="Login">
	</form>
	<c:if test="${param.flag}">
		<div style="color: red">Invalid Username/Password</div>
	</c:if>
</body>
</html>