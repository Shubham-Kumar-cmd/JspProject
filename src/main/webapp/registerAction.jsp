<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="reg" class="beans.RegisterBean" scope="session" />
	 <jsp:setProperty property="*" name="reg" />
	<%--<jsp:setProperty property="id" name="reg" value="<%= %>"/>
	<jsp:setProperty property="username" name="reg" value="<%= %>"/>
	<jsp:setProperty property="password" name="reg" value="<%= %>"/>
	<jsp:setProperty property="name" name="reg" value="<%= %>"/>
	<jsp:setProperty property="email" name="reg" value="<%= %>"/>
	<jsp:setProperty property="mobile" name="reg" value="<%= %>"/>
	<jsp:setProperty property="address" name="reg" value="<%= %>"/>
	<jsp:setProperty property="salary" name="reg" value="<%= %>"/>--%>
	<%
	if (reg.registerVerify()) {
	%>
	Register Successfully
	<jsp:include page="login.jsp" />
	<%
	}
	%>
</body>
</html>