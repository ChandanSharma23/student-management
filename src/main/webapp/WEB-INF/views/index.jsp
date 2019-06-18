<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ page import = "java.util.ResourceBundle" %> 
<% ResourceBundle resource = ResourceBundle.getBundle("application");

String version=resource.getString("version");%>

<%=version %>
<!DOCTYPE html>    
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Student Management Screen</title>
</head>
<body>

	<div align="center">
		<h1>Student List</h1>
		<h3>
			<a href="newStudent">New Student</a>
		</h3>
		
		<table border="1">

			<th>FirstName</th>
		    <th>LastName</th>
			
			<th>Email</th>
			<th>Action</th>

			<c:forEach var="student" items="${listStudent}">
				<tr>

					<td>${student.firstName}</td>
					<td>${student.lastName}</td>
					<td>${student.email}</td>
					
					<td><a href="editStudent?id=${student.id}">Edit</a>
						    
						         <a href="deleteStudent?id=${student.id}">Delete</a></td>

				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>