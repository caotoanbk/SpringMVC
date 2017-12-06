<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="ISO-8859-1"%>
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
    <div class="row">
      <h1 class="col-sm-4 col-sm-offset-4 text-center">Spring MVC Test</h1>
    </div>
    <div class="row"></div>
    <div class="row">
      <div class="col-sm-4">
        <h3 class="text-right">Login by Facebook</h3>

        <div align="right" style="margin-top: 4em;">
          <button id="btn-fbsignup" type="button" class="btn btn-primary btn-lg"><i class="fa fa-facebook">&nbsp;</i>Login with Facebook</button>                           
        </div>
      </div>
      <div class="col-sm-4 col-sm-offset-4">
        <h3 class="text-left">Login by User</h3>
        <div class="panel panel-default" style="margin-top: 4em;">
          <div class="panel-body" >
            <h4>Please login</h4>
            <form:form id="loginform" class="form-horizontal" commandName="login_info" role="form" action="login" method="post">
              <div class="form-group">
                <div class="col-md-12">
                  <form:input type="text" class="form-control" path="email" placeholder="Email Address" />
                  <form:errors path="email" />
                </div>
              </div>
              <div class="form-group">
                <div class="col-md-12">
                  <form:input type="password" class="form-control" path="password" placeholder="Password" />
              </div>
            </div>
            <div class="form-group">
              <div class="col-md-12">
                  <label style="font-weight: normal;">
                    <input id="login-remember" type="checkbox" name="remember" value="1"> Remember me
                  </label>
              </div>
            </div>
              <div class="form-group">
                <div class="col-md-12">
                  <button id="btn-signup" type="submit" class="btn btn-primary btn-block"><i class="icon-hand-right"></i> &nbsp Login</button> 
                </div>
              </div>
            </form:form>
          </div>
        </div>
      </div>
    </div>
  </div>

  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</body>
</html>