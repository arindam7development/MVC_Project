/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myPack;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServletUserEnquiryForm extends HttpServlet {

    /**Process the HTTP Get request*/
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String connectionURL = "jdbc:mysql://localhost:3306/arindam";
        Connection connection = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        //get the variables entered in the form
        String name = req.getParameter("name");
        String FatherNAME = req.getParameter("FATHER_NAME");
        String address = req.getParameter("address");
        String phone = req.getParameter("Phone");
        String pan = req.getParameter("pan");
        String NATION = req.getParameter("NATION");

        String employ = req.getParameter("employ");
        String m = req.getParameter("m");
        String dob = req.getParameter("dob");
        String email = req.getParameter("email");
        String appId = req.getParameter("applicationId");
        String city = req.getParameter("city");
        String state = req.getParameter("state");
         String user = req.getParameter("UN");
          String password = req.getParameter("ps");
        String verified = req.getParameter("verified");
        String approved = req.getParameter("approved");
        String ms = req.getParameter("MaritalStatus");
        System.out.println(name);
        try {
            // Load the database driver
            Class.forName("com.mysql.jdbc.Driver");
            // Get a Connection to the database
            connection = DriverManager.getConnection(connectionURL, "root", "arindam");

            //Add the data into the database

            pst = connection.prepareStatement("insert into user values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            pst.setString(1, name);
            pst.setString(2, FatherNAME);
            pst.setString(3, address);
            pst.setString(4, phone);
            pst.setString(5, pan);
            pst.setString(6, NATION);
            pst.setString(7, employ);
            pst.setString(8, m);
            pst.setString(9, dob);
            pst.setString(10, email);
            pst.setString(11, appId);
            pst.setString(12, city);
            pst.setString(13, state);
             pst.setString(14, ms);
              pst.setString(15, user);
            pst.setString(16, password);
            pst.setString(17, approved);
            pst.setString(18, verified);
            int updateQuery = pst.executeUpdate();
            if (updateQuery != 0) {
                out.println("<br>Record has been inserted");
            } else {
                out.println("failed to insert the data");
            }
           // res.sendRedirect("client.jsp");
            // show that the new account has been created
            out.println(" Hello : ");

            pst.close();

        } catch (Exception e) {
            out.println("Couldn't load database driver: "
                    + e.toString());
        } finally {
            // Always close the database connection.
            res.sendRedirect("client.jsp");
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
