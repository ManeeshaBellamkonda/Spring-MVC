<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/viewCustomer" method="get">
	<h2>CUSTOMER DETAILS</h2>
	<table class="table tale-stripped">
	<tr>
				<th>CustomerName</th>
				<th>Age</th>
				<th>DateOfBirth</th>
				<th>Gender</th>
				<th>Hobbies</th>
				
			</tr>
			<c:forEach var="list" items="${customer}">
				<tr class="success">
					<td>${list.customerName}</td>
					<td>${list.age}</td>
					<td>${list.dateOfBirth}</td>
					<td>${list.gender}</td>
					<td>${list.hobbies}</td>
					<td><a href="/updateCustomer/${list.customerId}">Update</a></td>
				</tr>
			</c:forEach>
	</table>
	</form>
</body>
</html>