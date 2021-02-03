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
<form action="/updateBranchDetails" method="get">
		<table align="center" id="tt">
			<tr>
				<td>Branch Name:</td>
				<td><input type="text" id="branchName" name="branchName"
					 value="${branch.branchName}"readonly="readonly"></td>
			</tr>
			<tr>
				<td>Total Strength:</td>
				<td><input type="number" id="totalStrength" name="totalStrength"
					value="${branch.totalStrength}" ></td>
			</tr>
			<tr>
				<td>HOD Name:</td>
				<td><input type="text" id="hodName" name="hodName"
					value="${branch.hodName}"readonly="readonly"></td>
			</tr>
			<tr>
				<td><input type="submit" value="submit"></td>
			</tr>
		</table>
		</form>
</body>
</html>