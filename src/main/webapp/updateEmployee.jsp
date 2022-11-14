<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./Base.jsp"%>
<title>Add Students</title>
</head>
<body style="background-color: #0dcaf0">
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<h1>Update Employee Details</h1>
				<form action="updateEmployee" method="post">
					<div class="form-group">
						<label >Employee Id</label> <input type="number"
							class="form-control" value="${employee.empid}" name="empid">
					</div>

					<div class="form-group">
						<label >Name</label> <input type="text"
							class="form-control" value="${employee.name }" name="name">
					</div>

					<div class="form-group">
						<label>Address</label> <input type="text"
							class="form-control" value="${employee.address }"
							name="address">
					</div>

					<div class="form-group">
						<label >Age</label> <input type="number"
							class="form-control" value="${employee.age }" name="age">
					</div>

					<div class="container text-center">
						<input type="submit" class="btnRegister" value="Update" />
					</div>
				</form>
			</div>

		</div>
		
	</div>
</body>
</html>