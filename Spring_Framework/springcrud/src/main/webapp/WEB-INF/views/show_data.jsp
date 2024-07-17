<%@ page isELIgnored="false" %>
<%@ page uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<c:choose>
<c:when test="${!emplty listStu}">
<table>
<tr><th>Id</th><th>Name</th><th>Email</th><th>Operation</th></tr>
<c:forEach var="std" items=${listStu}>
<tr>
<td>${std.id}</td>
<td>${std.name}</td>
<td>${std.email}</td>
<td></td>
</tr>
</c:forEach>
</table>
</c:when>
<h1>Records not found</h1>
</c:choose>
