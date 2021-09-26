<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<title>App</title>
</head>
<body>
<h2>Welcome to App</h2>
<a href="${pageContext.request.contextPath}/home">go to home</a>
<a href="${pageContext.request.contextPath}/admin/add_customer" >Add Customer</a><br/>
<a href="${pageContext.request.contextPath}/manager/show_customer" >Show Customer</a>
</body>
</html>
