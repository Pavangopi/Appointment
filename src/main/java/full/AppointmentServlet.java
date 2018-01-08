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

public class AppointmentServlet extends HttpServlet {  
	//Set<Account> acc = new HashSet<Account>();
    protected void doGet(HttpServletRequest request, HttpServletResponse response)  
                    throws ServletException, IOException {  
    	try{
   
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
    	response.setCharacterEncoding("UTF-8");
        String patientname=request.getParameter("patientname");  
        String doctor=request.getParameter("doctor"); 
        String time=request.getParameter("time"); 
        String age=request.getParameter("age");
        String gender=request.getParameter("gender");
        String date=request.getParameter("date");
        String contactnumber=request.getParameter("contactnumber");
        String email=request.getParameter("email");
        String username=request.getParameter("username");
 
                 System.out.println(username);
 
        DatastoreService dataStore =DatastoreServiceFactory.getDatastoreService();
        Key loginkey = KeyFactory.createKey("Register", patientname);
        try {
        	  System.out.println(username);
        	Entity e = dataStore.get(loginkey);
        	String usernameDb=(String)e.getProperty("username");
            System.out.println("user DB VALUE IS="+usernameDb);
        	


       
        DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
       
        Entity u = new Entity("Appointment", patientname);
        u.setProperty("patientname", patientname);
        u.setProperty("loguser", usernameDb);
        u.setProperty("doctor", doctor);
        u.setProperty("timeslot", time);
        u.setProperty("gender", gender);
        u.setProperty("age", age);
        u.setProperty("date", date);
        u.setProperty("contactnumber", contactnumber);
        u.setProperty("useremail", email);
        
        
        ds.put(u);
       
        //request.getRequestDispatcher("login.jsp").include(request, response);

        
       // u.getKey().getName();
        //com.google.appengine.api.datastore.Key k = KeyFactory.createKey("User", name);
       // request.getRequestDispatcher("confirm.jsp").include(request, response);  
        if(patientname!=null){
        	//out.println("<center>");
            //out.println("<br/>appoinment booked");  
            //out.println("</center>");
        	out.println("<script type=\"text/javascript\">");
        	   out.println("alert('Appointment Booked');");
        	   out.println("</script>");
            request.getRequestDispatcher("/AppointmentdetailsServlet").include(request, response); 
            //request.getRequestDispatcher("appointmentdetails.jsp").include(request, response); 
       }

        else{   
        	out.println("<h3>Please check the details</h3>");
        	request.getRequestDispatcher("appointment.jsp").forward(request, response);

        }  
       }catch (EntityNotFoundException e) {
        	// TODO Auto-generated catch block
        	out.println("<center>");
            out.println(" please check your details");
            out.println("</center>");
        	System.out.println("I GOT EXCEPTION");
        	
        }
    	
        out.close();
        }catch (Exception e) {
        	// TODO Auto-generated catch block
    	   PrintWriter out1=response.getWriter(); 
    	   
        	out1.println("<center>");
            out1.println("Please  enter valided details");
            out1.println("</center>");
        	System.out.println("I GOT EXCEPTION");
        	
        }
   

    }  
} 