<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
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
 
        //-->
    </script>
</head>
<body>
	<div class="w3-container">
	<div class="w3-contant">
	<section>
	<div class="w3-bar w3-green w3-margin-top">
        <center><h1>Fill Your Registration Details</h1></center>
	</div>
	<aside class=" w3-margin-top w3-quarter ">

			</aside>
	<aside class=" w3-half w3-margin-top w3-border">
	<h2 class="w3-center">Registration Form</h2>

<div class="w3-content w3-display-container">

<form  action="RegisterServlet" onsubmit="return checkEmail(); " method="get">
        <table align="center" width=40% width="100%" cellspacing="2" cellpadding="2" border="5">
            <tr>
                <td colspan="2" align="center"><b>Fill Details</b></td>
 
            </tr>
            <tr>
                <td align="left" valign="top" width="41%">UserName<span style="color:red">*</span></td>
 
                <td width="57%"><input type="text" value="" name="username"placeholder="Enter Username" size="24" required></td>
            </tr>
            <tr>
                <td align="left" valign="top" width="41%">Password<span style="color:red">*</span></td>
                <td width="57%">
                    <input type="Password" value="" name="password" placeholder="Enter Password" pattern=".{8,}"  size="24" required title="8 characters minimum"></td>
            </tr>
                        <tr>
                <td align="left" valign="top" width="41%">ConfirmPassword<span style="color:red">*</span></td>
                <td width="57%">
                    <input type="Password" value="" name="confirmpassword" placeholder="Confirmpasswoed" size="24" required></td>
            </tr>
                        <tr>
                <td align="left" valign="top" width="41%">Gender<span style="color:red">*</span></td>
 
                <td width="57%"><select name="gender" >
                                <option value="Default">Default</option>
                                <option value="Male">Male</option>
                                <option value="Female">Female</option>
                                
                                </select>
                </td>
            </tr>
            <tr>
                <td align="left" valign="top" width="41%">Address<span style="color:red">*</span></td>
 
                <td width="57%"><textarea rows="4" maxlen="200" name="address" cols="20" placeholder="Enter Address" required></textarea></td>
            </tr> <tr>
 
            <td align="left" valign="top" width="41%">Contact Number<span style="color:red">*</span></td>
            <td width="57%">
                <input type="text" value="" pattern="[1-9]{1}[0-9]{9}" onkeypress="return isNumberKey(event)" name="contactnumber" placeholder="Enter your 10 digits mobile number"size="24" required></td>
            </tr>
            
 
            <tr>
                <td align="left" valign="top" width="41%">Email<span style="color:red">*</span></td>
                <td width="57%">
                    <input type="text"  name="email" size="24" id="email" placeholder="Enter email"required></td>
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