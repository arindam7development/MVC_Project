package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class insertid1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");

     String name = request.getParameter("name");
String FatherNAME  = request.getParameter("Father_NAME");
String address = request.getParameter("address");
String phone = request.getParameter("Phone");
String pan = request.getParameter("pan");
String NATION = request.getParameter("NATION");

String employ = request.getParameter("employ");
String m = request.getParameter("m");
String dob = request.getParameter("dob");
String email = request.getParameter("email");
String appId = request.getParameter("applicationId");
String city = request.getParameter("city");
String state = request.getParameter("state");
String verified = request.getParameter("verified");
String approved = request.getParameter("approved");
String ms = request.getParameter("MaritalStatus");

        try{
         Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/roseindia", "root", "root");
           Statement st=con.createStatement();
           int i=st.executeUpdate("insert into id1 values('"+name+"','"+FatherNAME+"','"+address+"','"+phone+"','"+pan+"','"+NATION+"',"+employ+",'"+m+"','"+dob+"','"+email+"','"+appId+"','"+city+"',"+state+","+verified+","+approved+","+ms+")");
        out.println("Data is successfully inserted!");
        }
        catch(Exception e){
        System.out.print(e);
        e.printStackTrace();
        }
        
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
