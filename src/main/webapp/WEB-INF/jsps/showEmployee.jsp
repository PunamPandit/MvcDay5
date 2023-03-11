<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>response page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.1/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Response Page</h2>
  
  <table class="table table-hover">
    <thead>
      <tr bgcolor="yellow">
        <th>Employee Id</th>
        <th>Employee name</th>
        <th>Salary</th>
        <th>Email Id</th>
        <th>Password</th>
      </tr>
    </thead>
    <tbody>
      <tr bgcolor="pink">
        <td>${employeeDTO.employeeId}</td>
        <td>${employeeDTO.employeename}</td>
        <td>${employeeDTO.salary}</td>
        <td>${employeeDTO.emailId}</td>
        <td>${employeeDTO.password}</td>
      </tr>
      <a href="showEmployee2">click here for all employee list</a>
    </tbody>
  </table>
</div>


</body>
</html>