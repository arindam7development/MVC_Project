package Databa;

import java.sql.*;

public class dbdet
{

 private static Connection con;

 static
 {
   try
   {
     Class.forName("com.mysql.jdbc.Driver");

     String url="jdbc:mysql://localhost:3306/project";
     String user="root";
     String pwd="";

     con=DriverManager.getConnection(url,user,pwd);

   }
   catch(Exception e)
   {
     System.out.print("Error:: "+e.getMessage());

   }

 }

 public static Connection getConnection()
 {
   return con;
 }

 public static int updateData(String sql)
 {
  try
  {
    Statement s1=con.createStatement();
    int l=s1.executeUpdate(sql);
    return l;
  }
  catch(Exception e)
  {
   System.out.print("\n\tError:: "+e.getMessage());
   return 0;
  }
 }

 public static ResultSet selectData(String sql)
 {
  try
  {
   Statement s2=con.createStatement();
   ResultSet rs=s2.executeQuery(sql);
   return rs;

  }
  catch(Exception e)
  {
   System.out.print("\n\tError:: "+e.getMessage());
   return null;
  }

 }

}