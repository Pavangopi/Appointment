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


public class ForgotServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 PrintWriter out=response.getWriter(); 
	    String user=request.getParameter("username");  
	    System.out.println(user);
	    String confirmpassword=request.getParameter("confirmpassword");
	 
	//out.println(username);
        //AppointmentServlet ob= new AppointmentServlet();
	    
        DatastoreService dataStore =DatastoreServiceFactory.getDatastoreService();
        Key loginkey = KeyFactory.createKey("Register", user);
        try {
        	Entity e = dataStore.get(loginkey);
        	String usernameDb=(String)e.getProperty("username");
        	System.out.println(usernameDb);
        	Filter currentUser = new FilterPredicate("username", FilterOperator.EQUAL, user);
            
            Query q = new Query("Register").setFilter(currentUser);
            PreparedQuery pq =  dataStore.prepare(q);
        	
        	if (usernameDb.equals(user)){
        		 e.setProperty("password", confirmpassword);
       
     
        	//System.out.println("user DB VALUE IS="+user);
        	System.out.println(confirmpassword);
        	//System.out.print("gender value is ="+gender);
        	

       
        request.getRequestDispatcher("login.jsp").include(request, response); 
        	
        	}
        }catch (EntityNotFoundException e) {
        	// TODO Auto-generated catch block
    	  
        	out.println("<center>");
            out.println(" error in entity try");
            out.println("</center>");
        	System.out.println("I GOT EXCEPTION");
        	
        }
        
      
       
        
	}

	

}