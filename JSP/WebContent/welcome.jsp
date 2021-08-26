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
	int id=Integer.parseInt(request.getParameter("Student_Id"));
	String name=request.getParameter("Student_Name");
	String email=request.getParameter("Student_Email");
	String course=request.getParameter("Student_Course");
	double fees=Double.parseDouble(request.getParameter("Student_Fees"));
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