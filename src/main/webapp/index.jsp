<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Scholarship Management System</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" />
  <link href="styles.css" rel="stylesheet"/>
</head>
<body>

  <!-- Header -->
  <nav class="navbar navbar-expand-lg bg-white py-3 px-4">
    <div class="container-fluid d-flex justify-content-between align-items-center">
      <div class="d-flex flex-column">
        <span class="fw-bold fs-5">SCHOLARSHIP</span>
        <span class="fw-light fs-6">MANAGEMENT SYSTEM</span>
      </div>
      <ul class="navbar-nav flex-row gap-3 align-items-center">
        <li class="nav-item"><a class="nav-link" href="#">Home</a></li>
        <li class="nav-item"><a class="nav-link" href="#">About</a></li>
        <li class="nav-item"><a class="nav-link" href="#">Schemes</a></li>
        <li class="nav-item"><a class="nav-link" href="#">Contact</a></li>
        <li class="nav-item"><a class="nav-link" href="admin.html">Admin</a></li>
        <li><a href="index.html" class="btn btn-apply">Apply Now!</a>
<a href="login.html" class="btn btn-apply ms-2">Login</a>
<a href="add-student.jsp" class="btn btn-apply ms-2">Register</a></li>
      </ul>
    </div>
  </nav>

  <!-- Main content -->
  <div class="container mt-4">
    <div class="row align-items-start">
      <!-- Left section -->
      <div class="col-md-5 d-flex flex-column align-items-start">
        <div class="announcement-title">ANNOUNCEMENTS</div>
        <div class="announcement-box">
          <div class="d-flex align-items-center">
            <div class="announcement-badge">M</div>
            <div class="announcement-text">
              <div class="title">Merit 2024</div>
              <div class="text-muted">Merit Scholarship for 2024</div>
            </div>
          </div>
          <button class="btn btn-checknow">CHECK NOW</button>
        </div>
        <img src="images/stud.jpg" alt="Students" class="student-img" />
      </div>

      <!-- Right section -->
      <div class="col-md-7 text-center text-md-start mt-4 mt-md-0">
        <div class="main-headline">
          ALMOST 75% OF<br />
          STUDENTS GET<br />
          SCHOLARSHIPS EVERY<br />
          YEAR.
        </div>
        <button class="btn btn-explore">Explore now</button>
      </div>
    </div>
  </div>

  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
