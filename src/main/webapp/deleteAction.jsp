<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="delete" class="beans.UpdateBean" scope="session" />
	<jsp:setProperty property="id" name="delete" param="eid"/>
	<%
	if (delete.userDelete()) {
	%>
	Deleted Successfully<br><%=delete.getName()%>
	<jsp:include page="register.jsp" />
	<%
	} 
	else {
	%>
	something went wrong, please try again...<br>
	<jsp:include page="delete.jsp" />
	<%
	}
	%>
</body>
</html>