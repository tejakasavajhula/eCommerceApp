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
<script src="/js/home.js"></script>
<script src="/js/user.js"></script>

</head>
<body>
<br>
	<h2 align="center">E-Commerce Application Home Page</h2>
	<br>
	<h2 id="message6"></h2><br>
	
	<div id="menuList">
		<ul>
			<li><input type="button" value="home" id="home"></li>
			<li><input type="button" value="viewCart" id="viewCart"></li>
			<li><input type="button" value="viewOrders" id="viewOrders"></li>
			<li><input type="button" value="Update User Profile" id="updateUser"></li>
			<li><input type="button" value="Update User Address" id="updateAddress"></li>
		</ul>
	</div><br>
	<h3>Welcome <%=request.getParameter("name")%></h3><br><br>
	<div align="left">
		<form>
			<table>
				<tr><td><input type="text" id="username" value="${user.username}"></input></td></tr>
				<tr><td><input type="text" id="pwd" value="${user.pwd}"></input></td></tr>
				<tr><td><input type="text" id="fName" value="${user.firstName}"></input></td></tr>
				<tr><td><input type="text" id="lName" value="${user.lastName}"></input></td></tr>
				<tr><td><input type="text" id="email" value="${user.email}"></input></td></tr>				
				<tr><td><input type="number" id="phone" value="${user.phone}"></input></td></tr>				
				<tr><td><input type="text" id="street" value="${user.address.street}"></input></td></tr>				
				<tr><td><input type="text" id="city" value="${user.address.city}"></input></td></tr>				
				<tr><td><input type="text" id="state" value="${user.address.state}"></input></td></tr>				
				<tr><td><input type="text" id="country" value="${user.address.country}"></input></td></tr>
				<tr><td><input type="button" value="Update User Profile" id="updateUser1"></td>
					<td><input type="button" value="Update User Address" id="updateAddress1"></td></tr>
			</table>
				<br><br>				
		</form>
	</div>
</body>
</html>