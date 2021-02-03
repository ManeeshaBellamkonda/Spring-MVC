<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<script src="https://code.jquery.com/jquery-1.11.1.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/jquery.validate.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/additional-methods.min.js"></script>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
#formdiv {
	border: solid black 2px;
	align: center;
}
</style>
</head>
<body>
	<form action="addCollege" method="post">
		<h2>
			<center>COLLEGE DETAILS</center>
		</h2>
		<table align="center" id="formdiv">
			<tr>
				<td>College Name:</td>
				<td><input type="text" id="collegeName" name="collegeName"
					placeholder="Enter the College Name"></td>
			</tr>
			<tr>
				<td>Strength:</td>
				<td><input type="number" id="strength" name="strength"
					placeholder="Enter the Strength"></td>
			</tr>
			<tr>
				<td><input type="submit" value="submit"></td>
			</tr>
			<tr>

				<td><a href="/">Back To Index</a></td>
			</tr>
		</table>
	</form>
	<script>
		$('form').validate({
			rules : {
				collegeName : {
					required : true,
					lettersonly : true
				}
			}
		});
		</script>
</body>
</html>