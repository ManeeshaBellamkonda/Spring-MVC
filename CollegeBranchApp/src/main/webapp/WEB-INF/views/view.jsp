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
	<form action="/getCollege" method="get">
		<table align="center">
			<tr>
				<td>Select College Name:</td>
				<td><select name="collegeId">
						<c:forEach var="list" items="${college}">
							<option value="${list.collegeId}">${list.collegeName}</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td><input type="submit" value="submit"></td>
			</tr>
		</table>
	</form>
	<table class="table tale-stripped">
		<tr>
			<th>Branch Name</th>
			<th>Total Strength</th>
			<th>HOD Name</th>

		</tr>
		<c:forEach var="list" items="${colleges.getBranch()}">
			<tr class="success">
				<td>${list.branchName}</td>
				<td>${list.totalStrength}</td>
				<td>${list.hodName}</td>
				<td><a href="/update/${list.branchId}">Update</a></td>
			</tr>
		</c:forEach>
		<tr class="success">
			<td>TotalStrength:${sum}</td>
		</tr>
	</table>
	<tr>
		<td><a href="/">Back to Index</a>
	</tr>
</body>
</html>