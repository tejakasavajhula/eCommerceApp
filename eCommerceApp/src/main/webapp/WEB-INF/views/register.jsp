<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet" href="https://bootswatch.com/lumen/bootstrap.min.css">
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>

<script type="text/javascript">
	window.history.forward();
	function noBack() {
		window.history.forward();
	}
</script>

<script src="js/register.js"></script>

<title>eCommerce Application Registration Page</title>
</head>
<body>
	<div align="center">
		<table>
			<tr>
				<td>Username</td>
				<td><input type="text" name="username" required = "required" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="pwd" required="required"/></td>
			</tr>
			<tr>
				<td>Confirm Password</td>
				<td><input type="password" name="cpwd" required = "required"/></td>
			</tr>
			<tr>
				<td>Firstname</td>
				<td><input type="text" name="firstname" required = "required"/></td>
			</tr>
			<tr>
				<td>Last name</td>
				<td><input type="text" name="lastname" required = "required"/></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="email" name="email" required = "required"/></td>
			</tr>
			<tr>
				<td>Phone</td>
				<td><input type="number" name="phone" required = "required"/></td>
			</tr>
			<tr>
				<td>Role</td>
				<td><input type="text" name="role" required = "required"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="button" value = "Register" name="doRegister" id="doRegister" /></td>
			</tr>
		</table>
		<h2>If already registered please <a href="/login">click here</a></h2>
	</div>
</body>
</html>