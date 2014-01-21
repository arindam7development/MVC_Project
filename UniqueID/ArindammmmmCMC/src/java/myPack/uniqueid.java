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
public class uniqueid extends HttpServlet {


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
    //String query = "select * from registered where Application_ID";// ='"+appId+"'" ;
   ResultSet rs=stmt.executeQuery("select * from registered where Application_ID='"+appId+"'");
   //out.println("hello");
    out.println("<html>");
     out.println("<body>");
   out.println("<table border='1'BGCOLOR='#FF0000'align='center'cellpadding='25'width='700'>");
   out.println("<caption>UNIQUE I.D. CARD</caption>");
   while(rs.next())
   {
       out.println("<tr  bgcolor='#FFFF00'><td height='80'>ApplicationI.D.</td><td><td><input type='text' value="+rs.getString(1)+"></td></tr>");
       out.println("<tr  bgcolor='#AAAAAA'><td  height='80'>UNIQUE I.D.</td><td><td><input type='text' value="+rs.getString(2)+"></td></tr>");
            }
    //String query1 = "select * from user where Application_ID='"+appId+"'" ;
     ResultSet rs1=stmt.executeQuery("select Name ,Father_Name,Address,Nationality,Gender from user where Application_ID='"+appId+"'");
     // ResultSet rs1=stmt.executeQuery("select * from user where Application_ID='"+appId+"'");
      while(rs1.next()){
            out.println("<tr bgcolor='#FFFF00'><td>Name</td><td><td><input type='text' value="+rs1.getString(1)+"></td></tr>");
    out.println("<tr bgcolor='#AAAAAA'><td>Father's Name</td><td><td><input type='text' value="+rs1.getString(2)+"></td></tr>");
       out.println("<tr bgcolor='#FFFF00'><td>Address</td><td><td><input type='text' value="+rs1.getString(3)+"></td></tr>");
       //out.println("<tr bgcolor='#AAAAAA'><td>Phone</td><td><td><input type='text' value="+rs1.getString(4)+"></td></tr>");
       //out.println("<tr bgcolor='#FFFF00'><td>Pan Card</td><td><td><input type='text' value="+rs1.getString(5)+"></td></tr>");
       out.println("<tr bgcolor='#AAAAAA'><td>Nationality</td><td><td><input type='text' value="+rs1.getString(4)+"></td></tr>");
       //out.println("<tr bgcolor='#FFFF00'><td>Employment</td><td><td><input type='text' value="+rs1.getString(7)+"></td></tr>");
       out.println("<tr bgcolor='#AAAAAA'><td>Gender</td><td><td><input type='text' value="+rs1.getString(5)+"></td></tr>");
       //out.println("<tr bgcolor='#FFFF00'><td>D.O.B.</td><td><td><input type='text' value="+rs1.getString(6)+"></td></tr>");
      /* out.println("<tr bgcolor='#AAAAAA'><td>Email</td><td><td><input type='text' value="+rs1.getString(10)+"></td></tr>");
       out.println("<tr bgcolor='#FFFF00'><td>Application I.D.</td><td><td><input type='text' value="+rs1.getString(11)+"></td></tr>");
       out.println("<tr bgcolor='#AAAAAA'><td>City</td><td><td><input type='text' value="+rs1.getString(12)+"></td></tr>");
       out.println("<tr bgcolor='#FFFF00'><td>State</td><td><td><input type='text' value="+rs1.getString(13)+"></td></tr>");
       out.println("<tr bgcolor='#AAAAAA'><td>Marital Status</td><td><td><input type='text' value="+rs1.getString(14)+"></td></tr>");
       out.println("<tr bgcolor='#FFFF00'><td>User Name</td><td><td><input type='text' value="+rs1.getString(15)+"></td></tr>");
       out.println("<tr bgcolor='#AAAAAA'><td>Password</td><td><td><input type='text' value="+rs1.getString(16)+"></td></tr>");
       out.println("<tr bgcolor='#FFFF00'><td>APPROVAL STATUS</td><td><td><input type='text' value="+rs1.getString(17)+"></td></tr>");
       out.println("<tr bgcolor='#AAAAAA'><td>VERIFYING STATUS</td><td><td><input type='text' value="+rs1.getString(18)+"></td></tr>");
*/

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


