<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Champs bank app</title>
</head>
<body>
	<table border="1">
		<thead>
			<tr>
				<th>accout id</th>
				<th>account holder name</th>
				<th>account balance</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${accountsList}" var="account">
				<tr>
					<td>${account.id}</td>
					<td>${account.name}</td>
					<td>${account.balance}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br>
	<a href="transfer">transfer request</a>
</body>
</html>