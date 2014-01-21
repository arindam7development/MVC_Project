package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import java.sql.ResultSet;

public final class marks2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_setDataSource_user_url_password_driver_nobody;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_setDataSource_user_url_password_driver_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_setDataSource_user_url_password_driver_nobody.release();
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
      if (_jspx_meth_s_setDataSource_0(_jspx_page_context))
        return;
      out.write('\n');

String bran=session.getAttribute("branch").toString();
String ye=session.getAttribute("year").toString();
String side=session.getAttribute("sid").toString();
String sql="select * from marks_table where branch='"+bran+"' and Year='"+ye+"' and sub_id='"+side+"';";
Connection con=Databa.dbdet.getConnection();
ResultSet rs=Databa.dbdet.selectData(sql);

      out.write("\n");
      out.write("         \n");
      out.write("               <table class=\"b\" border =\"10\" cellpadding=\"5\" cellspacing=\"5\" align=\"center\" title=\"ENTER MARKS\">\n");
      out.write("               <tr><th>STUDENT NAME</th><th>College_id</th><th>branch</th><th>1st SESSIONAL</th><th>2nd SESSIONAL</th><th>TEST1</th><th>TEST2</th><th>TEST3</th></tr>\n");
      out.write("               ");

               while(rs.next())
                   {
                   
      out.write("\n");
      out.write("               <tr bgcolor=\"white\">\n");
      out.write("               <td>");
      out.print(rs.getString("stuname"));
      out.write("</td>\n");
      out.write("               <td>");
      out.print(rs.getString("College_id"));
      out.write("</td>\n");
      out.write("               ");
 String pu=rs.getString("College_id");
               request.setAttribute("ide",pu);
                
      out.write("\n");
      out.write("               <td>");
      out.print(rs.getString("branch"));
      out.write("</td>\n");
      out.write("               <td>");
      out.print(rs.getString("sessional_1"));
      out.write("</td>\n");
      out.write("               <td>");
      out.print(rs.getString("sessional_2"));
      out.write("</td>\n");
      out.write("               <td>");
      out.print(rs.getString("test_1"));
      out.write("</td>\n");
      out.write("               <td>");
      out.print(rs.getString("test_2"));
      out.write("</td>\n");
      out.write("               <td>");
      out.print(rs.getString("test_3"));
      out.write("</td>\n");
      out.write("               <td><a href=\"updatemarks123.do?cid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ide}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&cbd=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${branch}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&pid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${year}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&pop=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">update</a></td>\n");
      out.write("               </tr>\n");
      out.write("               ");

                }
               
      out.write("\n");
      out.write("               </table>\n");
      out.write("               </div>\n");
      out.write("\t <div id=\"three-columns\">\n");
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

  private boolean _jspx_meth_s_setDataSource_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_s_setDataSource_0 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _jspx_tagPool_s_setDataSource_user_url_password_driver_nobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_s_setDataSource_0.setPageContext(_jspx_page_context);
    _jspx_th_s_setDataSource_0.setParent(null);
    _jspx_th_s_setDataSource_0.setDriver("com.mysql.jdbc.Driver");
    _jspx_th_s_setDataSource_0.setUrl("jdbc:mysql://localhost:3306/project");
    _jspx_th_s_setDataSource_0.setUser("root");
    _jspx_th_s_setDataSource_0.setPassword("");
    int _jspx_eval_s_setDataSource_0 = _jspx_th_s_setDataSource_0.doStartTag();
    if (_jspx_th_s_setDataSource_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_setDataSource_user_url_password_driver_nobody.reuse(_jspx_th_s_setDataSource_0);
      return true;
    }
    _jspx_tagPool_s_setDataSource_user_url_password_driver_nobody.reuse(_jspx_th_s_setDataSource_0);
    return false;
  }
}
