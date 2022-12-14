<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="registerAction.jsp" method="post">
<label>User Id:</label><input type="number" name="id"><br>
<label>Username:</label><input type="text" name="username" required><br>
<label>Password:</label><input type="password" name="password" required><br>
<label>Name:</label><input type="text" name="name" required><br>
<label>Email:</label><input type="text" name="email" required><br>
<label>Mobile:</label><input type="number" name="mobile" required><br>
<label>Address:</label><input type="text" name="address" required><br>
<label>Salary:</label><input type="number" name="salary"><br>
<input type="submit" value="Register" >
</form>
</body>
</html>