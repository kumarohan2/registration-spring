<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
<form action = "controller/register" method="post">
Enter name : <input type="text" name="name" /> <br/>
Enter email id : <input type="email" name="email" /> <br/>
Enter password : <input type = "password" name="password"/> <br/>
<input type="submit" value ="Register" />



</form>

</body>
</html>