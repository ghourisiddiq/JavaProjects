<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page session="false" %>
 <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:url value="transact?action=compose"/>
<a href="transact?action=inbox" target = "Content">Inbox</a><br/>
<a href="transact?action=compose" target = "Content">Compose</a><br/>
<a href="transact?action=sent" target = "Content">Sent Items</a><br/>
<a href="transact?action=logout" target = "_parent">Logout</a><br/>
</body>
</html>