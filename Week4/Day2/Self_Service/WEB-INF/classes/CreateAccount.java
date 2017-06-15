import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class CreateAccount extends HttpServlet {
   
       

	protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
	PrintWriter out = response.getWriter();
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String address = "";
        if(Validate.alreadyExists(email))
        {

          //Registered User		
            RequestDispatcher rs = request.getRequestDispatcher("index.html");
            rs.forward(request, response);
	}

        else
        {
//            out.println("Loading your details into Database"+" Name: "+fname+" "+lname+" Email: "+email+" Password: "+password);

try{
        
        //loading drivers for mysql
        Class.forName("com.mysql.jdbc.Driver");

//Checking Email is Valid or not
	
	//creating connection with the database 
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","");
          String sql = "insert into userDetail values ('"+fname+"','"+lname+"','"+email+"','"+password+"','"+address+"')";
          PreparedStatement ps=con.prepareStatement(sql);
          ps.executeUpdate(sql);        

}
        catch(Exception se)
        {
            se.printStackTrace();
        }

          RequestDispatcher rs = request.getRequestDispatcher("index.html");
	  rs.forward(request,response);
	}
    }  
}

