<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>hello world</h1>
	<a href="MyFirstServlet">send request to server</a>
	
	<%
	String records=request.getParameter("recordinserted");
	if(records!=null)
	out.print("<h3>"+records+"</h3>");
	%>
</body>
</html>