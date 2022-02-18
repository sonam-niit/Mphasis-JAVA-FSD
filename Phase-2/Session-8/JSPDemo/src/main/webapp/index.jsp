<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Scriptlet</h1>
<hr>
<%
	out.print("Hello World with JSP Programming");
%>
<h1>Declaration- to declare variables as well as methods</h1>
<hr>
<%! int a=20; int b=20; %>
<%! public int cube(int n)
{
		return n*n*n;
}
%>
<h1>Expression</h1>
<hr>
<%= "Result is " +a+b %><br>
<%= "Cube of 5 is "+cube(5) %><br>
<%= new Date() %>
<h1>Using EL</h1>
${'Hello World' }

<a href="implicit.jsp">ImplicitObject</a>

</body>
</html>