<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="obj" class="beans.LoginBean" scope="session" />
	<jsp:setProperty property="username" name="obj" param="uname" />
	<jsp:setProperty property="password" name="obj" param="pwd" />
	<%--<jsp:setProperty property="*" name="obj" />
	  <jsp:setProperty property="obj" name="username"/> 
 <jsp:setProperty property="obj" name="password"/> --%>
	<%
	if (obj.loginVerify()) {
		session.setAttribute("name", obj.getUsername());
		try {
			RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	} else {
			out.print("invalid username and password");
	%>
	
	<jsp:include page="login.jsp"/>
	
	<%
	//RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
	//rd.include(request, response);
	}
	%>
</body>
</html>