import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class visitServlet extends HttpServlet {
  int i=1;
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        i++;
        PrintWriter out = response.getWriter();
        out.println(i);
           }  
}
