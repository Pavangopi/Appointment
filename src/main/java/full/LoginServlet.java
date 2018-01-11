package full;

import java.io.File;
import java.io.IOException;  
import java.io.PrintWriter;

import javax.imageio.ImageIO;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
public class LoginServlet extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)  
                    throws ServletException, IOException {  
    	try{
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
       
        String username=request.getParameter("username");  
        String password=request.getParameter("password"); 

        //String confirmpassword=request.getParameter("password"); 
        DatastoreService dataStore =DatastoreServiceFactory.getDatastoreService();
        Key loginkey = KeyFactory.createKey("Register", username);
        try {
        	Entity e = dataStore.get(loginkey);
        	String usernameDb=(String)e.getProperty("username");
        	String passwordDb=(String)e.getProperty("password");
        	String gender=(String)e.getProperty("gender");
        	System.out.println("PASSWORD DB VALUE IS="+passwordDb);
        	System.out.println("user DB VALUE IS="+username);
        	//System.out.print("gender value is ="+gender);
        	

                	
      	/* 
          sessi.setAttribute("username", username);
          response.sendRedirect("/BookeddetailsServlet");
                                                           */
        
        if(username.equals(usernameDb)&&password.equals(passwordDb)){  
       
        out.println("<center color-red>");
        out.println("<br/><h1>Welcome to Doctor's Time "+username+"</h1><br/>");  
       out.println("</center>");
       HttpSession session=request.getSession();  
        session.setAttribute("username",username);  
       //request.getRequestDispatcher("/BookedServlet").forward(request, response);  
        request.getRequestDispatcher("loginsuccess.jsp").include(request, response);  
        //ImageIO.read(new File("image/newimage.jpg"));
        //request.getRequestDispatcher("newimage.jpg").include(request, response);  
        }  
        else{  
        	//out.println("<center>");
           // out.println("<br/>Sorry, username or password error!");  
           // out.println("</center>");
        	out.println("<script type=\"text/javascript\">");
        	   out.println("alert('User or password incorrect');");
        	   out.println("</script>");
            request.getRequestDispatcher("login.jsp").include(request, response);  
        }  
        }catch (EntityNotFoundException e) {
        	// TODO Auto-generated catch block
        	out.println("<center>");
            out.println("your not registered and please check your details");
            out.println("</center>");
        	System.out.println("I GOT EXCEPTION");
        	
        }
        out.close();  
        }catch (Exception e) {
        	// TODO Auto-generated catch block
    	   PrintWriter out=response.getWriter(); 
    	   
        	out.println("<center>");
            out.println("Please  enter valided data");
            out.println("</center>");
        	System.out.println("I GOT EXCEPTION");
        	
        }
   
    }  
}  