<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import = "org.cms.MODEL.Login" %>
<%
    HttpSession oldsession = request.getSession(false);
    List<Login> logins = null;
    if (oldsession != null) {
        logins = (List<Login>) oldsession.getAttribute("abc");
    } else {
        out.println("<h2>Session not found. Try refreshing.</h2>");
    }
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Scholarship Management Registered Students</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>

<div class="container mt-5">
	<h2 class="mb-4">Student List</h2>
	<a href="add-student.jsp" class="btn btn-success mb-3">Add New Student</a>
	<table class="table table-bordered table-striped">
        <thead class="table-dark">
        <tr>
        	<th>ID</th>
        	<th>Email</th>
        	<th>Password</th>
        	
        	<th>Actions</th>
        </tr>
        </thead>
        <tbody>
        <% if (logins != null) {
            for (Login login : logins) {
        %>
        <tr>
        	<td><%= login.getId() %></td>
        	<td><%= login.getEmail() %></td>
        	<td><%= login.getPassword() %></td>
        	<td>
                <a href="edit-student?id=<%= login.getId() %>" class="btn btn-sm btn-primary">Edit</a>
                <a href="delete-student?id=<%= login.getId() %>" class="btn btn-sm btn-danger">Delete</a>
            </td>
        </tr>
        <%  }
        } else {
        %>
        <tr><td colspan="5" class="text-center">No students found</td></tr>
        <% } %>
        </tbody>
        </table>

</div>
<a href="login" class="btn btn-primary">View Students</a>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>