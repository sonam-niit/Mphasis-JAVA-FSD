<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="books">
	<books>
		<book>
			<name>The Complete Refrence JAVA</name>
			<author>Mac grow Hill</author>
		</book>
		<book>
			<name>LET US C</name>
			<author>Balaguruswami</author>
		</book>
	</books>
</c:set>
<x:parse xml="${books }" var="result"></x:parse>
1st Book Name: <x:out select="$result/books/book[1]/name"/><br>
2nd Book Author: <x:out select="$result/books/book[2]/author"/><br>
</body>
</html>