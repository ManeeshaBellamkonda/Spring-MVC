<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
</head>
<body>
	<form action="/student" method="post">
		<table align="center">
			<tr>
				<td>Select College Name:</td>
				<td><select name="collegeName">
						<c:forEach var="list" items="${college}">
							<option>${list.collegeName}</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td>Student Name:</td>
				<td><input type="text" id="" name="studentName"
					placeholder="Enter the Student Name"></td>
			</tr>
			<tr>
				<td>Age:</td>
				<td><input type="number" id="studentAge" name="studentAge"
					placeholder="Enter the Age"></td>
			</tr>
			<tr>
				<td><label for="start">Date of Birth:</label> <input
					type="date" id="dateOfBirth" name="dateOfBirth"></td>
			</tr>
			<tr>
				<td>
					<h4>Gender:</h4> <input type="radio" name="gender" id="radio1"
					value="Boy">Boy <input type="radio" name="gender"
					id="radio2" value="Girl">Girl
				</td>
			</tr>
			<tr>
				<td>
					<h4>Select Hobbies:</h4>
					<div class="checkbox-inline">
						<label><input type="checkbox" value="Reading"
							name="studentHobbies" id="studentHobbies">Reading</label>
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div class="checkbox-inline">
						<label><input type="checkbox" value="Swimming"
							name="studentHobbies" id="studentHobbies">Swimming</label>
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div class="checkbox-inline">
						<label><input type="checkbox" value="Cooking"
							name="studentHobbies" id="studentHobbies">Cooking</label>
					</div>
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="submit"></td>
			</tr>
		</table>
	</form>
	<script>
	 $.validator.addMethod("dateOfBirth", function (value, element) {
         var curDate = new Date();
         var inputDate = new Date(value);
         if (inputDate < curDate)
             return true;
         return false;
     }, "Invalid Date!");
		$('form').validate({
			rules : {
				studentName : {
					required : true,
					minlength : 8,
					lettersonly : true
				},
				studentHobbies : {
					required : true,
					minlength : 2
				},
				studentAge:{
					required:true
				},
				gender : {
					required : true
				},
				dateOfBirth:{
					required:true,
					dateOfBirth: true
				}
			}
		});
	</script>
</body>
</html>