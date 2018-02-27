<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>All User</title>
	</head>
	<body>
		<h1>Exibir dados dos usuarios com MySql</h1>
		
		
		<h2>Submitted Employee Information</h2>
		<table>
			<tr>
				<td>Nickname :</td>
				<td>${nickname}</td>
			</tr>
			<tr>
				<td>Email :</td>
				<td>${email}</td>
			</tr>
			<tr>
				<td>Senha :</td>
				<td>${senha}</td>
			</tr>
		</table>
		
	</body>
</html>