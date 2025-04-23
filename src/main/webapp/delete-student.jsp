<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import = "org.cms.MODEL.Login" %>
<%
    Login login = (Login) request.getAttribute("student");
%>
<!DOCTYPE html>
<html>
<head>
    <title>Delete Student</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
<div class="container mt-5">
    <h2 class="mb-4">Delete Student</h2>
    <p>Are you sure you want to delete the following student?</p>
    <ul>
        <li><strong>Name:</strong> <%= login.getId() %></li>
        <li><strong>Email:</strong> <%= login.getEmail() %></li>
    </ul>
    <form action="delete-student" method="post">
        <input type="hidden" name="id" value="<%= login.getId() %>">
        <button type="submit" class="btn btn-danger">Confirm Delete</button>
        <a href="student-list" class="btn btn-secondary">Cancel</a>
    </form>
</div>
</body>
</html>
