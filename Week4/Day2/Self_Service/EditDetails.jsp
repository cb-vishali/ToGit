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
    width: 50%;
    padding: 12px 20px;
    margin: 8px 200px;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}
input[type=password], select {
    width: 50%;
    padding: 12px 20px;
    margin: 8px 200px;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}

input[type=submit] {
    width: 50%;
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 200px;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

input[type=submit]:hover {
    background-color: #45a049;
}

div {
    position: absolute;
      margin: auto;
      top: 0;
      right: 0;
      bottom: 0;
      left: 0;
      width : 60%;
      height:60%;
      background-color: orange;
      border-radius: 20px;
      padding: 20px;
}

</style>

	</head>

<body>


<div>
        
	<form action="EditDetails" method="post">
		<h2>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Edit Details </h2>
		</br>
		<input type = "text" style="box-align:center;"  name = "fname" id = "fname"  placeholder = "New First Name" align="middle"/></br></br>
        <input type = "text" name = "lname" id = "lname"  placeholder = "New Last Name"/></br></br>
        <input type = "password" name = "password" id = "fname"  placeholder = "New Password"/></br></br>
        <input type = "text" name = "address" id = "address"  placeholder = "New Address"/></br></br>
	<input type = "submit" value = "Update" />
	</form>
	</div>
</body>
</html>


