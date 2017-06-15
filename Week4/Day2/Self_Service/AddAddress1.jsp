<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "sql" uri = "http://java.sun.com/jsp/jstl/sql" %>

<%@ page language = "java" contentType = "text/html; charset = ISO-8859-1"
  import = "java.io.*"
  import = "java.sql.*"
  import = "java.util.*"
  import = "javax.sql.*"
  import = "java.sql.ResultSet"
  import = "java.sql.Statement"
  import = "java.sql.Connection"
  import = "java.sql.DriverManager"
  import = "java.sql.SQLException"
%>
<%
  Connection con = null;  
  PreparedStatement ps = null;
  ResultSet rs = null;
  Statement stmt = null;
  String name = request.getParameter("name");
  Integer id = 5;
%>



<!DOCTYPE html>
<html>
	<head>
	<meta http-equiv="content-type" content="text/html; charset=UTF-8">
	<title> I am in ADD-ADDRESS </title>

	</head>

<body>

 <%
  try {
  Class.forName("com.mysql.jdbc.Driver");
  con =DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root", "");
  ps = con.prepareStatement("update userDetail set address = ? where email = ?");
  ps.setString(1, "Guzi");
  ps.setString(2, "vis@gmail.com");
  ps.executeUpdate();
  %>
  <%
  } catch (IOException e) {
  throw new IOException("Can not display records.", e);
  } catch (ClassNotFoundException e) {
  throw new SQLException("JDBC Driver not found.", e);
  } finally {
  try {
  if(stmt != null){
  stmt.close();
  stmt = null;
  }
  if(ps != null) {
  ps.close();
  ps = null;
  }
  if(con != null) {
  con.close();
  con = null;
  }
  } catch (SQLException e) {}
  }
%> 

</body>
</html>


