import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class viewDetails extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
String viewBy  = request.getParameter("viewBy");
String var = request.getParameter("var");
        out.println("Welcome "+request.getParameter("viewBy")+" and var : "+var);
        boolean st =false;


	out.println("checkinggggg…."+viewBy.equals("All"));
      try{

	 //loading drivers for mysql
         Class.forName("com.mysql.jdbc.Driver");
         PreparedStatement ps;
 	 //creating connection with the database 
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","");
if(viewBy.equals("All"))
{
	out.println(" Inside IF" );
        ps =con.prepareStatement("select * from phoneDir");
}
else
{
	out.println(" Inside Else" );
        ps =con.prepareStatement("select * from phoneDir where "+viewBy+"=?");
        // ps.setString(1, viewBy);
         ps.setString(1,var);
}
out.print("<table width=50% border=1>");  
out.print("<caption>Your required Details Below : </caption>");  
         
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
out.print("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"</td><td>"+rs.getString(7)+"</td><td>"+rs.getString(8)+"</td><td>"+rs.getString(9)+"</td><td>"+rs.getString(10)+"</td><td>"+rs.getString(11)+"</td></tr>");  
                  
}

out.print("</table>");

out.print("<br/>");

out.print("<a href ='viewDetail.html'> Back </a> ");

      }catch(Exception e)
      {
          e.printStackTrace();
      }
	
      }  
}


