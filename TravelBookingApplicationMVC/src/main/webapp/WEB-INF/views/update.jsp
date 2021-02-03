<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
</head>
<body>
	<div class="container">
		<div class="row" style="padding-top: 50px">
			<div class="col-md-3"></div>
			<div class="col-md-6">
				<h2 style="text-align: center; color: black">BOOKING DETAILS</h2>
				<form action="/updateBookingDetails" method="post" name="registration">
				<div class="form-group">
						<label for="source">Source</label> <input type="text"
							class="form-control" id="source" value="${booking.source}"
							name="source">
					</div>
					<div class="form-group">
						<label for="destination">Destination</label> <input type="text"
							class="form-control" id="destination"
							value="${booking.destination}" name="destination">
					</div>
					<div class="form-group">
						<label for="distance">Distance</label> <input type="text"
							class="form-control" id="distance" name="distance" value="${booking.distance}" >
					</div>
					<div>
						<button type="submit" class="btn btn-primary">Submit</button>
					</div>
				</form>				
			</div>
		</div>
	</div>
</body>
</html>