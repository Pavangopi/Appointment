<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Home</title>
<link rel="stylesheet" type="text/css"
	href="https://www.w3schools.com/w3css/4/w3.css">
	<style>
.mySlides {display:none;}
</style>
	
	<script type = "text/javascript" >
        function preventBack() { window.history.forward(1); }
       // setTimeout("preventBack()", 0);
        window.onunload = function () { null };
        
        
</script>
</head>
<body>
	<div class="w3-container">
		<div class="w3-contant">
		<div class="w3-bar w3-red w3-margin-top w3-center">
	<h1>Book Your Appointment</h1>
	</div>
			<section>
			<div class="w3-bar w3-grey w3-margin-top">
				<a href="index.jsp" class="w3-bar-item w3-grey"><button class="w3-grey">Home</button></a> <a
					href="login.jsp" class="w3-bar-item w3-grey"><button class="w3-grey">Login</button></a> <a
					href="register.jsp" class="w3-bar-item w3-grey"><button class="w3-grey">Register</button></a>
	
    			<a href="receptionistlogin.jsp" class="w3-bar-item w3-grey"><button class="w3-grey">Receptionist Login</button></a>
					
					</div>
			<aside class="w3-purple w3-margin-top w3-quarter ">
			<center>
				<h3>Our Services</h3>
				<ul class="w3-ul w3-hoverable">
					<a  style="text-decoration:none;" href="https://www.medicinenet.com/acne/article.htm" >	<li>Treatment Of Acne/Pimples</li></a>
					<a  style="text-decoration:none;" href="https://dir.indiamart.com/chennai/weight-loss-treatment.html" ><li>Weight Loss Treatment</li></a>
					<a  style="text-decoration:none;" href="https://www.webmd.com/migraines-headaches/understanding-headache-treatment-medref#1" >	<li>Treatment of Headaches</li></a>
					<a  style="text-decoration:none;" href="https://www.mayoclinic.org/diseases-conditions/fever/in-depth/fever/art-20050997"> <li>Treatment of Fever</li></a>
					<a  style="text-decoration:none;" href="https://www.cancer.gov/about-cancer/treatment" ><li>Treatment of Cancer</li></a>
				</ul>
			</center>
			</aside> <aside class=" w3-half w3-margin-top w3-border">
			<h2 class="w3-center">An Easy Way For Doctor's Appointment</h2>

			<div class="w3-content w3-display-container">
	<center>	<!-- <img src="doctor.jpg" width="300" height="300" > -->
	
	
<div class="w3-content w3-section" style="max-width:500px">
  <img class="mySlides" src="doctor5.jpg" style="width:100%">
  <img class="mySlides" src="doctor4.jpg" style="width:100%">
  <img class="mySlides" src="doctor2.jpg" style="width:100%">
  <img class="mySlides" src="doctor3.jpg" style="width:100%">
</div>
	</center>
	<script>
var myIndex = 0;
carousel();

function carousel() {
    var i;
    var x = document.getElementsByClassName("mySlides");
    for (i = 0; i < x.length; i++) {
       x[i].style.display = "none";  
    }
    myIndex++;
    if (myIndex > x.length) {myIndex = 1}    
    x[myIndex-1].style.display = "block";  
    setTimeout(carousel, 2000); // Change image every 2 seconds
}
</script>
	
				<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; During
					an average doctor visit, more than half of all patients spend at
					least twenty minutes in the waiting room and another fifteen
					minutes (or more) in the exam room before seeing the doctor. When
					waiting times are too long, some patients may expect the doctor to
					reimburse them for their time, or at the very least, not expect
					them to pay for the visit.</p>
				<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; So
					here we came with a solution to meet the requirements of our
					patient,book your appointment during the doctor's visit hours and
					make your conslutaning the doctor smoother than before and we wish
					our patients an happy conslutaning.</p>
		<!-- 		<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; During
					an average doctor visit, more than half of all patients spend at
					least twenty minutes in the waiting room and another fifteen
					minutes (or more) in the exam room before seeing the doctor. When
					waiting times are too long, some patients may expect the doctor to
					reimburse them for their time, or at the very least, not expect
					them to pay for the visit.</p>

				<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; So
					here we came with a solution to meet the requirements of our
					patient,book your appointment during the doctor's visit hours and
					make your conslutaning the doctor smoother than before and we wish
					our patients an happy conslutaning.</p>  -->
			</div>


			</aside> <aside class=" w3-margin-top w3-green w3-quarter w3-border ">
			<center>
				<h3>Our Services</h3>
				<ul class="w3-ul w3-hoverable">
					<a  style="text-decoration:none;" href="https://www.rewardme.in/beauty/hair/article/fight-hair-fall-with-these-simple-steps" ><li>Treatment of Hair Fall</li></a>
					<a  style="text-decoration:none;" href= "http://www.allaboutvision.com/conditions/red-eyes.htm" ><li>Treatment of Red Eyes</li></a>
					<a  style="text-decoration:none;" href="https://www.spine-health.com/conditions/lower-back-pain/early-treatments-lower-back-pain" ><li>Back Pain Treatment</li></a>
					<a  style="text-decoration:none;" href="https://www.webmd.com/pain-management/guide/pain-management-treatment-care" ><li>Treatment of Pain</li></a>
					<a  style="text-decoration:none;" href="http://www.stylecraze.com/articles/home-remedies-to-control-hair-fall/#gref" ><li>Treatment of Hair Loss</li></a>
				</ul>
			</center>
			</aside> </section>
			<div class="w3-clear"></div>
<br>
<br>

			<footer class=" w3-footer w3-red w3-center">copyrights@DOCTOR
			TIME2018</footer>
		</div>
	</div>
</body>
</html>