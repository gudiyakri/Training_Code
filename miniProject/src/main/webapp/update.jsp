<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Data</title>
</head>
<body>
	<h1>----------Update Data--------------</h1>
	<form action="updateservlet" method="post">
		  <label for="id">Id:</label> 
		  <input type="text" name="id" value="<c:out value='${dataUser.getId()}'/>" readonly /><br/>
		  <label for="name">Name:</label> 
			<input type="text" id="name" name="name" value="<c:out value='${dataUser.getName()}'/>"><br> 
		<label for="password">Password:</label> 
		<input type="password" id="password" name="password" value="<c:out value='${dataUser.getPassword()}'/>"><br>
		<label for="email">Email:</label> 
		<input type="email" id="email" name="email" value="<c:out value='${dataUser.getEmail()}'/>"><br>
		<label for="contact">Contact:</label> 
		<input type="text" id="contact" name="contact" value="<c:out value='${dataUser.getContact()}'/>"><br>
		<button>Update</button>
	</form>
</body>
</html>