<%@page import="java.util.ArrayList"%>
<%@page import="beans.ViewBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="view" class="beans.ViewBean" scope="session" />
	<%
	ArrayList<ViewBean> al = view.getAllRecords();
	%>
	<h1>Employee Details</h1>
	<table border="1" width="100%">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Address</th>
			<th>Mobile</th>
			<th>Salary</th>
		</tr>
		<%
		for (ViewBean emp : al) {
		%>
		<tr>
			<td><%=emp.getId()%></td>
			<td><%=emp.getName()%></td>
			<td><%=emp.getEmail()%></td>
			<td><%=emp.getAddress()%></td>
			<td><%=emp.getMobile()%></td>
			<td><%=emp.getSalary()%></td>
		</tr>

		<%
		}
		%>

	</table>
</body>
</html>