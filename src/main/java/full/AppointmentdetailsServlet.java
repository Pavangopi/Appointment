package full;

import java.io.IOException;  
import java.io.PrintWriter;
import java.util.*;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;  
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

public class AppointmentdetailsServlet extends HttpServlet {  
	//Set<Account> acc = new HashSet<Account>();
    protected void doGet(HttpServletRequest request, HttpServletResponse response)  
                    throws ServletException, IOException {  
    	try{
   
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
    	response.setCharacterEncoding("UTF-8");
        String patientname=request.getParameter("patientname");  
        
 
                
 
        DatastoreService ds =DatastoreServiceFactory.getDatastoreService();
        Key loginkey = KeyFactory.createKey("Register", patientname);
       
        try {
       
        	Entity e = ds.get(loginkey);
        	String usernameDb=(String)e.getProperty("username");
            System.out.println("user ="+usernameDb);
            
            //DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
        	Filter loguser = new FilterPredicate("loguser", FilterOperator.EQUAL, usernameDb);
        	//Filter requiredService = new FilterPredicate("ServiceName", FilterOperator.EQUAL, serviceName);
        	//CompositeFilter filter = CompositeFilterOperator.and(currentUser, requiredService);
        	Query q = new Query("Appointment").setFilter(loguser);
        	PreparedQuery pq = ds.prepare(q);
        	for (Entity result : pq.asIterable()) {
        		String patient = (String) result.getProperty("patientname");
        		  String doctor = (String) result.getProperty("doctor");
        		  String date = (String) result.getProperty("date");
        		  String time = (String) result.getProperty("time");
        		  String age = (String) result.getProperty("age");
        		  String gender = (String) result.getProperty("gender");
        		  
        		

        		  out.println(patient);
        		  out.println(doctor);
        		  out.println(date);
        		  out.println(time);
        		  out.println(age);
        		  out.println(gender);
        		  
     
        	}
                  

        	 

 
       }catch (EntityNotFoundException e) {
        	// TODO Auto-generated catch block
        	out.println("<center>");
            out.println(" error in entity try");
            out.println("</center>");
        	System.out.println("I GOT EXCEPTION");
        	
        }
    	
        out.close();
        }catch (Exception e) {
        	// TODO Auto-generated catch block
    	   PrintWriter out1=response.getWriter(); 
    	   
        	out1.println("<center>");
            out1.println("error in main try");
            out1.println("</center>");
        	System.out.println("I GOT EXCEPTION");
        	
        }
   

    }  
} 