package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.sql.*;;

public final class increment_005fatt_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
  }

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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <title>College Faculty,Student and Book System Management</title>\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <marquee behavior=\"scroll\" direction=\"left\"><img src=\"css/images/dit.jpg\" width=\"100\" height=\"100\" alt=\"WELCOME TO D.I.T.DEHRADUN\"/></marquee>\n");
      out.write("         <div id=\"wrapper\">\n");
      out.write("\t<div id=\"header\">\n");
      out.write("\t\t<div id=\"logo\">\n");
      out.write("\t\t\t<h1><a href=\"#\">D.I.T. MANAGEMENT SYSTEM</a></h1>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("             <div id=\"menu\">\n");
      out.write("\t\t<ul>\n");
      out.write("\t\t\t<li class=\"current_page_item\"><a href=\"FacultyHomePage.jsp\">WELCOME</a></li>\n");
      out.write("\t\t\t<li><a href=\"#\"></a></li>\n");
      out.write("\t\t\t<li><a href=\"#\"></a></li>\n");
      out.write("\t\t\t<li><a href=\"#\"></a></li>\n");
      out.write("\t\t\t<li><a href=\"#\"></a></li>\n");
      out.write("\t\t\t<li class=\"last\"><a href=\"index.jsp\">Logout</a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"banner\"><img src=\"css/images/pics01.jpg\" width=\"1000\" height=\"361\" alt=\"\" /></div>\n");
      out.write("\t<div id=\"welcome\">\n");
      out.write("             \n");
      out.write("\n");
      out.write("\n");
      out.write("    <form name=\"ak\" action=\"update_att.jsp\" method=\"get\">\n");
      out.write("        <table align=\"center\">\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <h2>WELCOME TO ATTENDENCE SECTION</h2>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        ");

        Calendar currentDate = Calendar.getInstance();
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy/M/dd");
        String datenow = formatter.format(currentDate.getTime());
        SimpleDateFormat formatter1= new SimpleDateFormat("EEE");
        String dayNow = formatter1.format(currentDate.getTime());

        
      out.write("\n");
      out.write("        <table align=\"center\" cellpadding=\"5\" cellspacing=\"5\">\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <h3>DATE:");
      out.print(datenow);
      out.write("</h3>\n");
      out.write("                     <h3>DAY:");
      out.print(dayNow);
      out.write("</h3>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <table class=\"b\" border =\"2\" cellpadding=\"5\" cellspacing=\"5\" align=\"center\">\n");
      out.write("            <th>STUDENT_NAME</th>\n");
      out.write("            <th>STUDENT_ID</th>\n");
      out.write("            <th>BRANCH</th>\n");
      out.write("            <th>YEAR</th>\n");
      out.write("            <th>MARK ATTENDANCE</th>\n");
      out.write("\n");
      out.write("    ");
try
    {
        Class.forName("com.mysql.jdbc.Driver");
    int i=1;

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from attendance");
session= request.getSession(true);
session.setAttribute("n",i );

      out.write("\n");
      out.write("    ");

    while(rs.next())
    {
        
      out.write("\n");
      out.write("\n");
      out.write("    <tr><td>");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("    <td><input type=\"checkbox\" name=\"attendance\" value=\"");
      out.print(rs.getString(2));
      out.write("\"></td></br></tr>\n");
      out.write("         ");
i=i++;
      out.write("\n");
      out.write("    ");
}
      out.write("\n");
      out.write("\n");
      out.write("        </table> ");
}catch(Exception e){out.println(e);}
      out.write("<table align=\"center\"><tr><td><input type=\"submit\" value=\"submit\" align=\"center\"></td></tr></table> </form>\n");
      out.write(" <div id=\"three-columns\">\n");
      out.write("\n");
      out.write("\t </div>\n");
      out.write("         </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
