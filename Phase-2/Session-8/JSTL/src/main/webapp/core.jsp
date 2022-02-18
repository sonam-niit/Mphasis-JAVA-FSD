<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Value: <c:out value="${400*5 }"/> <br>
<c:set var="income" value="${6*4000 }"></c:set>
value: <c:out value="${income }"/> <br>

<c:catch var="error">
	<% int x=10/0; %>
</c:catch>
<c:if test="${error!=null }">
	${error }<br>
</c:if>
<c:choose>
	<c:when test="${income>=24000 }">
		Can manage everything
	</c:when>
	<c:otherwise>
		difficult to manage
	</c:otherwise>
</c:choose>
</body>
</html>