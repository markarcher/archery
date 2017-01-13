<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- <script type=”text/javascript” src=”bootstrap.min.js”></script>
<script type=”text/javascript” src=”bootstrap.js”></script> -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<link href="css/loginCss.css" rel="stylesheet" />
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="js/loginScript.js"  ></script>
</head>
<body>
    <div class="container" id="loginContainer">
        <div id="loginForm">
            <div class="row">
                <div class="col-md-12">

                    <form action="Login" method="post" name="Login_Form" class="form-signin">
                        <h3 class="form-signin-heading">Welcome Back!</h3>
                        <hr class="colorgraph"><br>

                        <input type="text" class="form-control" name="Username" id="Username" placeholder="Username" required="" autofocus="" />
                        <input type="password" class="form-control" name="Password" id="Password" placeholder="Password" required="" />

                        <button class="btn btn-lg btn-primary btn-block" name="Submit" id="loginButton" value="Login" type="Submit">Login</button>

                    </form>

                </div>
            </div>

        </div>
        <div class="row">
            <div class="col-md-12 text-center">
                <h5>Please register if you don't have an account yet.</h5>
            </div>
        </div>

        <div class="row">
            <div class="col-sm-offset-5 col-sm-2 text-center">

              
                <input type=button class="btn btn-default btn-lg btn-block" onclick="showRegisterForm();" value='Register'>
            </div>
        </div>

        <div id="showRegistrationForm" style="visibility:hidden">
           <H3>Registration Form</H3>
    <form action='Register' method="post" name="Registration_Form" class="form-vertical">
        <div class="form-group">
            <div class="row">
                <div class="col-md-3">
                    <label>Username</label>
                    <input type="text" class="form-control" name="username">
                </div>
                <div class="col-md-3">
                    <label>Password</label>
                    <input type="text" class="form-control" name="password">
                </div>
                <div class="col-md-3">
                    <label>Full Name</label>
                    <input type="text" class="form-control" name="fullName">
                </div>
            </div>
        </div>
        <div class="form-group">
            <label>Department</label>
            <select class="selectpicker" data-style="btn-primary" name="department">
                <option selected disabled hidden style='display: none' value=''>Choose an option</option>
                <option value="scorer">Scorer</option>
                <option value="admin">Administrator</option>
                <option value="tournamentManager">TournamentManager</option>
                <option value="judge">Judge</option>
            </select>
        </div>
      <div class="row">
          <div class="col-md-3">
            
              <button class="btn btn-lg btn-primary btn-block" name="Submit" value="Register" type="Submit">Register</button>
          </div>
      </div> 
    </form>              
	</div>   
    </div>


</body>
</html>