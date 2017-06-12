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
<div id="menuList">
<ul>
<li><input type="button" value="home" id="home"></li>
<li><input type="button" value="viewCart" id="viewCart"></li>
<li><input type="button" value="viewOrders" id="viewOrders"></li>
</ul>
</div>
	<h1>Welcome <%=request.getParameter("name") %></h1><br><br>
	<div align="left">
	<form>
		   <ul>
		   		<c:forEach var="product" items="${list}">
		   		
		   			<li><img src = "/images/${product.id}.jpg" width="200" height="200"></li>
		   			<li>${product.id} &nbsp</li>
		   			<li>${product.name}&nbsp</li>
		   			<li>${product.supplier}&nbsp</li>
		   			<li>${product.price}&nbsp</li>
		   			<li><input type="text" name="quantity" placeholder = "Enter quantity required here" id="quantity"></li>
		   			<li><input type="button" value="Add To Cart" name="AddToCart" id="AddToCart"></li>
		   			<p>-------------------------------------------------------------------------------------------------</p>
		   		</c:forEach>
		   		
		   </ul>
		  </form>			    
	</div>
</body>
</html>