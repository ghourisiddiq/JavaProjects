 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP</title>
</head>
<body>
<form action="">
<input type="text" name="name">
<input type="text" name="name">
<input type="submit" value="Go">
</form>
Hi <c:out  value="${paramValues.name[0]} ${paramValues.name[1]}" />
<table>
<c:forEach begin="5" end="100" step="5" var="counter">
<tr><td><c:out value="${counter}" /></td></tr>
</c:forEach>
</table>
</body>
</html>