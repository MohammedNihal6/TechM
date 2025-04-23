<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Register</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
  <link rel="stylesheet" href="styles.css">
</head>
<body>
  <div class="container mt-5">
    <div class="row justify-content-center">
      <div class="col-md-6">
        <div class="card p-4 shadow-lg rounded-4">
          <h2 class="text-center mb-4">Register</h2>
          <form action="RC2" method="post">
       <div class="mb-3">
        <label for="td" class="form-label">ID</label>
        <input type="number" class="form-control" name="id" required>
      </div>
            
      <div class="mb-3">
        <label for="email" class="form-label">Email address</label>
        <input type="email" class="form-control" name="email" required>
      </div>
      <div class="mb-3">
        <label for="password" class="form-label">Password</label>
        <input type="password" class="form-control" name="password" required>
            <button type="submit" class="btn btn-apply w-100 mt-3">Submit</button>
          </form>
          
      <p class="text-center mt-3">Have an account? <a href="login.jsp">Login</a></p>
        </div>
      </div>
    </div>
  </div>
</body>
</html>
