<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/customerdetails" method="post">

		<table align="center">
			<center>
				<h3>CUSTOMER DETAILS</h3>
			</center>
			<tr>
				<td>Customer Id:</td>
				<td><input type="text" id="customerId" name="customerId"
					placeholder="Enter the Customer Id" value="${customer.customerId}"
					disabled="disabled"></td>
			</tr>
			<tr>
				<td>Customer Name:</td>
				<td><input type="text" id="customerName" name="customerName"
					placeholder="Enter the Customer Name"
					value="${customer.customerName}" disabled="disabled"></td>
			</tr>
			<tr>
				<td>Customer Name:</td>
				<td><input type="text" id="customerName" name="customerName"
					placeholder="Enter the Customer Name"
					value="${customer.customerName}"></td>
			</tr>
			<tr>
				<td>Age:</td>
				<td><input type="number" id="age" name="age"
					placeholder="Enter the Age" value="${customer.age}"
					disabled="disabled"></td>
			</tr>
			<tr>
				<td>Age:</td>
				<td><input type="number" id="age" name="age"
					placeholder="Enter the Age" value="${customer.age}"></td>
			</tr>
			<tr>
				<td><label for="start">Date of Birth:</label> <input
					type="date" id="dateOfBirth" name="dateOfBirth"
					value="${customer.dateOfBirth}" disabled="disabled"></td>
			</tr>
			<tr>
				<td><label for="start">Date of Birth:</label> <input
					type="date" id="dateOfBirth" name="dateOfBirth"
					value="${customer.dateOfBirth}"></td>
			</tr>
			<tr>
				<td>
					<h4>Gender:</h4> <input type="radio" name="gender" id="radio1"
					value="Male">Male <input type="radio" name="gender"
					id="radio2" value="Female">Female
				</td>
			</tr>
			<tr>
				<td>
					<div class="text">
						<label><input type="text" name="hobbies" id="hobbies"
							value="${customer.hobbies}" disabled="disabled"></label>
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div class="checkbox-inline">
						<label><input type="checkbox" value="Reading"
							name="hobbies" id="hobbies">Reading</label>
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div class="checkbox-inline">
						<label><input type="checkbox" value="Traveling"
							name="hobbies" id="hobbies">Traveling</label>
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div class="checkbox-inline">
						<label><input type="checkbox" value="Cooking"
							name="hobbies" id="hobbies">Cooking</label>
					</div>
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="submit"></td>
				<td><button><a href="/">Back</a></button></td>
			</tr>
		</table>
	</form>
</body>
</html>