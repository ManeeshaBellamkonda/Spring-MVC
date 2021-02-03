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
</head>
<body>
	<form action="/getCustomer" method="get" name="registration">
		<h2 style="text-align: center; color: black">CUSTOMER DETAILS</h2>
		<table>
			<div class="row" style="padding-top: 50px">
				<div class="col-md-4"></div>
				<div class="col-md-4">
					<div class="container">
						<div class="form-group">
							<label for="fullName">Customer:</label><select name="customerId">
								<c:forEach var="task" items="${customers}">
									<option value="${task.customerId}">${task.fullName}</option>
								</c:forEach>
							</select>
						</div>
						<div class="form-group">
							<label for="dateOfJourney">Date of Journey</label> <input
								type="date" class="form-control" id="dateOfJourney"
								name="dateOfJourney" value="${booking1.dateOfJourney}">
						</div>
						<button type="submit" class="btn btn-primary">Get
							Bookings</button>
						<a href="/" class="btn btn-primary" role="button">GoBack</a>
					</div>
				</div>
			</div>
		</table>
	</form>

	<div class="container" style="color: white; font-size: 20px">
		<div class="form-group">
			<c:if test="${customer!=null }">
				<table class="table table-bordered">
					<thead>
						<tr>
							<th scope="col">FullName</th>
							<th scope="col">Source</th>
							<th scope="col">Destination</th>
							<th scope="col">Price</th>
							<th scope="col">Update</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="task" items="${customer.getBookings()}">
							<tr class="">
								<td>${customer.fullName}</td>
								<td>${task.source}</td>
								<td>${task.destination}</td>
								<td>${task.price}</td>
								<td><a href="/update/${task.bookingId}"
									class="btn btn-primary" role="button">Update</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</c:if>
		</div>
	</div>

</body>
</html>