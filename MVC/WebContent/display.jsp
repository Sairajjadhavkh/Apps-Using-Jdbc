<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	int id=(int)request.getAttribute("id");
	Object name= request.getAttribute("name");
	Object email=request.getAttribute("email");
	Object course=request.getAttribute("course");
	double fees=(double)(request.getAttribute("fees"));
	%>
	
	<table align="center">
		<tr>
			<td><%=id %></td>
		</tr>
		<tr>
			<td><%=name %></td>
		</tr>
		<tr>
			<td><%=email %></td>
		</tr>
		<tr>
			<td><%=course %></td>
		</tr>
		<tr>
			<td><%=fees %></td>
		</tr>
	</table>

</body>
</html>