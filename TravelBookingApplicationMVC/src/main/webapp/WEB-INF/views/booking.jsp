<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/jquery.validate.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/additional-methods.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.1/additional-methods.min.js"
	integrity="sha256-vb+6VObiUIaoRuSusdLRWtXs/ewuz62LgVXg2f1ZXGo="
	crossorigin="anonymous"></script>
<style>
.container {
	max-width: 800px;
	border-radius: 10px;
	padding: 30px 50px
}

body {
	background-size: 100% 100%;
	background-color: azure;
}

a {
	color: yellow;
	font-size: 30px
}

@media only screen and (max-width: 600px) {
	body {
		background-image: url("/resources/enfield.jpg");
	}
}
</style>
</head>
<body>
	<div class="container">
		<div class="row" style="padding-top: 50px">
			<div class="col-md-3"></div>
			<div class="col-md-6">
				<h2 style="text-align: center; color: black">BOOKING DETAILS</h2>
				<form action="/booking" method="post" name="registration">
				<span>${alert}</span>
					<div class="form-group">
						<label for="customer">Customer:</label><select name="customerId">
						<c:forEach var="task" items="${customers}">
							<option value="${task.customerId}">${task.fullName}</option>
						</c:forEach>						
						</select>
					</div>
					<div class="form-group">
						<label for="source">Source</label> <input type="text"
							class="form-control" id="source" placeholder="Enter Source"
							name="source">
					</div>
					<div class="form-group">
						<label for="destination">Destination</label> <input type="text"
							class="form-control" id="destination"
							placeholder="Enter destination " name="destination">
					</div>
					<div class="form-group">
						<label for="dateOfJourney">Date of Journey</label> <input
							type="date" class="form-control" id="dateOfJourney"
							name="dateOfJourney">
					</div>
					<div class="form-group">
						<label for="distance">Distance</label> <input type="text"
							class="form-control" id="distance" name="distance">
					</div>
					<div>
						<label for="foodPreference">Food Preference</label>
					</div>
					<div class="radio">
						<label><input type="radio" name="foodPreference" value="Vegetarian">Vegetarian
						</label>
					</div>
					<div class="radio">
						<label><input type="radio" name="foodPreference" value="NonVegetarian">Non
							Vegetarian </label>
					</div>
					<div>
						<label for="travellingType">Travelling With:</label>
						<label class="checkbox-inline"><input type="checkbox"
							value="visa" name="travellingType">Visa</label> <label class="checkbox-inline"><input
							type="checkbox" value="passport" name="travellingType">Passport</label>
					</div>
					<button type="submit" class="btn btn-primary">Book</button>
					<a href="/" class="btn btn-primary" role="button">GoBack</a>
				</form>
			</div>
		</div>
	</div>
	<script>
	$.validator.addMethod("dateOfJourney", function (value, element) {
        var curDate = new Date();
        var inputDate = new Date(value);
        if ((inputDate >= curDate))
            return true;
        return false;
    }, "Invalid Date!");
	$('form').validate({
            rules : {
            	source : {
                    required : true,
                    lettersonly:true
                    
                },
                destination : {
                    required : true,
                    lettersonly:true
                    
                },
                dateOfJourney:{
                	required:true,
                	dateOfJourney:true
                },
                distance:{
                	required:true,
                	digits:true
                },
                foodPreference:{
                	required:true,
                	minlength:1
                },
                travellingType:{
                	required:true,
                	minlength:1
                }
                
                
            }
        });
    </script>
</body>
</html>