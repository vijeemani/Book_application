<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Order</title>

<style>
.dropbtn {
	background-color: #4CAF50;
	color: white;
	padding: 16px;
	font-size: 16px;
	border: none;
	cursor: pointer;
}

.dropdown {
	position: relative;
	display: inline-block;
}

.dropdown-content {
	display: none;
	position: absolute;
	background-color: #f9f9f9;
	min-width: 160px;
	box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
	z-index: 1;
}

.dropdown-content a {
	color: black;
	padding: 12px 16px;
	text-decoration: none;
	display: block;
}

.dropdown-content a:hover {
	background-color: #f1f1f1
}

.dropdown:hover .dropdown-content {
	display: block;
}

.dropdown:hover .dropbtn {
	background-color: #3e8e41;
}
</style>
</head>
<body>



	<div class="container">
		<h2>Order Form</h2>
		<form class="form-horizontal" action="/action_page.php">
			<div class="form-group">
				<label class="control-label col-sm-2" for="name">Book Name:</label>
				<select name="item">
					<c:forEach items="${ORDER_LIST}" var="id">
						<option value="${id.name}">${id.name}</option>
					</c:forEach>
				</select>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="id">Book Id:</label>
				<div class="col-sm-10">
					<input type="number" class="form-control" id="bid"
						placeholder="Enter book id" name="id">
				</div>

			</div>


			<div class="form-group">
				<label class="control-label col-sm-2" for="quantity">Book
					quantity</label>
				<div class="col-sm-10">
					<input type="number" name="quantity" min="1" max="5"><br>
				</div>
			</div>

			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-default">Submit</button>
				</div>
			</div>
		</form>

		<table class="table table-bordered">
			<thead>
				<tr>
					<th>Sno</th>
					<th>Name</th>
					<th>Price</th>

				</tr>
			</thead>
			<tbody>
				<c:forEach items="${ORDER_LIST}" var="order">
					<tr>
						<td>${order.id}</td>
						<td>${order.name}</td>
						<td>${order.price}</td>


					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>


</body>
</html>