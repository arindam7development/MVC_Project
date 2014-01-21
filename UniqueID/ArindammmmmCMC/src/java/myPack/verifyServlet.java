/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myPack;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class verifyServlet extends HttpServlet {

    /**Process the HTTP Get request*/
    @Override
    public void doPost(HttpServletRequest req,
            HttpServletResponse res) throws ServletException,
            IOException {
        String connectionURL = "jdbc:mysql://localhost:3306/arindam";
        Connection connection = null;
        PreparedStatement pst = null;
        ResultSet rs;
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        //get the variables entered in the form
       
        String id = req.getParameter("vid");
         String name = req.getParameter("vname");
         String phone = req.getParameter("vphone");
        String address = req.getParameter("vaddress");
          String state = req.getParameter("state");
        String city = req.getParameter("city");
      
        String gender = req.getParameter("gender");
       
      
        try {
            // Load the database driver
            Class.forName("com.mysql.jdbc.Driver");
            // Get a Connection to the database
            connection = DriverManager.getConnection(connectionURL, "root", "arindam");
            //Add the data into the database
         
            pst = connection.prepareStatement("insert into verifier values (?,?,?,?,?,?,?)");
            System.out.println("hello1");

            pst.setString(1, id);
            System.out.println("hello2");
            pst.setString(2, name);
            pst.setString(3, phone);
            pst.setString(4, address);
            pst.setString(5, state);
            pst.setString(6, city);
            pst.setString(7, gender);
            System.out.println("hello3");
            
            System.out.println("hello4");
            int updateQuery = pst.executeUpdate();
            if (updateQuery != 0) {
                out.println("<br>Record has been inserted");
            } else {
                out.println("failed to insert the data");
            }

            // res.sendRedirect("verifierhome.jsp");
            // show that the new account has been created
            out.println(" VERIFIER IS REGISTERED ");


        } catch (ClassNotFoundException e) {
            out.println("Couldn't load database driver: "
                    + e.getMessage());
        } catch (SQLException e) {
            out.println("SQLException caught: "
                    + e.getMessage());
        } catch (Exception e) {
            out.println(e);
        } finally {
            // Always close the database connection.
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ignored) {
                out.println(ignored);
            }
        }
    }
}
