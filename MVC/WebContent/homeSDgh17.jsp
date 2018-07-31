<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
WELCOME! <c:out value="${requestScope.ub.firstName} ${requestScope.ub.lastName}" />
<br>
<iframe width="20%" height="400"src="toc234.jsp"></iframe>
<iframe name= "Content" width="75%" height="400" ></iframe>

</body>
</html>