<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Login</title>
	<link rel="stylesheet" type="text/css" href="https://www.w3schools.com/w3css/4/w3.css">
<style>
form {
    border: 3px solid #f1f1f1;
}

input[type=text], input[type=password] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}

button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
}

button:hover {
    opacity: 0.8;
}

.cancelbtn {
    width: auto;
    padding: 10px 18px;
    background-color: #f44336;
}

.imgcontainer {
    text-align: center;
    margin: 24px 0 12px 0;
}

img.avatar {
    width: 40%;
    border-radius: 50%;
}

.container {
    padding: 16px;
}

span.psw {
    float: right;
    padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
    span.psw {
       display: block;
       float: none;
    }
    .cancelbtn {
       width: 100%;
    }
}
</style>

</head>
<body>
	<div class="w3-container">
	<div class="w3-contant">
	<section>
	<div class="w3-bar w3-green w3-margin-top">
        <center><h1>Login to Book Your Appointment</h1></center>
	</div>
	<aside class=" w3-margin-top w3-quarter ">

			</aside>
	<aside class=" w3-half w3-margin-top w3-border">
	<h2 class="w3-center">Login Form</h2>

	<form action="LoginServlet"method="get">
  <div class="container">
  
    <label><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="username" required>

    <label><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required>
        
    <button type="submit">Login</button>
    <input type="checkbox" > Remember me
  </div>

  <div class="container" style="background-color:#f1f1f1">
<a href="register.jsp"> <button type="button" class="cancelbtn">Register</button></a>
  <!--   <span class="psw"><a href="#" >Forgot password?</a></span>   -->
  </div>
</form>


<div class="w3-content w3-display-container">


</div>


	</section>
	<div class="w3-clear"></div>

<br>
<br>
<br>
<footer class=" w3-footer w3-red w3-center">copyrights@DOCTOR TIME2018</footer>
</div>
</div>
</body>
</html>