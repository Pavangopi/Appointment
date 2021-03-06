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


public class UserServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 PrintWriter out=response.getWriter(); 
	    String user=request.getParameter("patientname");  
	 
	//out.println(username);
        //AppointmentServlet ob= new AppointmentServlet();
	    out.println("<html"+" "
	     		+ "<head>"
	     		+ "<meta http-equiv='Content-Type' content='text/html; charset=ISO-8859-1'>"
	     		+ "<title>"+ "Appoinment" +"</title>"
	     		+ "<link rel='stylesheet' type='text/css' href='https://www.w3schools.com/w3css/4/w3.css'>"
	     		+"<script type = 'text/javascript' >"
	     		+"function preventBack() { window.history.forward(1); } window.onunload = function () { null };"
	     		+"</script>"
	     		+ "</head>"
	     		+ "<body>"
	     		+ "<div class='w3-container'"
	     		+ "<div class='w3-contant'>"
	     		+ "<section>"
	     		+ "<div class='w3-bar w3-green w3-margin-top w3-center'>"+
	     		"<a href='index.jsp'><p align='right'>"
	     		+"<input type='button' value='logout' onkeypress='return preventBack()'/>"
	     		+"</p>"
	     		+"</a>");
	   /* out.println("<h3>"+"<div style='background-color: green'>"
	    		+ "<a href='LogoutServlet'>"+"<p align='right'>"+"<input type='button' value='logout' />"+"</p>"+"</a>"+"</div>"+"</h3>");*/
            
            
        DatastoreService ds =DatastoreServiceFactory.getDatastoreService();
        
        Filter currentUser = new FilterPredicate("patientname", FilterOperator.EQUAL, user);
        
        Query q = new Query("Appointment").setFilter(currentUser);
        PreparedQuery pq =  ds.prepare(q);

        for(Entity e1 : pq.asIterable()) {
       String patient= (String) e1.getProperty("patientname");
      
     
       Key loginkey = new KeyFactory.Builder("Appointment", patient).getKey();
      
       //DatastoreService t1 = DatastoreServiceFactory.getDatastoreService();
       
        try {
       
        	
        	Entity e = ds.get(loginkey);
        	if(user.equals(patient)){
        	System.out.println(e);
        	 String loguser= (String) e.getProperty("loguser");
        	String patient1=(String)e.getProperty("patientname");
        	String doctor = (String)e.getProperty("doctor");
  		  String date = (String)e.getProperty("date");
  		  String time = (String)e.getProperty("timeslot");
  		  String age = (String)e.getProperty("age");
  		  String gender = (String)e.getProperty("gender");
  		  
  		  HttpSession session=request.getSession();
            session.setAttribute("patient", patient1);
            session.setAttribute("doctor", doctor);
            session.setAttribute("time", time);
            session.setAttribute("date", date);
            session.setAttribute("age", age);
            session.setAttribute("gender", gender);
            
        
           // response.sendRedirect("update.jsp");
            response.sendRedirect("appointmentdetails.jsp");
          
       
        	request.getRequestDispatcher("appointmentdetails.jsp").include(request, response); 
        	}
        	else{
        		out.println("<h1>"+"You Don't have any appointment to display");
        		break;
        	}
        }catch (EntityNotFoundException e) {
        	// TODO Auto-generated catch block
    	  
        	out.println("<center>");
            out.println(" error in entity try");
            out.println("</center>");
        	System.out.println("I GOT EXCEPTION");
        	
        }
        }
      
        if(user!=null){
        	out.println("<h1>"+"Appointment record not found for "+user+"</h1>"	+"</div>"+ "</body>"
            		+ "</html>");
        }
       
        
        
	}

	

}