<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="models.*"%>
<%@ page import="java.util.*"%>
<%@ page import="services.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jstl/xml"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jstl/sql"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Products Available</title>
</head>

<body>

	<%!//Set<Product> products = null;
	List<Product> productList = null;
	ProductsDaoService productsDaoService = new ProductsDaoService();%>
	<%
		if (session != null) {
			String user = (String) session.getAttribute("user");
			out.print("Hello, " + user + ". Welcome to Profile");
		} else {
			out.print("Please login first");
			request.getRequestDispatcher("login.html").include(request, response);
		}
		productList = productsDaoService.getProducts();

		//for(Product product:products){
	%>
	<h1>The Products available are listed below:</h1>
	<table cellpadding="2" cellspacing="2" border="1">
		<tr>
			<th>ProductId</th>
			<th>ProductName</th>
			<th>ProductInfo</th>
			<th>ProductPrice</th>
			<th>ProductPriceUnit</th>
			<th>Add To Cart</th>
		</tr>
		<c:forEach var="p" items="<%=productList%>">
			<tr>
				<td>${p.productId }</td>
				<td>${p.productName }</td>
				<td>${p.productInfo }</td>
				<td>${p.productPrice }</td>
				<td>${p.productPriceUnit }</td>
				<!-- <td><button class="AddToCart" align="center">AddToCart</button></td> -->
				<td><INPUT TYPE="BUTTON" VALUE="Add To Cart"
					ONCLICK="button1()"></td>
			</tr>
		</c:forEach>
	</table>

	<SCRIPT LANGUAGE="JavaScript">
	<!--
		function button1() {
			/* document.form1.buttonName.value = "Add To Cart"
			form1.submit() */

		}
	</SCRIPT>
</body>
</html>