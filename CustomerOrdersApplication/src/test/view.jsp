<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript"
src="http://ajax.googleapis.com/ajax/libs/jquery/1.5/jquery.min.js">
</script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>	
<script>
$(document).ready(function(){
$('#comboCustomer').change(function(){
	var customerId=$(this).val();
	
	$.ajax({
		type:'GET',
		url:window.location.origin+'/rest/ordersByCustomer/'+customerId,
		success:function(result){
			var s='';
			/* s+='<option>Select Model</option>'; */
			for(var i=0;i<result.length;i++)
				{
					s+='<option value="'+result[i].orderId+'">'+result[i].orderName+'</option>';
				}
			console.log(customerId);
			$('#comboOrders').html(s);
		}
	});
	
	});
});
</script>
</head>
<body>
<form action="allData" method="get">
		<table id="tt" align="center">
			<tr>
				<td>Customer:</td>
				<td><select name="customerId" id="comboCustomer">
						<option>Select Customer</option>
						<c:forEach var="customer" items="${customer}">
							<option id="test" value="${customer.customerId}">${customer.customerName}</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td>Orders:</td>
				<td><select name="orderId" id="comboOrders" multiple="multiple">
						<option>Select Orders</option>
				</select></td>
			</tr>
			<tr>
				<td><input type="submit" value="submit"></td>
			</tr>
			</table>
			</form>
			<c:if test="${customerList!=null}">
			<table class="table tale-stripped">
			<tr>
				<th>Order Name</th>
				<th>Order Quantity</th>
				<th>Order Price</th>
			</tr>
			<c:forEach var="list" items="${customerList}">
				<%-- <c:forEach var="c" items="${list.getOrders()}"> --%>
					<tr class="success">
						<td>${c.orderName}</td>
						<td>${c.orderQuantity}</td>
						<td>${c.orderPrice}</td>
						<td><a href="/update/${c.orderId}">Update</a></td>
					</tr>
				</c:forEach>
			<%-- </c:forEach> --%>
		</table>
		</c:if>
</body>
</html>