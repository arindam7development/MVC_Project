/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package myPack;
import java.sql.*;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ARINDAM
 */
public class show3 extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        try{
            String appId = request.getParameter("applicationId");
            response.setContentType("text/html");
PrintWriter out=response.getWriter();
    Class.forName("com.mysql.jdbc.Driver");
    //out.println(appId);
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/arindam","root","arindam");
    Statement stmt=conn.createStatement();
    //out.println("hello2");
    String query = "select * from verifier"; //where Application_I.D.='"+appId+"'" ;
   ResultSet rs=stmt.executeQuery(query);
   //out.println("hello");
    out.println("<html>");
     out.println("<body>");
   out.println("<table border='1'BGCOLOR='#AAAAAA'align='center'>");
   while(rs.next())
   {
       out.println("<tr><td>Verifier I.D.</td><td><td><input type='text' value="+rs.getString(1)+"></td></tr>");
       out.println("<tr><td>Name</td><td><td><input type='text' value="+rs.getString(2)+"></td></tr>");
       out.println("<tr><td>Phone</td><td><td><input type='text' value="+rs.getString(3)+"></td></tr>");
       out.println("<tr><td>Address</td><td><td><input type='text' value="+rs.getString(4)+"></td></tr>");
      // out.println("<tr><td>Pan Card</td><td><td><input type='text' value="+rs.getString(5)+"></td></tr>");
      // out.println("<tr><td>Nationality</td><td><td><input type='text' value="+rs.getString(6)+"></td></tr>");
       //out.println("<tr><td>Employment</td><td><td><input type='text' value="+rs.getString(7)+"></td></tr>");
      // out.println("<tr><td>Gender</td><td><td><input type='text' value="+rs.getString(8)+"></td></tr>");
      // out.println("<tr><td>D.O.B.</td><td><td><input type='text' value="+rs.getString(9)+"></td></tr>");
       //out.println("<tr><td>Email</td><td><td><input type='text' value="+rs.getString(10)+"></td></tr>");
       //out.println("<tr><td>Application I.D.</td><td><td><input type='text' value="+rs.getString(11)+"></td></tr>");

       out.println("<tr><td>State</td><td><td><input type='text' value="+rs.getString(5)+"></td></tr>");
       out.println("<tr><td>City</td><td><td><input type='text' value="+rs.getString(6)+"></td></tr>");
       out.println("<tr><td>Gender</td><td><td><input type='text' value="+rs.getString(7)+"></td></tr>");
       //out.println("<tr><td>User Name</td><td><td><input type='text' value="+rs.getString(15)+"></td></tr>");
       //out.println("<tr><td>Password</td><td><td><input type='text' value="+rs.getString(16)+"></td></tr>");
       //out.println("<tr><td>APPROVAL STATUS</td><td><td><input type='text' value="+rs.getString(17)+"></td></tr>");
       //out.println("<tr><td>VERIFYING STATUS</td><td><td><input type='text' value="+rs.getString(18)+"></td></tr>");
        //out.println("<tr><td>Unique I.D.</td><td><td><input type='text' value="+rs.getString(19)+"></td></tr>");

            }
   out.println("</table>");
    out.println("</body>");
    out.println("</html>");
   stmt.close();
   conn.close();
}

catch(Exception e)
{
 System.out.println(e.toString());
}
    }
}


