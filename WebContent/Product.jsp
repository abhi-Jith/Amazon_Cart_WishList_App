<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page import="models.*" %>
	<%@ page import="services.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="./addToCart" method="post">
		<h1 color="Red">Welcome to the products page</h1>
		<%
		
		String userName = (String) session.getAttribute("user");
	%>
		<h2>
			Username:
			<%=userName%>
		</h2>
		<button type="submit" name="button" value="button1">Add To Cart</button>
		</form>
</body>
</html>