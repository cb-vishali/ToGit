import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Login extends HttpServlet {
 
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String email = request.getParameter("email");
        String password = request.getParameter("password");
   out.println(email+" "+password);     
        boolean val=Validate.checkUser(email, password);
	if(val)
        {
	   out.println("Login succccceesss");
           RequestDispatcher rs = request.getRequestDispatcher("Welcome");
           rs.forward(request, response);
          // out.println("Wow..Login success");
	  // response.sendRedirect("Welcome");
        }
        else
        {
	   out.println("OOPs..Wrong Credentials");	
           RequestDispatcher rs = request.getRequestDispatcher("index.html");
           rs.include(request, response);
	   out.println();
        }
    }  
}
