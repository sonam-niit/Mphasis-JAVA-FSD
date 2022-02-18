<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/ecommerce" 
user="root" password="Sonam@123" var="conn"/>

<sql:query var="rs" dataSource="${conn }">
	select * from eproduct
</sql:query>

<table>
	<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Price</th>
		<th>date</th>
	</tr>
	<c:forEach var="product" items="${rs.rows }" >
		<tr>
			<td>${product.id }</td>
			<td>${product.name }</td>
			<td>${product.price }</td>
			<td>${product.date_added }</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>