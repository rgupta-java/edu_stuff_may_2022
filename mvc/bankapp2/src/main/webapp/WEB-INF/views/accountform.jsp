<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Champ bank fund tranfer</title>
</head>
<body>
<form:form action="transfer" method="post" modelAttribute="accountDto">
	Enter from account:<form:input path="from"/><br/>
	Enter to amount:<form:input path="to"/><br/>
	Enter money to transfer:<form:input path="money"/><br/>
	<input type ="submit"/>
</form:form>

</body>
</html>