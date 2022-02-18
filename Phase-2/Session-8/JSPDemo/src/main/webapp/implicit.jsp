<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String responseCheck= request.getParameter("office");
	if(responseCheck!=null){
		response.setStatus(response.SC_MOVED_TEMPORARILY);
		response.setHeader("Location", "response-redirect.jsp?office="+responseCheck);
	}
%>

<%
	String error= request.getParameter("error");
	if(error!=null)
	{
			throw new RuntimeException("Exception Occured");
	}

%>

<a href="implicit.jsp?office=head_office">Check use of Response object</a>
<br>
<a href="implicit.jsp?error=1">Use of Exception Object</a><br>

<%
	int serverPort= request.getServerPort();
	out.print("Port: "+serverPort+"<br>");
	out.print("Servlet Name is "+ config.getServletName()+"<br>");
	out.print("Server Info: "+application.getServerInfo()+"<br>");
	
	out.print("Page Name: "+ page.toString()+"<br>");
	
	pageContext.setAttribute("userid", "sonam soni");
	out.print("Attribute from Page Context: "+ pageContext.getAttribute("userid")+"<br>");
%>
</body>
</html>