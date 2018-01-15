<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Update Appoinment form</title>
	<link rel="stylesheet" type="text/css" href="https://www.w3schools.com/w3css/4/w3.css">

    <script type="text/javascript">
      
 
        function isNumberKey(evt) {
            var charCode = (evt.which) ? evt.which : event.keyCode;
            if (charCode != 46 && charCode > 31 &&
                (charCode < 48 || charCode > 57)) {
                alert("Enter a valied phone number");
                return false;
            }
            return true;
        }

        function isNumber(evt) {
            var charCode = (evt.which) ? evt.which : event.keyCode;
            if (charCode != 46 && charCode > 31 &&
                (charCode < 48 || charCode > 57)) {
                alert("Enter a valid Age");
                return false;
            }
            return true;
        }
 function checkEmail() {
		//alert("hello");
		var email = document.getElementById('email').value;
		var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
		if (!filter.test(email)) {
			alert('Please provide a valid email address');
			return false;
		}
		else{
			//alert("hai");
			return true;
		}
		
	}


     function preventBack() { window.history.forward(1); }
     setTimeout("preventBack()", 0);
     window.onunload = function () { null };

     

        //-->
    </script>
</head>
<body>
	<div class="w3-container">
	<div class="w3-contant">
	<section>
	<div class="w3-bar w3-green w3-margin-top">
		
        <center><h1>Update Your Appointment Details</h1></center>
        	<a href="LogoutServlet"><p align="right">
  <input type="button" value="logout" onkeypress="return preventBack()"/>
</p></a>
	</div>
	<aside class=" w3-margin-top w3-quarter ">

			</aside>
	<aside class=" w3-half w3-margin-top w3-border">
	<h2 class="w3-center">Appointment update Form</h2>

<div class="w3-content w3-display-container">

<form  action="AppointmentServlet" onsubmit="return checkEmail(); " method="get">
        <table align="center" width=40% width="100%" cellspacing="2" cellpadding="2" border="5">
            <tr>
                <td colspan="2" align="center"><b>Fill Details</b></td>
 
            </tr>
            <tr>
                <td align="left" valign="top" width="41%">UserName<span style="color:red">*</span></td>
 
                <td width="57%"><input type="text" value="${sessionScope.username }" name="patientname" placeholder="Enter UserName" size="24" required></td>
            </tr>
              <tr>
                <td align="left" valign="top" width="41%">Doctor<span style="color:red">*</span></td>
 
                <td width="57%"><select name="doctor"  value="${sessionScope.doctor }">
                                <option value="Default">Default</option>
                                <option value="Dr.Arun">Dr.Arun</option>
                                <option value="Dr.Divya">Dr.Divya</option>
                                <option value="Dr.Sriram">Dr.Sriram</option>
                                <option value="Dr.vasu">Dr.vasu</option>
                                </select>
                </td>
                  <tr>
                <td align="left" valign="top" width="41%">Select Date<span style="color:red">*</span></td>
 
                <td width="57%"><input type="date" value="${sessionScope.date }" name="date" size="24" required></td>
            </tr>
            <tr>
                            <td align="left" valign="top" width="41%">Time Slot<span style="color:red">*</span></td>
 
                <td width="57%"><select name="time" value="${sessionScope.time }">
                                <option value="Default">Default</option>
                                <option value="10am">10am</option>
                                <option value="11am">11am</option>
                                <option value="11am">12pm</option>
                                <option value="1pm">1pm</option>
                                <option value="3pm">3pm</option>
                                <option value="4pm">4pm</option>
                                <option value="5pm">5pm</option>
                                <option value="7pm">7pm</option>
                                <option value="8pm">8pm</option>
                                <option value="9pm">9pm</option>
                                </select>
                </td>
            </tr>
             <tr>
                <td align="left" valign="top" width="41%">Gender<span style="color:red">*</span></td>
 
                <td width="57%"><select name="gender" value="${sessionScope.gender }" >
                                <option value="Default">Default</option>
                                <option value="Male">Male</option>
                                <option value="Female">Female</option>
                                
                                </select>
                </td>
            </tr>
            <tr>
 
            <td align="left" valign="top" width="41%">Age<span style="color:red">*</span></td>
            <td width="57%">
                <input type="text" value="${sessionScope.age }" onkeypress="return isNumber(event)" name="age" placeholder="Enter Patient Age" size="24" required></td>
            </tr>
            
           <tr>
 
            <td align="left" valign="top" width="41%">Contact Number<span style="color:red">*</span></td>
            <td width="57%">
                <input type="text" value="${sessionScope.contactnumber }" onkeypress="return isNumberKey(event)" name="contactnumber" placeholder="Enter Contactnumber" size="24" required></td>
            </tr>
            
 
            <tr>
                <td align="left" valign="top" width="41%">Email<span style="color:red">*</span></td>
                <td width="57%">
                    <input type="text" value="${sessionScope.email }" name="email" size="24" id="email"placeholder="Enter email" required></td>
            </tr>
 
            <tr>
                <td colspan="2">
                    <p align="center">
                        <input type="submit" value="  Submit" name="B4">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <input type="reset" value="  Reset All   " name="B5"></td>
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