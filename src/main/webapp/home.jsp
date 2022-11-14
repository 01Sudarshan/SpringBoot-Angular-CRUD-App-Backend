<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./Base.jsp"%>
<title>Insert title here</title>
</head>
<body style="background-color: #0dcaf0">
	<div class="container mt-3 text-center">
		<h1 style="font-size: 60px">Welcome To Employee CRUD</h1>
		<br> <br>
		<div class="list-group">
				<a href="./home.jsp" class="list-group-item list-group-item-action"><h3>Home</h3></a> 
				<a href="./addEmployee.jsp" class="list-group-item list-group-item-action"><h3>Add New Employee</h3></a> 
				<a href="getEmployee" class="list-group-item list-group-item-action"><h3>Employee list</h3></a>
		</div>
	</div>
</body>
</html>