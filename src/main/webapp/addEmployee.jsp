<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./Base.jsp"%>
<title>Add Employees</title>
</head>
<body style="background-color: #0dcaf0">
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<h1>Fill The Employee Details</h1>
				<form action="add-employee" method="post">
					<div class="form-group">
						<label>Employee Id</label> <input type="number"
							class="form-control" name="empid">
					</div>

					<div class="form-group">
						<label>Name</label> <input type="text" class="form-control"
							name="name">
					</div>

					<div class="form-group">
						<label>Address</label> <input type="text" class="form-control"
							name="address">
					</div>

					<div class="form-group">
						<label>Age</label> <input type="number" class="form-control"
							name="age">
					</div>

					<div class="container text-center">
						<button type="submit" class="btn btn-primary">Save</button>
					</div>
				</form>
			</div>

		</div>

	</div>
</body>
</html>