<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="obj" class="com.usebean.demo.Student" scope="session"></jsp:useBean>

<!-- call getter Property -->
<h3>Value before setting up a property</h3>
Id: <jsp:getProperty property="id" name="obj"/><br>
Name: <jsp:getProperty property="name" name="obj"/><br>
<!-- Set property -->
<jsp:setProperty property="id" name="obj" value="781"/>
<jsp:setProperty property="name" name="obj" value="John Smith"/>

<h3>Value After setting up a property</h3>
Id: <jsp:getProperty property="id" name="obj"/><br>
Name: <jsp:getProperty property="name" name="obj"/><br>

<a href="nextpage.jsp">Access Request Scope Bean</a>
<jsp:
</body>
</html>