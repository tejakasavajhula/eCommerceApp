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
table {
    border-collapse: collapse;
}

th, td {
    text-align: left;
    padding: 8px;
}

tr:nth-child(even){background-color: #f2f2f2}

th {
    background-color: #4CAF50;
    color: white;
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
			<li><input type="button" value="Logout" id="logout"></li>
		</ul>
	</div><br>
	<div align="left">
		<form>
			<table align="center">
				<tr><td>Username </td><td><input type="text" id="username" value="${user.username}"></input></td></tr>
				<tr><td>Password </td><td><input type="text" id="pwd" value="${user.pwd}"></input></td></tr>
				<tr><td>First Name </td><td><input type="text" id="fName" value="${user.firstName}"></input></td></tr>
				<tr><td>Last Name </td><td><input type="text" id="lName" value="${user.lastName}"></input></td></tr>
				<tr><td>Email Address</td><td><input type="text" id="email" value="${user.email}"></input></td></tr>				
				<tr><td>Phone</td><td><input type="number" id="phone" value="${user.phone}"></input></td></tr>				
				<tr><td>Street</td><td><input type="text" id="street" value="${user.address.street}"></input></td></tr>				
				<tr><td>City</td><td><input type="text" id="city" value="${user.address.city}"></input></td></tr>				
				<tr><td>State</td><td><input type="text" id="state" value="${user.address.state}"></input></td></tr>				
				<tr><td>Country</td><td><input type="text" id="country" value="${user.address.country}"></input></td></tr>
				<tr><td><input type="button" value="Update User Profile" id="updateUser1"></td>
					<td><input type="button" value="Update User Address" id="updateAddress1"></td></tr>
			</table>
				<br><br>				
		</form>
	</div>
</body>
</html>