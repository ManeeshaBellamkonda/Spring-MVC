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
	<center>
		<h3>CUSTOMER DETAILS</h3>
	</center>
	<form action="/customer" method="post">
		<table align="center" id="tt">
			<tr>
				<td>Customer Name:</td>
				<td><input type="text" id="customerName" name="customerName"
					placeholder="Enter the Customer Name"></td>
			</tr>
			<tr>
				<td>Age:</td>
				<td><input type="number" id="age" name="age"
					placeholder="Enter the Age"></td>
			</tr>
			<tr>
				<td><label for="start">Date of Birth:</label> <input
					type="date" id="dateOfBirth" name="dateOfBirth"></td>
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
					<h4>Select Hobbies:</h4>
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
				<td><button>
						<a href="/">Back</a>
					</button></td>
			</tr>
		</table>
	</form>
</body>
</html>