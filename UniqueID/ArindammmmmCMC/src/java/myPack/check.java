/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package myPack;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class check extends HttpServlet{


  /**Process the HTTP Get request*/
    @Override
  public void doPost(HttpServletRequest req,
  HttpServletResponse res) throws ServletException,
  IOException{
  String connectionURL = "jdbc:mysql://localhost:3306/arindam";
  Connection connection=null;
  PreparedStatement pst =null;
  ResultSet rs = null;
  res.setContentType("text/html");
  PrintWriter out = res.getWriter();
  //get the variables entered in the form
 String name = req.getParameter("vname");
 String id = req.getParameter("vid");
String address = req.getParameter("vaddress");
String phone = req.getParameter("vphone");
String city = req.getParameter("city");
String state = req.getParameter("state");
String gender = req.getParameter("gender");
String dob = req.getParameter("dob");
String reg = req.getParameter("registration_date");

  try {
  // Load the database driver
  Class.forName("com.mysql.jdbc.Driver");
  // Get a Connection to the database
  connection = DriverManager.getConnection
  (connectionURL, "root", "omarindamom");

  //Add the data into the database

  pst = connection.prepareStatement("insert into verifier values(?,?,?,?,?,?,?,?,?)");

  pst.setString(1,id);
   pst.setString(2,name);
    pst.setString(3,phone);
     pst.setString(4,address);
      pst.setString(5,state);
       pst.setString(6,city);
        pst.setString(7,gender);
         pst.setString(8,dob);
          pst.setString(9,reg);
          
 int updateQuery = pst.executeUpdate();
  res.sendRedirect("verifierhome.jsp");
  // show that the new account has been created
  out.println(" Hello : ");



  }
  catch(Exception e){
  out.println("Couldn't load database driver: "
  + e.toString());
  }

  finally {
  // Always close the database connection.
       res.sendRedirect("client.jsp");
  try {
  if (connection != null) connection.close();
  }
  catch (SQLException ignored){
  out.println(ignored);
  }
  }
  }
}
