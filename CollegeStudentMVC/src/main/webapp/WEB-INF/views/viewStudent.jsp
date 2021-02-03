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
<h4>STUDENT DETAILS</h4>
<c:if test="${students!=null}">
		<table class="table tale-stripped">
			<tr>
				<th>Student Id</th>
				<th>Student Name</th>
				<th>Student Age</th>
				<th>Student Hobbies</th>
				<th>Date Of Birth</th>

			</tr>
			<c:forEach var="list" items="${students}">
					<tr class="success">
						<td>${list.studentId}</td>
						<td>${list.studentName}</td>
						<td>${list.studentAge}</td>
						<td>${list.studentHobbies}</td>
						<td>${list.dateOfBirth}</td>
						<td><a href="/delete/${list.studentId}">delete</a>							
					</tr>
				</c:forEach>
		</table>
	</c:if>
</body>
</html>