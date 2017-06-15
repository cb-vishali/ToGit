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
    position: absolute;
      margin: auto;
      top: 0;
      right: 0;
      bottom: 0;
      left: 0;
      width : 30%;
      height:30%;
      background-color: orange;
      border-radius: 20px;
      padding: 20px;
}

</style>

	</head>

<body>


<div>
	</br></br>
	<form action="AddAddress" method="post">
	<input type = "text" name = "address" id = "address"  placeholder = "Your Address"/></br></br>
	<input type = "submit" value = "Insert Address" />
	</form>
	</div>
</body>
</html>


