package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"description\" content=\"\" />\n");
      out.write("        <meta name=\"keywords\" content=\"\" />\n");
      out.write("        <title>UID</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\n");
      out.write("        <script  type=\"text/javascript\">\n");
      out.write("            function validateForm()\n");
      out.write("            {\n");
      out.write("                var x=document.forms[\"myForm\"][\"email\"].value;\n");
      out.write("\n");
      out.write("                var atpos=x.indexOf(\"@\");\n");
      out.write("                var dotpos=x.lastIndexOf(\".\");\n");
      out.write("                if (atpos<1 || dotpos<atpos+2 || dotpos+2>=x.length)\n");
      out.write("                {\n");
      out.write("                    alert(\"Not a valid e-mail address\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                var y=document.forms[\"myForm\"][\"name\"].value;\n");
      out.write("                if (y==null || y==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Name must be filled out\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                var p=document.forms[\"myForm\"][\"Phone\"].value;\n");
      out.write("                p.maxlen=10;\n");
      out.write("                if(p.length!=10 || p!=\"numeric\")\n");
      out.write("                {\n");
      out.write("                    alert(\"enter the phone number correctly\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("             \n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("            <div id=\"header\">\n");
      out.write("                <div id=\"logo\">\n");
      out.write("                    <h1><a href=\"#\">UID</a></h1>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div id=\"menu\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li class=\"first current_page_item\"><a href=\"index.jsp\">Homepage</a></li>\n");
      out.write("                        <li><a href=\"about.jsp\">About Us</a></li>\n");
      out.write("                        <li><a href=\"registration.jsp\">Registration</a></li>\n");
      out.write("                        <li><a href=\"AdminLogin.jsp\">Admin Login</a></li>\n");
      out.write("                        <li><a href=\"verifierlogin.jsp\">Verifier Login</a></li>\n");
      out.write("                        <li class=\"last\"><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <br class=\"clearfix\" />\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"splash\">\n");
      out.write("                <img src=\"css/images/ae.jpg\" width=\"1100\" height=\"250\" alt=\"\" />\n");
      out.write("            </div>\n");
      out.write("            <div id=\"page\">\n");
      out.write("                <div id=\"content\">\n");
      out.write("                    <div class=\"post\">\n");
      out.write("                        <h2>Register yourself with us</h2>\n");
      out.write("                        <p>\n");
      out.write("                            <strong>  The Unique Identification Authority of India (UIDAI) </strong>(Hindi: भारतीय विशिष्ट पहचान प्राधिकरण), is an agency of the Government of India responsible for implementing the AADHAAR scheme, a unique identification project.\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"post\">\n");
      out.write("                        <h3>Registration Form</h3>\n");
      out.write("                        <p>\n");
      out.write("                        <form action=\"ServletUserEnquiryForm\" onsubmit=\"validateForm();\" method=\"post\" name=\"myform\" >\n");
      out.write("                            <table>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <tr><td>NAME</td><td><input type=\"text\" name=\"name\" size=\"30\"  ></td></tr>\n");
      out.write("                                <tr><td>FATHER'S NAME</td><td><input type=\"text\" name=\"FATHER_NAME\" size=\"30\"  ></td></tr>\n");
      out.write("                                 <tr><td>UserName</td><td><input type=\"text\" name=\"UN\"size=\"30\"  ></td></tr>\n");
      out.write("                                <tr><td>Password</td><td><input type=\"text\" name=\"ps\"size=\"30\"  ></td></tr>\n");
      out.write("                                <tr><td>ADDRESS</td><td><textarea name=\"address\" rows=\"4\" cols=\"25\"></textarea></td></tr>\n");
      out.write("                                <tr><td>PHONE NUMBER</td><td><input type=\"text\" name=\"Phone\" ></td></tr>\n");
      out.write("                                <tr><td>PAN CARD NUMBER</td><td><input type=\"text\" name=\"pan\" size=\"30\"  ></td></tr>\n");
      out.write("                                <tr><td>NATIONALITY</td><td><input type=\"text\" name=\"NATION\" size=\"30\"  ></td></tr>\n");
      out.write("                                <tr><td>EMPLOYMENT</td><td><input type=\"text\" name=\"employ\" size=\"30\"  ></td></tr>\n");
      out.write("                                <tr><td>GENDER</td><td><input type=\"radio\" name=\"m\" value=\"Male\" checked=\"true\"/> Male  <input type=\"radio\" name=\"m\" value=\"Female\"/>Female</td></tr>\n");
      out.write("                                <tr><td>Date Of Birth</td><td><input type=\"text\" name=\"dob\" >yyyy/mm/dd</td></tr>\n");
      out.write("                                <tr><td>Email Id</td><td><input type=\"text\" name=\"email\" size=\"30\"  ></td></tr>\n");
      out.write("                                <tr><td>APPLICATION I.D.</td><td><input type=\"text\" name=\"applicationId\"size=\"30\"  ></td></tr>\n");
      out.write("                                <tr><td>CITY</td><td><input type=\"text\" name=\"city\"size=\"30\"  ></td></tr>\n");
      out.write("                                <tr><td>STATE</td><td><input type=\"text\" name=\"state\"size=\"30\"  ></td></tr>\n");
      out.write("                                <tr><td>VERIFIED put 0(not verified)1(verified)2(waiting)</td><td><input type=\"text\" name=\"verified\"size=\"30\"  ></td></tr>\n");
      out.write("                                <tr><td>APPROVED put  0(not approved)1(approved)2(waiting) </td><td><input type=\"text\" name=\"approved\"size=\"30\"  ></td></tr>\n");
      out.write("                                <tr><td>MARITAL STATUS</td><td><input type=\"text\" name=\"MaritalStatus\"size=\"30\"  ></td></tr>\n");
      out.write("                                <tr><td>Click Here To Submit</td><td>\n");
      out.write("                                        <input type=\"submit\" name=\"register\" value=\"REGISTER\" ></td></tr>\n");
      out.write("                            </table>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    <br class=\"clearfix\" />\n");
      out.write("                </div>\n");
      out.write("                <br class=\"clearfix\" />\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"footer\">\n");
      out.write("            &copy; 2012 Untitled | Design by <a href=\"http://www.freecsstemplates.org/\">ARINDAM</a> | Images by <a href=\"http://fotogrph.com/\">arindam</a>\n");
      out.write("        </div>\n");
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
