<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="beans.RegisterBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="edit" class="beans.EditBean" scope="session" />
	<jsp:setProperty property="id" name="edit" param="uid" />
	<%
	RegisterBean rb = edit.editrecords();
	if (rb != null) {
		session.setAttribute("bean", rb);
	%>
	<jsp:forward page="update.jsp" />
	<%
	} else {
	%>
	<jsp:forward page="edit.jsp" />
	<%
	}
	%>
</body>
</html>