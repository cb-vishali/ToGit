import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class EditDetails extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
	
	String email = (String)request.getSession().getAttribute("email");
	String fname = request.getParameter("fname");
	String lname = request.getParameter("lname");
        String password = request.getParameter("password");
	String address = request.getParameter("address");
        boolean st =false;
        try{

	 //loading drivers for mysql
         Class.forName("com.mysql.jdbc.Driver");

 	 //creating connection with the database 
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","");
         if(address!=""){
       	 PreparedStatement ps =con.prepareStatement("update userDetail set address = ?  where email=?");
         ps.setString(1,address);
         ps.setString(2,email);
         ps.executeUpdate();
         }
         if(fname!=""){
       	 PreparedStatement ps =con.prepareStatement("update userDetail set fname = ?  where email=?");
         ps.setString(1,fname);
         ps.setString(2,email);
         ps.executeUpdate();
         } 
         if(lname!=""){
       	 PreparedStatement ps =con.prepareStatement("update userDetail set lname = ?  where email=?");
         ps.setString(1,lname);
         ps.setString(2,email);
         ps.executeUpdate();
         } 
         if(password!=""){
       	 PreparedStatement ps =con.prepareStatement("update userDetail set password = ?  where email=?");
         ps.setString(1,password);
         ps.setString(2,email);
         ps.executeUpdate();
         } 
//out.print("<p id='Welcome'></p>");

//out.print("<button type='button' onclick='myFunction()'>Add address</button>");

//<p>(myFunction is stored in an external file called "myScript.js")</p>

//out.print("<script src='myScript.js'></script>");
//request.setAttribute("email", email); 
out.print("Your Details Updated Successfully !!");  

	out.print("</br></br>");
	out.print("<a href='index.html' class='button'>Back</a>");

      }catch(Exception e)
      {
          e.printStackTrace();
      }

      }  
}


