<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import = "org.cms.MODEL.Login" %>
<%
    Login login = (Login) request.getAttribute("login");
%>
<!DOCTYPE html>
<html>
<head>
    <title>Edit Student</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
<div class="container mt-5">
    <h2 class="mb-4">Edit Student</h2>
    <form action="update-student" method="post">
        <input type="hidden" name="id" value="<%= login.getId() %>">
        <div class="mb-3">
            <label for="name" class="form-label">Email</label>
            <input type="text" class="form-control" id="email" name="email" value="<%= login.getEmail() %>" required>
        </div>
        <div class="mb-3">
            <label for="email" class="form-label">Password</label>
            <input type="email" class="form-control" id="password" name="password" value="<%= login.getEmail() %>" required>
        </div>
        
        <button type="submit" class="btn btn-primary">Update Student</button>
        <a href="student-list" class="btn btn-secondary">Cancel</a>
    </form>
</div>
</body>
</html>
