<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
	<form action="/updateOrdersDetails" method="post">
		<table align="center" id="tt">
			<tr>
				<td>OrderName:</td>
				<td><input type="text" id="orderName" name="orderName"
					value="${orders.orderName}" readonly="readonly"></td>
			</tr>
			<tr>
				<td>OrderQuantity:</td>
				<td><input type="number" id="orderQuantity"
					name="orderQuantity" value="${orders.orderQuantity}"></td>
			</tr>
			<tr>
				<td>OrderPrice:</td>
				<td><input type="text" id="orderPrice" name="orderPrice"
					value="${orders.orderPrice}"></td>
			</tr>
			<tr>
				<td><input type="submit" value="submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>