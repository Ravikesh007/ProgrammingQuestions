<%@page import="java.util.List"%>
<%@page import="spring_mvc_Entity.Student0"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% List<Student0> students =(List<Student0>) request.getAttribute("studentslist"); %>
	
	<table cellPadding="20px" border="1">
		<th>id</th>
		<th>name</th>
		<th>age</th>
		<th>delete</th>
		
	<% for(Student0 s : students) { %>
		<tr>
		<td><%=s.getId() %></td>
		<td><%=s.getName() %></td>
		<td><%=s.getAge() %></td>
		<td><a href="deletestudent?id=<%= s.getId() %>">DELETE</a>
		</tr>
	<% } %>
	
	</table>
</body>
</html>