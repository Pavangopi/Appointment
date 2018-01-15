package full;

import java.io.IOException;
import java.io.PrintWriter;
import full.LoginServlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.PreparedQuery.TooManyResultsException;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Query.CompositeFilter;
import com.google.appengine.api.datastore.Query.CompositeFilterOperator;
import com.google.appengine.api.datastore.Query.Filter;
import com.google.appengine.api.datastore.Query.FilterOperator;
import com.google.appengine.api.datastore.Query.FilterPredicate;
import com.google.appengine.api.datastore.Query.SortDirection;


public class BookedServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 PrintWriter out=response.getWriter(); 
	    String user=request.getParameter("username");  
	 
	//out.println(username);
        //AppointmentServlet ob= new AppointmentServlet();
	 
     out.println("<html"+" "
     		+ "<head>"
     		+ "<meta http-equiv='Content-Type' content='text/html; charset=ISO-8859-1'>"
     		+ "<title>"+ "Appoinment" +"</title>"
     		+ "<link rel='stylesheet' type='text/css' href='https://www.w3schools.com/w3css/4/w3.css'>"
     		+ "	<script type = 'text/javascript' >"
     		+ "function preventBack() { window.history.forward(1); }"
     		+ "setTimeout('preventBack()', 0);"
     		+ " window.onunload = function () { null };"
     		+ "</script>"
     		+ "</head>"
     		+ "<body>"
     		+ "<div class='w3-container'"
     		+ "<div class='w3-contant'>"
     		+ "<section>"
     		+ "<div class='w3-bar w3-green w3-margin-top'>"+
     		"<a href='index.jsp'><p align='right'>"
     		+"<input type='button' value='logout' onkeypress='return preventBack()'/>"
     		+"</p>"
     		+"</a>"
     		+" <center>"+"<h1>"+" Appointment Booked Details"+"</h1>"+" </center>"
       
             +"</div>"
         
);
        
        DatastoreService ds =DatastoreServiceFactory.getDatastoreService();
        
        
        
        Query q = new Query("Appointment");
        PreparedQuery pq =  ds.prepare(q);

        for(Entity e1 : pq.asIterable()) {
       String patient= (String) e1.getProperty("patientname");
      
      
      
       Key loginkey = new KeyFactory.Builder("Appointment", patient).getKey();
      
       //DatastoreService t1 = DatastoreServiceFactory.getDatastoreService();
       
        try {
       
        	
        	Entity e = ds.get(loginkey);
        	System.out.println(e);
        	 String loguser= (String) e.getProperty("loguser");
        	String patient1=(String)e.getProperty("patientname");
        	String doctor=(String)e.getProperty("doctor");
        	String date=(String)e.getProperty("date");
        	String time=(String)e.getProperty("timeslot");
        	String age=(String)e.getProperty("age");
        	String gender=(String)e.getProperty("gender");
            System.out.println("user ="+patient);
            
           /* HttpSession session=request.getSession();
            session.setAttribute("patient", patient);
            session.setAttribute("doctor", doctor);
            session.setAttribute("time", time);
            session.setAttribute("date", date);
            session.setAttribute("age", age);
            session.setAttribute("gender", gender);
            response.sendRedirect("Booked.jsp");
            
            request.getRequestDispatcher("Booked.jsp").include(request, response); */

out.println(    "<aside class=' w3-margin-top w3-quarter '>"
        +"</aside>"
		
		
		+"<aside class='w3-half w3-margin-top w3-border'>"
		+"<div class='w3-content w3-display-container'>"
		+"<table align='center' width='40%' width='100%' cellspacing='2' cellpadding='2' border='5'>"
		+" <tr>"
		+"<td colspan='2' align='center'>"+"<b>"+"Appointment Details of "+patient1+"</b>"+"</td>"+"  </tr>"
		+"  <tr>"+"  <td align='left' valign='top' width='41%'>"+"User Name"+"<span style='color:red'>"+"*"+"</span>"+"</td>"
		+" <td width='57%'>"+patient1+"</td>"
		+"</tr>"
		+"<tr>"+"  <td align='left' valign='top' width='41%'>"+"Doctor"+"<span style='color:red'>"+"*"+"</span>"+"</td>"
		+"<td width='57%'>"+doctor+"</td>"
		+"</tr>"
		+"<tr>"+"<td align='left' valign='top' width='41%''>"+"Date"+"<span style='color:red'>"+"*"+"</span>"+"</td>"
		+"   <td width='57%''>"+date+" </td>"+"</tr>"
		+"<tr>"+"<td align='left' valign='top' width='41%'>"+"Time"+"<span style='color:red'>"+"*"+"</span>"+"</td>"
		+" <td width='57'>"+time+" </td>"
		+" </tr>"
		+"<tr>"+"<td align='left' valign='top' width='41%'>"+"Age"+"<span style='color:red'>"+"*"+"</span>"+" </td>"
				+ " <td width='57%'>"+age+" </td>"
				+ " </tr>"+""
						+ " <tr>"
						+ " <td align='left' valign='top' width='41%'>"+"Gender"+"<span style='color:red'>"+"*"+"</span>"+"</td>"
						+ "<td width='57%'>"+gender+" </td>"
						+"</tr>"
						+ " </table>"
						+ "</div>"
						+ "</section>"
						+"<div class='w3-clear'>"
		        		+ "</div>");
       
        	/*out.println(patient1);
        	 out.println(doctor);
        	 out.println(date);
        	 out.println(time);
        	 out.println(age);
        	 out.println(gender); */

         
       }catch (EntityNotFoundException e) {
        	// TODO Auto-generated catch block
    	  
        	out.println("<center>");
            out.println(" error in entity try");
            out.println("</center>");
        	System.out.println("I GOT EXCEPTION");
        	
        }
       
        }
        out.println("</div>"
        		+ "<br>"
        		+ "<br>"
        		+ "<br>"
        		+ "<footer class='w3-footer w3-red w3-center' >"+"copyrights@DOCTOR TIME2018"+"</footer>"
        
        		+ "</div>"
        		+ "</body>"
        		+ "</html>");

	}

	

}