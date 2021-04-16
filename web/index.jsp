<!DOCTYPE html>
<html lang="en">
<head>
  <title>Lab Task</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container-fluid">
  <div class="row">
    <div class="col-sm-3"></div>
    <div class="col-sm-6"style="background-color: lightgrey">
      <br>
      <i><h2 style="text-align: center; color: red;">Student Enrollment Signup Form</h2></i>
      <hr>
      <br>
      <form action="FarhaanServlet" method="Post">
        <div class="form-group">
          <label for="un">User Name:</label>
          <input type="text" class="form-control" id="un" name="Username">
        </div>
        <div class="form-group">
          <label for="pwd">Password:</label>
          <input type="password" class="form-control" id="pwd" name="Password">
        </div>
        <div class="form-group">
          <label for="fn">First Name:</label>
          <input type="text" class="form-control" id="fn" name="fistname">
        </div>
        <div class="form-group">
          <label for="ln">Last Name:</label>
          <input type="text" class="form-control" id="ln" name="lastname">
        </div>
        <div class="form-group">
          <label for="dB">Date Of Birth:</label>
          <input type="date" class="form-control" id="dB" name="daeofbirth">
        </div>
        <div class="form-group">
          <label for="EA">Email Address:</label>
          <input type="email" class="form-control" id="EA" name="emailaddress">
        </div>
        <button type="submit" class="btn btn-default">Cancel</button>
        <button type="submit" class="btn btn-danger">Submit</button>
      </form>

      <hr>
      <i><p style="color: red;text-align: right;">&copy; Farhan.Rajaay</p></i>
      <br>
    </div>
    <div class="col-sm-3"></div>
  </div>
</div>

</body>
</html>


