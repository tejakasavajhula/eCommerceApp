<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p align="center">Registration Form</p>
<form action = "RegisterController" method="post">

<table>
<tr><td>Username</td> <td><input type="text" name="username"/></td></tr>
<tr><td>Password</td> <td><input type="text" name="pwd"/></td></tr>
<tr><td>Firstname</td> <td><input type="text" name="firstname"/></td></tr>
<tr><td>Last name</td> <td><input type="text" name="lastname"/></td></tr>
<tr><td>Email </td><td><input type="text" name="email"/></td></tr>
<tr><td>Role</td> <td><input type="text" name="username"/></td></tr>
</table><br><br>

<input type="submit" value="register"/><br><br>

</form>

</body>
</html>