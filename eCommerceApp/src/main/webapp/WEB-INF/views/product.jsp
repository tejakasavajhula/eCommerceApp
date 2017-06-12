<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
<script src="js/home.js"></script>
<script src="js/addcart.js"></script>

</head>
<body>
	<h2 align="center">E-Commerce Application Home Page</h2>
	<br>
	<div id="menuList">
		<ul>
			<li><input type="button" value="home" id="home"></li>
			<li><input type="button" value="viewCart" id="viewCart"></li>
			<li><input type="button" value="viewOrders" id="viewOrders"></li>
			<li><input type="button" value="Update User Profile"
				id="updateUser"></li>
			<li><input type="button" value="Update User Address"
				id="updateAddress"></li>
		</ul>
	</div>
	<div align="left">
		<form>
			<ul>

				<li><img src="/images/${prod.id}.jpg" width="500" height="500"></li>
				<li id="ID">${prod.id}</li>
				<li id="NAME">${prod.name}</li>
				<li id="Supplier">${prod.supplier}</li>
				<li id="Price">${prod.price}</li>
				<li><input type="text" name="quantity"
					placeholder="Enter quantity" id="quantity"></li>
				<li><input type="button" value="Add To Cart" id="AddToCart"></li>
				<p>-------------------------------------------------------------------------------------------------</p>
			</ul>
		</form>
	</div>
</body>
</html>