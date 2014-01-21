package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"keywords\" content=\"\" />\n");
      out.write("        <meta name=\"description\" content=\"\" />\n");
      out.write("        <title>College Faculty,Student and Book System Management</title>\n");
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
      out.write("\t\t\t<li class=\"current_page_item\"><a href=\"index.jsp\">Home</a></li>\n");
      out.write("\t\t\t<li><a href=\"AboutUs.jsp\">About Us</a></li>\n");
      out.write("\t\t\t<li><a href=\"stud_login.jsp\">Student</a></li>\n");
      out.write("\t\t\t<li><a href=\"faculty_login.jsp\">Faculty</a></li>\n");
      out.write("\t\t\t<li><a href=\"Library.jsp\">Library</a></li>\n");
      out.write("\t\t\t<li class=\"last\"><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"banner\"><img src=\"css/images/pics01.jpg\" width=\"1000\" height=\"361\" alt=\"\" /></div>\n");
      out.write("\t<div id=\"welcome\">\n");
      out.write("\t\t<h2 class=\"title\"><a href=\"#\">Welcome to D.I.T. DEHRADUN</a></h2>\n");
      out.write("\t\t<div class=\"entry\">\n");
      out.write("\t\t\t<p>This is <strong>Home Page of D.I.T.'s Faculty,Student and Book System Management </strong>\n");
      out.write("DIT is a leading technical institute offering Undergraduate and Postgraduate programmes in several streams.</p>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"three-columns\">\n");
      out.write("\t\t<div id=\"column1\">\n");
      out.write("\t\t\t<h2>Student Management</h2>\n");
      out.write("\t\t\t<p>This is one of our module which deals with Student's Registration,Attendance management and much more.</p>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div id=\"column2\">\n");
      out.write("\t\t\t<h2>Faculty Managemnet</h2>\n");
      out.write("\t\t\t<p>This is our another module which deals with Faculty's Registration,Attendance management and much more.</p>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div id=\"column3\">\n");
      out.write("\t\t\t<h2>Library Management</h2>\n");
      out.write("\t\t\t<p>This is our another important module which is shared by our two above mentioned modules.This deals with management of Library books issued to Students as well as Faculty members.</p>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"two-columns\">\n");
      out.write("\t\t<div id=\"col1\">\n");
      out.write("\t\t\t<h2>D.I.T DEHRADUN</h2>\n");
      out.write("\t\t\t<p>The campus is located at the edge of the Mussoorie hills, on acres of park land. The DIT campus is just a short ride on public transport from the heart of downtown Dehradun. No matter what your choice of study, the DIT campus will inspire you. As student at DIT, you’ll have all this and more at your doorstep. </p>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div id=\"col2\"><img src=\"css/images/pics02.jpg\" alt=\"\" width=\"320\" height=\"260\" class=\"image-style\" /> </div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- end #page -->\n");
      out.write("</div>\n");
      out.write("<div id=\"footer\">\n");
      out.write("\t<p></p>\n");
      out.write("</div>\n");
      out.write("        <h1></h1>\n");
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
