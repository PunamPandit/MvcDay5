<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>registration page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.1/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<div class="container">

  <h2>registration Form</h2>
  <form action="registration" method="post">
    ${msg}
    <div class="form-group">
      <label for="emailId">Enter Employee EmailId:</label>
      <input type="text" class="form-control" placeholder="Enter emailId" name="emailId">
    </div>
    <div class="form-group">
      <label for="password">Enter Password:</label>
      <input type="text" class="form-control" placeholder="Enter Password" name="password">
    </div>
    <div class="form-group">
      <label for="employeeName">Enter Employee Name:</label>
      <input type="text" class="form-control" placeholder="Enter full name" name="employeeName">
    </div>
    <div class="form-group">
      <label for="salary">Enter Salary:</label>
      <input type="text" class="form-control" placeholder="Enter salary" name="salary">
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
    <button type="reset" class="btn btn-danger">Reset</button>
  </form>
</div>


</body>
</html>