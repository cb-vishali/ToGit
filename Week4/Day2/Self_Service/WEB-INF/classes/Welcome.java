import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Welcome extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String email = request.getParameter("email");       
        out.println("Welcome "+request.getParameter("email"));
        boolean st =false;
      try{

	 //loading drivers for mysql
         Class.forName("com.mysql.jdbc.Driver");

 	 //creating connection with the database 
         Connection con=DriverManager.getConnection
                        ("jdbc:mysql://localhost:3306/sample","root","");
         PreparedStatement ps =con.prepareStatement
                             ("select * from userDetail where email=?");
         ps.setString(1, email);

out.print("<table width=50% border=1>");  
out.print("<caption>Your Details Below : </caption>");  
         
         ResultSet rs =ps.executeQuery();
       //  st = rs.next();
       //  out.println("rs.next -> " +rs.next()); 


ResultSetMetaData rsmd=rs.getMetaData();  
int total=rsmd.getColumnCount();  
out.print("<tr>");  
for(int i=1;i<=total;i++)  
{  
out.print("<th>"+rsmd.getColumnName(i)+"</th>");  
}  
  
out.print("</tr>");  
              
/* Printing result */  
  
while(rs.next())  
{  
out.print("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td></tr>");  
                  
}

out.print("</table>");

out.print("<br/>");
//out.print("<p id='Welcome'></p>");

//out.print("<button type='button' onclick='myFunction()'>Add address</button>");

//<p>(myFunction is stored in an external file called "myScript.js")</p>

//out.print("<script src='myScript.js'></script>");
//request.setAttribute("email", email);   
request.getSession().setAttribute("email",email);
out.print("<a href = 'AddAddress.jsp' > Add Address </a>  &nbsp; &nbsp; ");
out.print("<a href = 'login.html' > Logout </a>  &nbsp; &nbsp;  ");
out.print("<a href = 'DeActivate' > Deactivate Account </a> <br/>");

      }catch(Exception e)
      {
          e.printStackTrace();
      }

      }  
}


