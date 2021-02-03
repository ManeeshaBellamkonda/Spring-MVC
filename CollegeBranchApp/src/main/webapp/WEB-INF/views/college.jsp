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
#tt {
	border: solid 2px azure;
	padding: 10px;
	background-color: beige;
}
</style>
</head>
<body>
	<form action="/college" method="post">
		<h2>
			<center>COLLEGE DETAILS</center>
		</h2>
		<table align="center" id="tt">
			<tr>
				<td>College Name:</td>
				<td><input type="text" id="collegeName" name="collegeName"
					placeholder="Enter the College Name"></td>
			</tr>
			<tr>
				<td>Location Name:</td>
				<td><textarea name="locationName" id="locationName" rows="5" cols="20"></textarea></td>
			</tr>
			<tr>
				<td>No Of Branches:</td>
				<td><input type="number" id="noOfBranches" name="noOfBranches"
					placeholder="Enter the no. of Branches"></td>
			</tr>
			<tr>
				<td><input type="submit" value="submit"></td>
				<td><button><a href="/">Back to Index</a></button></td>
			</tr>
		</table>
	</form>
	<script>
		$('form').validate({
			rules : {
				collegeName : {
					required : true,
					lettersonly : true,
					maxlength : 20
				},
				locationName:{
					required:true
				},
				noOfBranches:{
					required:true
				}				
			}
		});
	</script>
</body>
</html>