<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="beans.RegisterBean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
RegisterBean rb=(RegisterBean)session.getAttribute("bean");
%>

<form action="updateAction.jsp" method="post">
<!-- <label>User Id:</label> --><input type="hidden" name="id" value="<%=rb.getId() %>"><br>
Change Your Details<br>
<label>Name:</label><input type="text" name="name" value="<%=rb.getName() %>" required><br>
<label>Email:</label><input type="text" name="email" value="<%=rb.getEmail() %>" required><br>
<label>Mobile:</label><input type="number" name="mobile" value="<%=rb.getMobile() %>" required><br>
<label>Address:</label><input type="text" name="address" value="<%=rb.getAddress() %>" required><br>
<label>Salary:</label><input type="number" name="salary" value="<%=rb.getSalary() %>" ><br>
<input type="submit" value="Update" >
</form>
</body>
</html>