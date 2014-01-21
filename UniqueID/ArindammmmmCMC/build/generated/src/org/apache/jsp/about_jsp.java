package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta name=\"description\" content=\"\" />\n");
      out.write("        <meta name=\"keywords\" content=\"\" />\n");
      out.write("        <title>UIDAI Unique Identification Authority of India</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <marquee behavior=\"scroll\" direction=\"left\"><img src=\"new.jpg\" width=\"100\" height=\"100\" alt=\"Aadhar-Card-India-Registration\"/></marquee>\n");
      out.write("<div id=\"wrapper\">\n");
      out.write("            <div id=\"header\">\n");
      out.write("                <div id=\"logo\">\n");
      out.write("                    <h1><a href=\"#\">UIDAI Unique Identification Authority of India</a></h1>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div id=\"menu\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li class=\"first current_page_item\"><a href=\"index.jsp\">Homepage</a></li>\n");
      out.write("\n");
      out.write("                         <li><a href=\"AdminLogin.jsp\">Admin Login</a></li>\n");
      out.write("                          <li><a href=\"verifierlogin.jsp\">Verifier Login</a></li>\n");
      out.write("                        <li><a href=\"registration.jsp\">Registration</a></li>\n");
      out.write("                        <li class=\"last\"><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <br class=\"clearfix\" />\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"splash\">\n");
      out.write("                <img src=\"css/images/splash.jpg\" width=\"1100\" height=\"250\" alt=\"\" />\n");
      out.write("            </div>\n");
      out.write("            <div id=\"page\">\n");
      out.write("                <div id=\"content\">\n");
      out.write("                    <div class=\"post\">\n");
      out.write("                        <h2>Welcome to UIDAI</h2>\n");
      out.write("                        <p>\n");
      out.write("                            he Unique Identification Authority of India (UIDAI) (Hindi: भारतीय विशिष्ट पहचान प्राधिकरण), is an agency of the Government of India responsible for implementing the AADHAAR scheme, a unique identification project. It was established in February 2009, and will own and operate the Unique Identification Number database.[1] The authority aims to provide a unique id number to all Indians, but not smart cards.[2] The authority will maintain a database of residents containing biometric and other data.[3]\n");
      out.write("The agency is headed by a chairman, who holds a cabinet rank. The UIDAI is part of the Planning Commission of India.[1][4] Nandan Nilekani, former co-chairman of Infosys Technologies, was appointed as the first Chairman of the authority in June 2009.[5] Ram Sewak Sharma, an IAS Officer of Jharkhand Government is the Director General and Mission Director of the Authority.[\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <br class=\"clearfix\" />\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"footer\">\n");
      out.write("            &copy; 2012 Untitled | Design by <a href=\"http://www.freecsstemplates.org/\">ARINDAM</a> | Images by <a href=\"http://fotogrph.com/\">Fot</a>\n");
      out.write("        </div>\n");
      out.write("\n");
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
