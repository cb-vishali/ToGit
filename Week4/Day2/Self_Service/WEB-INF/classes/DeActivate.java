import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class DeActivate extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
	
	String email = (String)request.getSession().getAttribute("email");
        boolean st =false;
        try{

	 //loading drivers for mysql
         Class.forName("com.mysql.jdbc.Driver");

 	 //creating connection with the database 
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","");
       	 PreparedStatement ps =con.prepareStatement("delete from userDetail where email=?");
         ps.setString(1,email);
         ps.executeUpdate();
//out.print("<p id='Welcome'></p>");

//out.print("<button type='button' onclick='myFunction()'>Add address</button>");

//<p>(myFunction is stored in an external file called "myScript.js")</p>

//out.print("<script src='myScript.js'></script>");
//request.setAttribute("email", email); 
out.print("Your Account is De-Activated !!");  

	out.print("</br></br>");
	out.print("<a href='index.html' class='button'>Back</a>");

      }catch(Exception e)
      {
          e.printStackTrace();
      }

      }  
}


