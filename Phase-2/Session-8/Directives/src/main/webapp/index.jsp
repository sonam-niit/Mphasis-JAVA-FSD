<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import="java.util.Date" %>
<%@ page info="This is my JSP page for Home page" isELIgnored="false" %>

${'heloo World' }<br>
<%= new Date() %><br>

<%@include file="login.jsp" %>
</body>
</html>