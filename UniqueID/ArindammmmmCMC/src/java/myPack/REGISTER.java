/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package myPack;

import java.sql.*;

import java.sql.SQLException;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ARINDAM
 */
public class REGISTER extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
         Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try{

            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("class found");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/arindam","root","omarindamom");
              stmt=con.createStatement();
         rs=stmt.executeQuery("select * from id");

         stmt.executeUpdate("insert into id values ('AbhishekBachan','AmitabhBachhan','Mumbai',8126210337,'qwe34rty','INDIA','AB-CRop.','MALE','1981-02-05','abhi1gmail.com','ash');");
          response.sendRedirect("client.jsp");
        }	catch (SQLException e) {System.out.println(e.toString());
	}
	catch (Exception e) {System.out.println(e.toString());
	}
	finally {
	// Close the connection

	}
	}
    }

   
