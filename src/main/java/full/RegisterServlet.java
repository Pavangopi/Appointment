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

public class RegisterServlet extends HttpServlet {  
	//Set<Account> acc = new HashSet<Account>();
    protected void doGet(HttpServletRequest request, HttpServletResponse response)  
                    throws ServletException, IOException {  
    	try{
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
    	response.setCharacterEncoding("UTF-8");
        String username=request.getParameter("username");  
        String password=request.getParameter("password"); 
        String confirmpassword=request.getParameter("confirmpassword"); 
        String gender=request.getParameter("gender");
        String address=request.getParameter("address");
        String contactnumber=request.getParameter("contactnumber");
        String email=request.getParameter("email");
        
 
    	
       
       
        	/*   try {
        	      InternetAddress emailAddr = new InternetAddress(email);
        	      emailAddr.validate();
        	   } catch (AddressException ex) {
               	out.println("<script type=\"text/javascript\">");
         	   out.println("alert('invalid email ');");
         	   out.println("</script>");
        	   }
        	   */
        DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
       
        Entity u = new Entity("Register", username);
        u.setProperty("username", username);
        u.setProperty("password", confirmpassword);
        u.setProperty("gender", gender);
        u.setProperty("address", address);
        u.setProperty("contactnumber", contactnumber);
        u.setProperty("useremail", email);
        
        ds.put(u);
       
        //request.getRequestDispatcher("login.jsp").include(request, response);

        
       // u.getKey().getName();
        //com.google.appengine.api.datastore.Key k = KeyFactory.createKey("User", name);
       // request.getRequestDispatcher("confirm.jsp").include(request, response);  
        if(password.equals(confirmpassword)){
        	//out.println("<center>");
            //out.println("<br/>registration successful");  
            //out.println("</center>");
        	out.println("<script type=\"text/javascript\">");
        	   out.println("alert('Registration successful');");
        	   out.println("</script>");
            request.getRequestDispatcher("login.jsp").include(request, response); 
        }

        else{   
        	out.println("<h3>Enter correct password</h3>");
        	request.getRequestDispatcher("register.jsp").forward(request, response);

        }  
    	
        out.close();
        }catch (Exception e) {
        	// TODO Auto-generated catch block
    	   PrintWriter out=response.getWriter(); 
    	   
        	out.println("<center>");
            out.println("Please  enter valided details");
            out.println("</center>");
        	System.out.println("I GOT EXCEPTION");
        	
        }
   

    }  
} 