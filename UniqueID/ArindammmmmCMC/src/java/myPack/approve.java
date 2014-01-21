/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myPack;

import java.util.UUID;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class approve extends HttpServlet {

    private static String log(Object aObject) {
        return (String.valueOf(aObject));
    }

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
        String appr = req.getParameter("app2");

        try {
            // Load the database driver
            Class.forName("com.mysql.jdbc.Driver");
            // Get a Connection to the database
            connection = DriverManager.getConnection(connectionURL, "root", "arindam");
            String u = "chan";
             Statement stmt = connection.createStatement();

            //Add the data into the database

          
            //pst = connection.prepareStatement("truncate from user where Application_I.D.='" + id + "'");
            if (appr.equals("1")) {
                UUID idOne = UUID.randomUUID();
                u = log(idOne);
            }
             int executeUpdate = stmt.executeUpdate("insert into registered values ('"+id+"','"+u+"')");
            // pst = connection.prepareStatement("insert into registered values('"+id+"','"+u+"')");
        // int a=1;
         //int b=1;
            //pst = connection.prepareStatement("insert into chan values ('"+u+"')");

            //int updateQuery = pst.executeUpdate();
            //Statement stmt = connection.createStatement();
            // pst = connection.prepareStatement("insert into user  UniqueID='"+u+"' where Application_I.D.='"+id+"'");
             rs = stmt.executeQuery("update user set Approved='"+1+"' where Application_ID='"+id+"'");
             rs = stmt.executeQuery("update user set Verified='"+1+"' where Application_ID='"+id+"'");
            //res.sendRedirect("AdminHome.jsp");
            // show that the new account has been created
            out.println(" Hello : ");



        } catch (Exception e) {
            out.println("Couldn't load database driver: "
                    + e.toString());
        } finally {
            // Always close the database connection.
            res.sendRedirect("RegisteredTable.jsp");
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
