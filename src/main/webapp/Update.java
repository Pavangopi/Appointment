import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
		name="Update",
		urlPatterns=("/Update")
		)

public class Update extends HttpServlet {
	
	Login l = new Login();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		String lastname = request.getParameter("lastname");
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		l.e1.setProperty("FirstName", name);
		l.e1.setProperty("LastName", lastname);
		l.e1.setProperty("UserId", userid);
		l.e1.setProperty("Password", password);

		l.ds.put(l.e1);
		
//		pw.print("<script type=\"text/javascript\">");
//		pw.print("alert('Registered Successfully');");
//		pw.print("location='Login.html';");
//		pw.print("</script>");
		request.getRequestDispatcher("/Login").include(request, response);
		
	}

}
