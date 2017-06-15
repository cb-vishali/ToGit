import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class De extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String email = request.getParameter("email");       
        out.println("Welcome "+email);
        boolean st =false;
      try{

	 //loading drivers for mysql
         Class.forName("com.mysql.jdbc.Driver");

 	 //creating connection with the database 
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","");
         PreparedStatement ps =con.prepareStatement("Delete * from userDetail where email=?");
         ps.setString(1, email);
         ResultSet rs = ps.executeQuery();	 
         ps =con.prepareStatement("select * from userDetail where email=?");
         ps.setString(1, email);
         rs =ps.executeQuery();
         st = rs.next();
        out.println("rs.next -> " +rs.next()); 
  if(st)
out.print("<caption>Your Account is De-Activated Successfully!!! </caption>");  
  else
out.print("Something went wrong!!"); 

	 out.print("<br/>");


      }catch(Exception e)
      {
          e.printStackTrace();
      }

      }  
}

