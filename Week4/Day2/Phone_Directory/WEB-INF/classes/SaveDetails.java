import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class SaveDetails extends HttpServlet {
   
       

	protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
	PrintWriter out = response.getWriter();
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String address = request.getParameter("address");
        String next_address = request.getParameter("next-address");
        String city = request.getParameter("city") ;
	String state = request.getParameter("state");
	String zip = request.getParameter("zip");
	String country = request.getParameter("country");
	String work = request.getParameter("work");
	String mobile = request.getParameter("mobile");
	String home = request.getParameter("home");
            out.println("Hi "+fname+" "+lname+" .. Your info is saved Successfully !! ");

try{
        
        //loading drivers for mysql
        Class.forName("com.mysql.jdbc.Driver");

//Checking Email is Valid or not
	
	//creating connection with the database 
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","");
          String sql = "insert into phoneDir values ('"+fname+"','"+lname+"','"+address+"','"+next_address+"','"+city+"','"+state+"' , '"+zip+"' , '"+country+"' , '"+work+"' , '"+mobile+"' , '"+home+"' )";
          PreparedStatement ps=con.prepareStatement(sql);
          ps.executeUpdate(sql);        

}
        catch(Exception se)
        {
            se.printStackTrace();
        }

out.print("Your Details Updated Successfully !!");  

	out.print("</br></br>");
	out.print("<a href='viewDetail.html' class='button'>Back</a>");

    }  
}

