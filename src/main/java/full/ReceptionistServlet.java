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
public class ReceptionistServlet extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)  
                    throws ServletException, IOException {  
    	try{
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
       
        String username=request.getParameter("username");  
        String password=request.getParameter("password"); 

        //String confirmpassword=request.getParameter("password"); 
        
        	

                	
      	/* 
          sessi.setAttribute("username", username);
          response.sendRedirect("/BookeddetailsServlet");
                                                           */
        
        if(username.equals("admin")&&password.equals("admin")){  
       
        out.println("<center color-red>");
        out.println("<br/><h1>Welcome to Doctor's Time </h1><br/>");  
       out.println("</center>");
       
     
        request.getRequestDispatcher("/BookedServlet").include(request, response);  
        //ImageIO.read(new File("image/newimage.jpg"));
        //request.getRequestDispatcher("newimage.jpg").include(request, response);  
        }  
        else{  
        	//out.println("<center>");
           // out.println("<br/>Sorry, username or password error!");  
           // out.println("</center>");
        	out.println("<script type=\"text/javascript\">");
        	   out.println("alert('Username or password incorrect');");
        	   out.println("</script>");
            request.getRequestDispatcher("receptionistlogin.jsp").include(request, response);  
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