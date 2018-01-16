<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Appoinment</title>

	<script type = "text/javascript" >
        function preventBack() { window.history.forward(1); }
        setTimeout("preventBack()", 0);
        window.onunload = function () { null };
</script>
	<link rel="stylesheet" type="text/css" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>
	<div class="w3-container">
	<div class="w3-contant">
	<section>
	<div class="w3-bar w3-green w3-margin-top">
	<a href="LogoutServlet"><p align="right">
  <input type="button" value="logout" onkeypress="return preventBack()"/>
</p></a>
        <center><h1>Book Your Appoinment </h1>
         </center>
	</div>
	<aside class=" w3-margin-top w3-quarter ">

			</aside>
	<aside class=" w3-half w3-margin-top w3-border">


<div class="w3-content w3-display-container">
    <br><br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    


                    <p align="center">
                       <a href="appointment.jsp"> <input class="w3-green" type="submit" value="Book Appoinment" name="book"></a>
                       <br>
                    
                    <p align="center">
                       <a href="update.jsp"> <input class="w3-green" type="submit" value="Update Appoinment Details" name="book"></a>
                    
                       <br>
                       <p align="center">
                       <a href="Userdisplay.jsp"> <input class="w3-green" type="submit" value="Appoinment Details" name="book"></a>
                    
                       <br>
                    
                          <p align="center">
                       <a href="delete.jsp"> <input class="w3-green" type="submit" value=" Delete Appoinment" name="book"></a>
                    
                       <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    
                
    
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