<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>This is Help Jsp</title>
</head>
<body>
	<h1>"This Page called by HomeController"</h1>
	<%-- <% 
		String name = (String) request.getAttribute("name");
		Integer id = (Integer) request.getAttribute("id");
		LocalDateTime localDateTime = (LocalDateTime)request.getAttribute("time");
	%> --%>
	<h1>My name is <%-- <%=name %> --%>
		${name}
	</h1>
	<h2>My Id number is<%-- <%=id%> --%>
		${id }
	</h2>
	<h1>Time now <%-- <%=localDateTime%> --%>
		${time }
	</h1>
	<hr>
	
	<c:forEach var="marks" items = "${marks }">
		<h1>${marks}</h1>
	</c:forEach>
	
</body>
</html>	