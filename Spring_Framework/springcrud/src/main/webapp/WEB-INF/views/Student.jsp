<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>student_form</title>
</head>
<body>
<h2 class="form-title">-----Student Form------</h2>
<div class="form-content">
<form:form action="regi" method="post" modelAttribute="stud">
<div class="form-group">
<div class="row">
<input type="text" name="name" placeholder="Your Name..."/>
</div>
</div>
<div class="form-group">
<div class="row">
<input type="email" name="email" placeholder="Your Email..."/>
</div>
</div>
<div class="form-group">
<div class="row">
<input type="password" name="pass" placeholder="Your Password..."/>
</div>
</div>
<div class="form-group">
<div class="row">
<input type="password" name="re_pass" placeholder="Repeat your password..."/>
</div>
</div>
<div class="form-group">
<div class="row">
<input type="submit" name="submit" value="Submit"/>
</div>
</div>
</form:form>
</div>
</body>
</html>
    