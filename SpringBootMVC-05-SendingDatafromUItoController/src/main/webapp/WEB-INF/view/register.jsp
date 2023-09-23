<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
<div class="container">
	<center><h1>EMPLOYEE REGISTRATION PAGE</h1></center>
	<br/>
	
	<div class="row">
	<div class="col-2"></div>
	<div class="col-4">
	<form method="post" action="/emp/reg">

    <label for="form-label">EMPID</label>
    <input type="number" class="form-control" name="empNo"  placeholder="enter empid" required>
    
    
    <label for="form-label">EMPNAME</label>
    <input type="text" class="form-control" name="empName" placeholder="enter empname" required>
    
     <label for="form-label">EMPSAL</label>
     <input type="number" class="form-control" name="empSal" placeholder="enter empsalary" required>
    <br><br>
    
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
	
	
	</div>
	
	<div class="col-4"></div>
	<div class="col-2"></div>
	
	</div>

</div>

</body>
</html>