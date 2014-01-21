package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class basic_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <meta name=\"keywords\" content=\"\" />\n");
      out.write("        <meta name=\"description\" content=\"\" />\n");
      out.write("        <title>College Faculty,Student and Book System Management</title>\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <marquee behavior=\"scroll\" direction=\"left\"><img src=\"\" width=\"100\" height=\"100\" alt=\"WELCOME TO D.I.T.DEHRADUN\"/></marquee>\n");
      out.write("         <div id=\"wrapper\">\n");
      out.write("\t<div id=\"header\">\n");
      out.write("\t\t<div id=\"logo\">\n");
      out.write("\t\t\t<h1><a href=\"#\">D.I.T. DEHRADUN</a></h1>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("             <div id=\"menu\">\n");
      out.write("\t\t<ul>\n");
      out.write("\t\t\t<li class=\"current_page_item\"><a href=\"index.jsp\">Home</a></li>\n");
      out.write("\t\t\t<li><a href=\"AboutUs.jsp\">About Us</a></li>\n");
      out.write("\t\t\t<li><a href=\"StudentRegistration.jsp\"\">Student</a></li>\n");
      out.write("\t\t\t<li><a href=\"Faculty.jsp\">Faculty</a></li>\n");
      out.write("\t\t\t<li><a href=\"Library.jsp\">Library</a></li>\n");
      out.write("\t\t\t<li class=\"last\"><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"banner\"><img src=\"css/images/pics01.jpg\" width=\"1000\" height=\"361\" alt=\"\" /></div>\n");
      out.write("\t<div id=\"welcome\">\n");
      out.write("            <div class=\"entry\">\n");
      out.write("\t\t\t<form action=\"ServletUserEnquiryForm\" method=\"post\" name=\"myform\" >\n");
      out.write("                            <table  >\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <tr><td>NAME</td><td><input type=\"text\" name=\"name\" size=\"30\"  ></td></tr>\n");
      out.write("                                <tr><td>FATHER'S NAME</td><td><input type=\"text\" name=\"FATHER_NAME\" size=\"30\"  ></td></tr>\n");
      out.write("                                <tr><td>ADDRESS</td><td><textarea name=\"address\" rows=\"4\" cols=\"25\"></textarea></td></tr>\n");
      out.write("                                <tr><td>PHONE NUMBER</td><td><input type=\"text\" name=\"Phone\" ></td></tr>\n");
      out.write("                                <tr><td>COLLEGE I.D.</td><td><input type=\"text\" name=\"pan\" size=\"30\"  ></td></tr>\n");
      out.write("                                <tr><td>PASSWORD</td><td><input type=\"password\" name=\"NATION\" size=\"30\"  ></td></tr>\n");
      out.write("                                <tr><td>USER NAME</td><td><input type=\"text\" name=\"employ\" size=\"30\"  ></td></tr>\n");
      out.write("                                <tr><td>GENDER</td><td><input type=\"radio\" name=\"m\" value=\"Male\" checked=\"true\"/> Male  <input type=\"radio\" name=\"m\" value=\"Female\"/>Female</td></tr>\n");
      out.write("                                <tr><td>Date Of Birth</td><td><input type=\"text\" name=\"dob\" >yyyy/mm/dd</td></tr>\n");
      out.write("                                <tr><td>Email Id</td><td><input type=\"text\" name=\"email\" size=\"30\"  ></td></tr>\n");
      out.write("                                <tr><td>Click Here To Submit</td><td>\n");
      out.write("                                        <input type=\"submit\" name=\"register\" value=\"REGISTER\" ></td></tr>\n");
      out.write("                            </table>\n");
      out.write("                        </form>\n");
      out.write("\t\t</div>\n");
      out.write("        </div>");
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
