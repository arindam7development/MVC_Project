/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myPack;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DoVerification extends HttpServlet {

    /**Process the HTTP Get request*/
    @Override
    public void doGet(HttpServletRequest req,
            HttpServletResponse res) throws ServletException,
            IOException {
        String connectionURL = "jdbc:mysql://localhost:3306/arindam";
        Connection connection = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        //get the variables entered in the form
        String id = req.getParameter("applicationId");
        String appr = req.getParameter("verified");

        try {
            // Load the database driver
            Class.forName("com.mysql.jdbc.Driver");
            // Get a Connection to the database
            connection = DriverManager.getConnection(connectionURL, "root", "omarindamom");

            //Add the data into the database

            pst = connection.prepareStatement("UPDATE id1 SET verified='" + appr + "' WHERE applicationid='" + id + "'");
            System.out.println("hello1");
            int updateQuery = pst.executeUpdate();
            System.out.println(updateQuery);
            if (updateQuery != 0) {
                System.out.println("<br>Record has been inserted");
            } else {
                System.out.println("failed to insert the data");
            }
            // res.sendRedirect("verifierhome.jsp");
            // show that the new account has been created
            out.println(" Hello : ");



        } catch (Exception e) {
            out.println("Couldn't load database driver: "
                    + e.toString());
        } finally {
            // Always close the database connection.
            res.sendRedirect("verifierhome.jsp");
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
