<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Delete User Profile
<form action="deleteAction.jsp" method="post">
<label>User Id:</label><input type="number" name="eid" required><br>
<input type="submit" value="Delete profile">
</form>
</body>
</html>