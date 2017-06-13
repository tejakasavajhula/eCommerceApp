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
function noBack(){
	window.history.forward();
        }
    </script>
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
    
    <script src="js/login.js"></script>
    
    <title>ECommerce Portal</title>
</head>
<body onLoad="noBack();">
    <h1 align="center">Welcome ECommerce Online shopping portal</h1>
    <h3 align="center">User's Login Page:</h3><br><br>
    <h2 id="message" style="color:red"></h2>
    <h2 id="message2" style="color:green"></h2>
    <div align="center">
        <table>
            <tr>
                <td>User Name: </td>
                <td><input type="text" id="username", name="username" placeholder="Enter username here" size="30" required="required" /></td>
            </tr>
            
            <tr>
                <td>Password: </td>
                <td><input type="password" id="pass" name="pass" placeholder="Enter password here" size="30" required="required" /></td>
            </tr>

            <tr>
                <td><input type="button" value="Login" name="doLogin" id="doLogin" /></td>
            </tr>
        </table>
    </div>
        <h3><font>New user? <a href="/register">Click here to Register</a></font></h3>
   
</body>
</html>