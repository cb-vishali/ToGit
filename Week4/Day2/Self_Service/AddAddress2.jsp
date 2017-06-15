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
  Integer id = 5;
%>
<% String email = (String)request.getSession().getAttribute("email");
out.print(email);
%>
<!DOCTYPE html>
<html>
	<head>
	<meta http-equiv="content-type" content="text/html; charset=UTF-8">
	<title> I am in ADD-ADDRESS </title>

<style>

input[type=text], select {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}

input[type=submit] {
    width: 100%;
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

input[type=submit]:hover {
    background-color: #45a049;
}


div {
    width: 35%;	
    border-radius: 20px;
    background-color: orange;
    padding: 20px;
}
</style>

	</head>

<body>


<div>
        </br>
	<form action="AddAddress.jsp" method="post">
	<input type = "text" name = "address" placeholder = "Your Address"/></br></br>
	<input type = "submit" value = "Add Detail" />
	</form>
	</div>
 <%
  try {
  String address = request.getParameter("address");
  out.print("Address : "+address);
  Class.forName("com.mysql.jdbc.Driver");
  con =DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root", "");
  ps = con.prepareStatement("update userDetail set address = ? where email = ?");
  ps.setString(1, address);
  ps.setString(2, email);
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


