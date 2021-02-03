<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
#tt {
	border: solid 2px azure;
	padding: 10px;
	background-color: beige;
}
</style>
</head>
<body>

	<form action="/branch" method="post">
		<h2>
			<center>BRANCH DETAILS</center>
		</h2>
		<table align="center" id="tt">
			<tr>
				<td>Select College Name:</td>
				<td><select name="collegeName">
						<c:forEach var="list" items="${college}">
							<option>${list.collegeName}</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<span>${alert}</span>
				<td>Branch Name:</td>
				<td><input type="text" id="branchName" name="branchName"
					placeholder="Enter the Branch Name"></td>
			</tr>
			<tr>
				<td>Total Strength:</td>
				<td><input type="number" id="totalStrength"
					name="totalStrength" placeholder="Enter the total Strength"></td>
			</tr>
			<tr>
				<td>HOD Name:</td>
				<td><input type="text" id="hodName" name="hodName"
					placeholder="Enter the HOD Name"></td>
			</tr>
			<tr>
				<td><input type="submit" value="submit"></td>
				<td><a href="/">Back to Index</a></td>
			</tr>
		</table>
	</form>
</body>
</html>