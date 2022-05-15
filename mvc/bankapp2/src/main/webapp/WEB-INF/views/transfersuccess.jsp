<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Champ bank app transfer message</title>
</head>
<body>
fund is transfer successfully
${accountDto.from }<br/>
${accountDto.to }<br/>
${accountDto.money }<br/>
<a href="accounts">all accounts</a>
</body>
</html>