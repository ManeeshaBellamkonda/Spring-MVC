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
		<table class="table">
			<tr>
				<td>College Name:</td>
				<td><select name="collegeId">
						<c:forEach var="list" items="${college}">
							<option value="${list.collegeId}">${list.collegeName}</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td><input type="submit" value="submit"></td>
				<td><button type="submit" onclick="form.action='/viewStudent'">Show Student Details</button></td>
			</tr>
		</table>
	</form>
	
		<table class="table tale-stripped">
			<tr>
				<th>College Name</th>
				<th>Strength</th>
				<th>No Of Boys</th>
				<th>No Of Girls</th>

			</tr>
			<c:forEach var="list" items="${colleges}">
					<tr class="success">
						<td>${list.collegeName}</td>
						<td>${list.strength}</td>
						<td>${list.noOfBoys}</td>
						<td>${list.noOfGirls}</td>	
							
					</tr>
				</c:forEach>
		</table>
</body>
</html>