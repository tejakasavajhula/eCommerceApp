<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %><!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet"
	href="https://bootswatch.com/lumen/bootstrap.min.css">
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>

<script type="text/javascript">
	window.history.forward();
	function noBack() {
		window.history.forward();
	}
</script>
	<title>User Home Page</title>

</head>
<body onLoad="noBack();">
	<h1>Welcome</h1><br><br>
	<div align="left">
		   <table>
		   		<tr>
		   			<th>ID</th>
		   			<th>Name</th>
		   			<th>Supplier</th>
		   			<th>Price</th>
		   		</tr>
		   		<c:forEach var="product" items="${list}">
		   		<tr>
		   			<td>${product.id} &nbsp</td>
		   			<td>${product.name}&nbsp</td>
		   			<td>${product.supplier}&nbsp</td>
		   			<td>${product.price}&nbsp</td>
		   			<td><input type="text" name="quantity" placeholder = "Enter quantity required here" id="quantity"></td>
		   			<td><input type="button" value="Add To Cart" name="AddToCart" id="AddToCart"></td>
		   		</tr>
		   		</c:forEach>
		   		
		   </table>			    
	</div>
</body>
</html>