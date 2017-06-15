import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class AddAddress extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
	
	String email = (String)request.getSession().getAttribute("email");
	String address = request.getParameter("address");
       // out.println("Welcome add "+email+" and address is "+address);
        boolean st =false;
      try{

	 //loading drivers for mysql
         Class.forName("com.mysql.jdbc.Driver");

 	 //creating connection with the database 
         Connection con=DriverManager.getConnection
                        ("jdbc:mysql://localhost:3306/sample","root","");
         PreparedStatement ps =con.prepareStatement
                             ("update userDetail set address = ?  where email=?");
         ps.setString(1,address);
         ps.setString(2,email);
         
         ps.executeUpdate();

//out.print("<p id='Welcome'></p>");

//out.print("<button type='button' onclick='myFunction()'>Add address</button>");

//<p>(myFunction is stored in an external file called "myScript.js")</p>

//out.print("<script src='myScript.js'></script>");
//request.setAttribute("email", email); 
out.print("</br></br></br>"); 
out.print("<h2> Your Address added successfully !!! </h2>");
out.print("</br></br>");
out.print("<a href = 'EditDetails.jsp' > Edit Details </a>  &nbsp; &nbsp; ");
out.print("<a href = 'login.html' > Logout </a>  &nbsp; &nbsp;  ");
out.print("<a href = 'DeActivate' > Deactivate Account </a> <br/>");

      }catch(Exception e)
      {
          e.printStackTrace();
      }

      }  
}


