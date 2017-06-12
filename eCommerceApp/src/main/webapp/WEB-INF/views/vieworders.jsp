<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
	</div><br>
	<div align="left">
	<h1>Welcome <%=request.getParameter("name")%></h1><br><br>
	
	<form>
		<input type="hidden" id="username" value="<%=request.getParameter("name")%>"></input>
	
		   <ul>
		   		<c:forEach var="order" items="${list1}">
		   		
		   			<li>${order.order_id} </li>
		   			<li>${order.order_value}</li>
		   			<li>${order.order_date}</li>
		   			<li>${order.ship_date}</li>
		   			<li>${order.status}</li>
		   			<p>-------------------------------------------------------------------------------------------------</p>
		   		</c:forEach>		
		   </ul>
		   <li><a href="/home/?name=<%=request.getParameter("name")%>">Back Home</a></li>
		  </form>			    
	</div>

</body>
</html>