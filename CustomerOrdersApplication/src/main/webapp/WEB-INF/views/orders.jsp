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
	<center>
		<h3>ORDER DETAILS</h3>
	</center>
	<form action="/orders" method="post">
		<table align="center" id="tt">
			<tr>
				<td>Select Customer Name:</td>
				<td><select name="customerName">
						<c:forEach var="list" items="${customers}">
							<option value="${list.customerName}">${list.customerName}</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td>OrderName:</td>
				<td><input type="text" id="orderName" name="orderName"
					placeholder="Enter the Order Name"></td>
			</tr>
			<tr>
				<td>OrderQuantity:</td>
				<td><input type="number" id="orderQuantity"
					name="orderQuantity" placeholder="Enter the OrderQuantity"></td>
			</tr>
			<tr>
				<td>OrderPrice:</td>
				<td><input type="text" id="orderPrice" name="orderPrice"
					placeholder="Enter the Order Price"></td>
			</tr>
			<tr>
				<td><input type="submit" value="submit"></td>
				<td><button>
						<a href="/">Back</a>
					</button></td>
			</tr>
		</table>
	</form>
</body>
</html>