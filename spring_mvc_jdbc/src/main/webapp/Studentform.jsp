<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action = "saveStudent" modelAttribute="studentobj">
		Enter id: <form:input path="id"/><br>
		Enter Name: <form:input path="name"/><br>
		Enter Age: <form:input path="age"/><br>
		<input type="submit">
	</form:form>
</body>
</html>