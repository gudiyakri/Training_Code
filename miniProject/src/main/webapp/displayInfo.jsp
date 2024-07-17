<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Student List</title>
    <style>
        table {
            border-collapse: collapse;
            width: 100%;
        }

        th, td {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h2>Student List</h2>
    <button><a href="index.jsp">Register new Student</a></button>
    <table>
        <thead>
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Email</th>
                <th>Contact</th>
               	<th>Action</th>
            </tr>
        </thead>
        <tbody>
           <c:forEach var="disp" items="${fetchUsers }">
          <tr>
          <td><c:out value="${disp.id }" /></td>
          <td><c:out value="${disp.name }" /></td>
          <td><c:out value="${disp.email }" /></td>
          <td><c:out value="${disp.contact }" /></td>
          <td><a href="selectbyid?id=<c:out value='${disp.id}' />">Edit</a>
          <a href="delete?id=<c:out value='${disp.id}'/>">
          	Delete
          </a></td>
          </tr>
          </c:forEach>
        </tbody>
    </table>
</body>
</html>
