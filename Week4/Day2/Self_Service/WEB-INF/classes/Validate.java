import java.sql.*;

public class Validate
 {
     public static boolean checkUser(String email,String pass) 
     {
      boolean st =false;
      try{

	 //loading drivers for mysql
         Class.forName("com.mysql.jdbc.Driver");

 	 //creating connection with the database 
         Connection con=DriverManager.getConnection
                        ("jdbc:mysql://localhost:3306/sample","root","");
         PreparedStatement ps =con.prepareStatement
                             ("select * from userDetail where email=? and password=?");
         ps.setString(1, email);
         ps.setString(2, pass);
         ResultSet rs =ps.executeQuery();
         st = rs.next();
        
      }catch(Exception e)
      {
          e.printStackTrace();
      }
         return st;                 
  }

   public static boolean alreadyExists(String email)
   {
	   boolean exists = false;
   try{

	 //loading drivers for mysql
         Class.forName("com.mysql.jdbc.Driver");

 	 //creating connection with the database 
         Connection con=DriverManager.getConnection
                        ("jdbc:mysql://localhost:3306/sample","root","");
         PreparedStatement ps =con.prepareStatement
                             ("select * from userDetail where email=?");
         ps.setString(1, email);
         ResultSet rs =ps.executeQuery();
         exists = rs.next();
        
      }catch(Exception e)
      {
          e.printStackTrace();
      }
         return exists;  

   }


}

