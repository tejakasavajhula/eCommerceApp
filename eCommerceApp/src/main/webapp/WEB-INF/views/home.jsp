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
<style>

#menuList ul li {
 display: inline;
 position:relative;   
text-decoration: none;
}

h2 {
font-size:80px;
margin:2px 0 -20px 0 !important;
}


</style>

<script src="js/home.js"></script>

</head>
<body onLoad="noBack();">
<h2 id="message3"></h2>
<h2 align="center">E-Commerce Application Home Page</h2><br>
<div id="menuList">
<ul>
<li><input type="button" value="home" id="home"></li>
<li><input type="button" value="viewCart" id="viewCart"></li>
<li><input type="button" value="viewOrders" id="viewOrders"></li>
<li><input type="button" value="Update User Profile" id="updateUser"></li>
<li><input type="button" value="Update User Address" id="updateAddress"></li>
</ul>
</div>

	<div align="left">
	<h1>Welcome <%=request.getParameter("name")%></h1><br><br>
	
	<form>
		   <ul>
		   		<c:forEach var="product" items="${list}">
		   		
		   			<li><img src = "/images/${product.id}.jpg" width="200" height="200"></li>
		   			<li>${product.id} </li>
		   			<li>${product.name}</li>
		   			<li>${product.supplier}</li>
		   			<li>${product.price}</li>
		   			<li><a href="/viewProduct/${product.id}/?name=<%=request.getParameter("name")%>">view product Info</a></li>
		   			<p>-------------------------------------------------------------------------------------------------</p>
		   		</c:forEach>
		   		
		   </ul>
		  </form>			    
	</div>
</body>
</html>