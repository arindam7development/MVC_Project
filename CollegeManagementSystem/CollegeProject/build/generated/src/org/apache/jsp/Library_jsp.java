package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Library_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("        <title>College Faculty,Student and Book System Management</title>\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <marquee behavior=\"scroll\" direction=\"left\"><img src=\"css/images/dit.jpg\" width=\"100\" height=\"100\" alt=\"WELCOME TO D.I.T.DEHRADUN\"/></marquee>\n");
      out.write("         <div id=\"wrapper\">\n");
      out.write("\t<div id=\"header\">\n");
      out.write("\t\t<div id=\"logo\">\n");
      out.write("\t\t\t<h1><a href=\"#\">D.I.T. DEHRADUN</a></h1>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("             <div id=\"menu\">\n");
      out.write("\t\t<ul>\n");
      out.write("\t\t\t<li class=\"current_page_item\"><a href=\"#\"></a></li>\n");
      out.write("\t\t\t<li><a href=\"#\"></a></li>\n");
      out.write("\t\t\t<li><a href=\"Library.jsp\"\">LIBRARY MANAGEMENT</a></li>\n");
      out.write("                        <li><a href=\"#\"></a></li>\n");
      out.write("                        \n");
      out.write("                        <li><a href=\"index.jsp\"\">LOGOUT</a></li>\n");
      out.write("\t\t\t<li><a href=\"#\"></a></li>\n");
      out.write("\t\t\t<li><a href=\"#\"></a></li>\n");
      out.write("\t\t\t<li class=\"last\"><a href=\"#\"></a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"banner\"><img src=\"css/images/pics01.jpg\" width=\"1000\" height=\"361\" alt=\"\" /></div>\n");
      out.write("\t<div id=\"welcome\">\n");
      out.write("\t\t<h2 class=\"title\"><a href=\"#\">WELCOME</a></h2>\n");
      out.write("\t\t<div class=\"entry\">\n");
      out.write("                   <ul type=\"circle\">\n");
      out.write("\n");
      out.write("            <li class=\"test2\"><a href=\"IssueBooks.jsp\">ISSUE BOOKS</a></li>\n");
      out.write("            <li class=\"test2\"><a href=\"BookReturn.jsp\">RETURN BOOK</a></li>\n");
      out.write("             <li class=\"test2\"><a href=\"AddRemBooks.jsp\">ADD/REMOVE BOOKS</a></li>\n");
      out.write("               <li class=\"test2\"><a href=\"BookList.jsp\">CHECK BOOK LIST</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"three-columns\">\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("         </div>\n");
      out.write("\n");
      out.write("\n");
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
