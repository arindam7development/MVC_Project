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
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"description\" content=\"\" />\n");
      out.write("        <meta name=\"keywords\" content=\"\" />\n");
      out.write("        <title>UIDAI Unique Identification Authority of India</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- HTML codes by Quackit.com -->\n");
      out.write("    <marquee behavior=\"scroll\" direction=\"left\"><img src=\"new.jpg\" width=\"100\" height=\"100\" alt=\"Aadhar-Card-India-Registration\"/></marquee>\n");
      out.write("<div id=\"wrapper\">\n");
      out.write("            <div id=\"header\">\n");
      out.write("                <div id=\"logo\">\n");
      out.write("                    <h1><a href=\"#\">UIDAI Unique Identification Authority of India</a></h1>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div id=\"menu\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li class=\"first current_page_item\"><a href=\"index.jsp\">Homepage</a></li>\n");
      out.write("                        <li><a href=\"about.jsp\">About Us</a></li>\n");
      out.write("                         <li><a href=\"AdminLogin.jsp\">Admin Login</a></li>\n");
      out.write("                          <li><a href=\"verifierlogin.jsp\">Verifier Login</a></li>\n");
      out.write("                        <li><a href=\"registration.jsp\">Registration</a></li>\n");
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
      out.write("                        <h2>Welcome to UIDAI</h2>\n");
      out.write("                        <p>\n");
      out.write("                         <strong>UIDAI</strong>,adhaar is a 12 digit individual identification number issued by the Unique Identification Authority of India on behalf of the Government of India.\n");
      out.write("\n");
      out.write("This number will serve as a proof of identity and address, anywhere in India.\n");
      out.write("\n");
      out.write("Any individual, irrespective of age and gender, who is a resident in India and satisfies the verification process laid down by the UIDAI can enrol for Aadhaar.\n");
      out.write("\n");
      out.write("Each individual needs to enroll only once which is free of cost.\n");
      out.write("\n");
      out.write("Each Aadhaar number will be unique to an individual and will remain valid for life. Aadhaar number will help you provide access to services like banking, mobile phone connections and other Govt and Non-Govt services in due course.\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                   \n");
      out.write("                </div>\n");
      out.write("                <br class=\"clearfix\" />\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"footer\">\n");
      out.write("            &copy; 2012 Untitled | Design by <a href=\"http://www.freecsstemplates.org/\">ARINDAM</a> | Images by <a href=\"http://fotogrph.com/\">Arindam</a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("   \n");
      out.write("</body>\n");
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
