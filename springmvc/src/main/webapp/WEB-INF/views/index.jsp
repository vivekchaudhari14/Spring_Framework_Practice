<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring mvc</title>
</head>
<body>
	<h1>This is Spring controller</h1>
	<h1>called by Controller</h1>
	<h1>url  .home</h1>
	<% 
		String name = (String) request.getAttribute("name");
		Integer id = (Integer) request.getAttribute("id");
		List<String> friends = (List<String>) request.getAttribute("friends");
	%>
	<h2>My name is <%=name %></h2>
	<h2>My id Number is <%=id %></h2>
	
	<%
    	for (String f : friends) {
	%>

	<h2>My friend is <%= f %></h2>

	<%
	    }
	%>
	
</body>
</html>