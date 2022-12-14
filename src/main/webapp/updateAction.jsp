<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="update" class="beans.UpdateBean" scope="session" />
	<jsp:setProperty property="*" name="update" />
	<%
	if (update.userupdate()) {
		session.setAttribute("name", update.getName());
	%>
	<jsp:forward page="success.jsp" />
	<%
	} else {
	%>
	<jsp:forward page="edit.jsp" />
	<%
	}
	%>
</body>
</html>