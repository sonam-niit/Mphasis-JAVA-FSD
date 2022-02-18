<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="salary" value="998738.72734"> </c:set>
<fmt:formatNumber value="${salary}" type="currency"></fmt:formatNumber> <br>
<fmt:formatNumber value="${salary}" type="number" maxFractionDigits="5"></fmt:formatNumber>

<c:set var="today" value="<%= new Date() %>"> </c:set>
date: <fmt:formatDate value="${today }" type="date"/><br>
time: <fmt:formatDate value="${today }" type="time"/><br>
Both: <fmt:formatDate value="${today }" type="both"/><br>
Long: <fmt:formatDate value="${today }" type="both" timeStyle="long" dateStyle="long"/><br>
</body>
</html>