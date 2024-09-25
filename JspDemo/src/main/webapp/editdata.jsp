<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String id = request.getParameter("slno");
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "Samrat@007");
	PreparedStatement ps = con.prepareStatement("select * from pateint where slno=?");
	ps.setInt(1,Integer.parseInt(id));
	ResultSet rs = ps.executeQuery();
	rs.next();
	%>
	
	<form action="updatedata.jsp">
		Enter slno:<input type="number" name="slno" value="<%=rs.getInt(1) %>" readonly="true" ><br>
		Enter Name:<input type="text" name="name" value="<%=rs.getString(2) %>"><br>
		Enter Age:<input type="number" name="age" value="<%=rs.getInt(3) %>"><br>
		<input type="submit">
	</form>
</body>
</html>