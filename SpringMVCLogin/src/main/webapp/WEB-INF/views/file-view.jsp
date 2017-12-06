<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Spring MVC Test</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
  <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
  <div class="container">
    <h3>Xin chào: {username_fb}</h3>
    <div>Dưới đây là 1 số thông tin cơ bản của bạn:</div>
    <div class="col-md-6" style="padding-left: 0px; padding-top: 2em;">
    <table class="table table-bordered table-striped">
      <thead>
        <tr>
          <th>Key</th>
          <th>Value</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>Id</td>
          <td>{id}</td>
        </tr>        
        <tr>
          <td>FirstName</td>
          <td>{first_name}</td>
        </tr>
        <tr>
          <td>LastName</td>
          <td>{last_name}</td>
        </tr>        
        <tr>
          <td>Gender</td>
          <td>{gender}</td>
        </tr>
        <tr>
          <td>Birthday</td>
          <td>{birthday}</td>
        </tr>        
        <tr>
          <td>Education</td>
          <td>{education}</td>
        </tr>
        <tr>
          <td>Email</td>
          <td>{email}</td>
        </tr>
      </tbody>
    </table>
  </div>
  </div>

  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</body>
</html>