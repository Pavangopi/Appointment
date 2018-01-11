<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Appoinment</title>
	<link rel="stylesheet" type="text/css" href="https://www.w3schools.com/w3css/4/w3.css">

	<script type = "text/javascript" >
        function preventBack() { window.history.forward(1); }
        setTimeout("preventBack()", 0);
        window.onunload = function () { null };
        
</script>
</head>
<body>
	<div class="w3-container">
	<div class="w3-contant">
	<section>
	<div class="w3-bar w3-green w3-margin-top">
			<a href="index.jsp"><p align="right">
  <input type="button" value="logout" onkeypress="return preventBack()"/>
</p></a>
        <center><h1> Appointment Booked Successfully  </h1></center>



	</div>
	<aside class=" w3-margin-top w3-quarter ">

			</aside>
	<aside class=" w3-half w3-margin-top w3-border">


<div class="w3-content w3-display-container">
    <form name="emp" action="AppoinmentdetailsServlet" onsubmit="return checkEmail(); " method="get">
        <table align="center" width=40% width="100%" cellspacing="2" cellpadding="2" border="5">
            <tr>
                <td colspan="2" align="center"><b>Appointment Details</b></td>
 
            </tr>
            <tr>
                <td align="left" valign="top" width="41%">User Name<span style="color:red">*</span></td>
 
                <td width="57%">${sessionScope.patient }</td>
            </tr>
            <tr>
                <td align="left" valign="top" width="41%">Doctor<span style="color:red">*</span></td>
                <td width="57%">
                    ${sessionScope.doctor }</td>
            </tr>
                        <tr>
                <td align="left" valign="top" width="41%">Date<span style="color:red">*</span></td>
                <td width="57%">
                   ${sessionScope.date }</td>
            </tr>
            <tr>
            <tr>
                <td align="left" valign="top" width="41%">Time<span style="color:red">*</span></td>
                <td width="57%">
                    ${sessionScope.time }</td>
            </tr>
 
            
            <tr>
                <td align="left" valign="top" width="41%">Age<span style="color:red">*</span></td>
                <td width="57%">
                    ${sessionScope.age }</td>
            </tr>
 
            <tr>
                <td align="left" valign="top" width="41%">Gender<span style="color:red">*</span></td>
                <td width="57%">
                    ${sessionScope.gender }</td>
            </tr>
 
           
 
        </table>
    </form>

                
    
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