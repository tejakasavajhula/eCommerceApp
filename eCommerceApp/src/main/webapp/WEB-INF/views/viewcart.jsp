<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet"
	href="https://bootswatch.com/lumen/bootstrap.min.css">
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>

<script type="text/javascript"></script>

<title>ECommerce Portal</title>
<style>
#menuList ul li {
	display: inline;
	position: relative;
	text-decoration: none;
}

h2 {
	font-size: 80px;
	margin: 2px 0 -20px 0 !important;
}
</style>
<script src="/js/home.js"></script>
<script src="/js/cart.js"></script>

</head>
<body>
	<br>
	<h2 align="center">E-Commerce Application Home Page</h2>
	<br>
	<h2 id="message5"></h2><br>
	
	<div id="menuList">
		<ul>
			<li><input type="button" value="home" id="home"></li>
			<li><input type="button" value="viewCart" id="viewCart"></li>
			<li><input type="button" value="viewOrders" id="viewOrders"></li>
			<li><input type="button" value="Update User Profile" id="updateUser"></li>
			<li><input type="button" value="Update User Address" id="updateAddress"></li>
		</ul>
	</div>
	<br>
	<div align="left">
		<form>
			<input type="hidden" id="username" value="<%=request.getParameter("name")%>"></input>

			<c:forEach var="line" items="${list2}">
				<input type="hidden" id="lineId" value="${line.line_id}"></input>
				<input type="hidden" id="prodId" value="${line.product.id}"></input>
				<input type="hidden" id="prodName" value="${line.product.name}"></input>
				<input type="hidden" id="prodSupplier" value="${line.product.supplier}"></input>
				<input type="hidden" id="prodPrice" value="${line.product.price}"></input>				
				<input type="hidden" id="lineQuantity" value="${line.quantity}"></input>				
				<input type="hidden" id="linePrice" value="${line.price_per_line}"></input>				
				
			<ul>
				
					<li><img src="/images/${line.product.id}.jpg" width="500" height="500"></li>
					<li>Line ID : ${line.line_id}</li>
					<li>Product ID : ${line.product.id}</li>
					<li>Product Name : ${line.product.name}</li>
					<li>Product Supplier : ${line.product.supplier}</li>
					<li>Product Price : ${line.product.price}</li>
					<li>Quantity : ${line.quantity}</li>
					<li>Price : ${line.price_per_line}</li>
					<li><input type="number" id="Quantity"></input>&nbsp &nbsp			
					<input type ="button" value="Update Line" id="updateLine"></input></li>
					<li><input type ="button" value="Delete Line" id="deleteLine"></li>
					<p>-------------------------------------------------------------------------------------------------</p>
			</ul>
		</c:forEach>
			<br><input type ="button" value="Clear Cart" id="deleteCart">
		</form>
	</div>

</body>
</html>