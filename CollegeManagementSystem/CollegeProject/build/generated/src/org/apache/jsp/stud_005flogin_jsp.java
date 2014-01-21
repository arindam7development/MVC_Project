package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class stud_005flogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_form_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_radio_value_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_text_value_size_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_password_size_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_submit_value_property_nobody;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_h_form_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_radio_value_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_text_value_size_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_password_size_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_submit_value_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_h_form_action.release();
    _jspx_tagPool_h_radio_value_property_nobody.release();
    _jspx_tagPool_h_text_value_size_property_nobody.release();
    _jspx_tagPool_h_password_size_property_nobody.release();
    _jspx_tagPool_h_submit_value_property_nobody.release();
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
      out.write("\t\t\t<li><a href=\"stud_login.jsp\"\">User_Login</a></li>\n");
      out.write("\t\t\t<li><a href=\"faculty_login.jsp\">Admin</a></li>\n");
      out.write("\t\t\t<li><a href=\"Complain.jsp\">Complaint</a></li>\n");
      out.write("\t\t\t<li class=\"last\"><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"banner\"><img src=\"css/images/pics01.jpg\" width=\"1000\" height=\"361\" alt=\"\" /></div>\n");
      out.write("\n");
      out.write("\t<div id=\"three-columns\">\n");
      out.write("             <div id=\"column1\">\n");
      out.write("\t\t\t<h2></h2>\n");
      out.write("\t\t\t<p></p>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div id=\"column2\">\n");
      out.write("\t\t\t<h2>USER'S LOGIN</h2>\n");
      out.write("                        \n");
      out.write("                        ");
      if (_jspx_meth_h_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("         </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <h1></h1>\n");
      out.write("      \n");
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

  private boolean _jspx_meth_h_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:form
    org.apache.struts.taglib.html.FormTag _jspx_th_h_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_h_form_action.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_h_form_0.setPageContext(_jspx_page_context);
    _jspx_th_h_form_0.setParent(null);
    _jspx_th_h_form_0.setAction("StudentAuthen");
    int _jspx_eval_h_form_0 = _jspx_th_h_form_0.doStartTag();
    if (_jspx_eval_h_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                     <table align =\"center\" bgcolor=\"lightgray\">\n");
        out.write("                     <tr><td>");
        if (_jspx_meth_h_radio_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("STUDENT");
        if (_jspx_meth_h_radio_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("FACULTY");
        if (_jspx_meth_h_radio_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("LIBRARIAN</td></tr>\n");
        out.write("                     <tr><td class=\"test1\">NAME&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
        if (_jspx_meth_h_text_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("<br>\n");
        out.write("                     <tr><td class=\"test1\">PASSWORD&nbsp;&nbsp;&nbsp;&nbsp;");
        if (_jspx_meth_h_password_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("<br>\n");
        out.write("                     <tr><td class=\"test1\">");
        if (_jspx_meth_h_submit_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("</td></tr>\n");
        out.write("                     <tr><td class=\"test1\"><a href=\"stud_register.jsp\">click here for new registration </a></td></tr>\n");
        out.write("                     <tr><td class=\"test1\" bgcolor=\"red\"><i>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</i></td></tr>\n");
        out.write("                     </table>\n");
        out.write("\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_h_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_h_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_form_action.reuse(_jspx_th_h_form_0);
      return true;
    }
    _jspx_tagPool_h_form_action.reuse(_jspx_th_h_form_0);
    return false;
  }

  private boolean _jspx_meth_h_radio_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:radio
    org.apache.struts.taglib.html.RadioTag _jspx_th_h_radio_0 = (org.apache.struts.taglib.html.RadioTag) _jspx_tagPool_h_radio_value_property_nobody.get(org.apache.struts.taglib.html.RadioTag.class);
    _jspx_th_h_radio_0.setPageContext(_jspx_page_context);
    _jspx_th_h_radio_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_radio_0.setProperty("gen");
    _jspx_th_h_radio_0.setValue("student");
    int _jspx_eval_h_radio_0 = _jspx_th_h_radio_0.doStartTag();
    if (_jspx_th_h_radio_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_radio_value_property_nobody.reuse(_jspx_th_h_radio_0);
      return true;
    }
    _jspx_tagPool_h_radio_value_property_nobody.reuse(_jspx_th_h_radio_0);
    return false;
  }

  private boolean _jspx_meth_h_radio_1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:radio
    org.apache.struts.taglib.html.RadioTag _jspx_th_h_radio_1 = (org.apache.struts.taglib.html.RadioTag) _jspx_tagPool_h_radio_value_property_nobody.get(org.apache.struts.taglib.html.RadioTag.class);
    _jspx_th_h_radio_1.setPageContext(_jspx_page_context);
    _jspx_th_h_radio_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_radio_1.setProperty("gen");
    _jspx_th_h_radio_1.setValue("faculty");
    int _jspx_eval_h_radio_1 = _jspx_th_h_radio_1.doStartTag();
    if (_jspx_th_h_radio_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_radio_value_property_nobody.reuse(_jspx_th_h_radio_1);
      return true;
    }
    _jspx_tagPool_h_radio_value_property_nobody.reuse(_jspx_th_h_radio_1);
    return false;
  }

  private boolean _jspx_meth_h_radio_2(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:radio
    org.apache.struts.taglib.html.RadioTag _jspx_th_h_radio_2 = (org.apache.struts.taglib.html.RadioTag) _jspx_tagPool_h_radio_value_property_nobody.get(org.apache.struts.taglib.html.RadioTag.class);
    _jspx_th_h_radio_2.setPageContext(_jspx_page_context);
    _jspx_th_h_radio_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_radio_2.setProperty("gen");
    _jspx_th_h_radio_2.setValue("library");
    int _jspx_eval_h_radio_2 = _jspx_th_h_radio_2.doStartTag();
    if (_jspx_th_h_radio_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_radio_value_property_nobody.reuse(_jspx_th_h_radio_2);
      return true;
    }
    _jspx_tagPool_h_radio_value_property_nobody.reuse(_jspx_th_h_radio_2);
    return false;
  }

  private boolean _jspx_meth_h_text_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:text
    org.apache.struts.taglib.html.TextTag _jspx_th_h_text_0 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_h_text_value_size_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_h_text_0.setPageContext(_jspx_page_context);
    _jspx_th_h_text_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_text_0.setSize("20");
    _jspx_th_h_text_0.setProperty("studname");
    _jspx_th_h_text_0.setValue("hello");
    int _jspx_eval_h_text_0 = _jspx_th_h_text_0.doStartTag();
    if (_jspx_th_h_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_text_value_size_property_nobody.reuse(_jspx_th_h_text_0);
      return true;
    }
    _jspx_tagPool_h_text_value_size_property_nobody.reuse(_jspx_th_h_text_0);
    return false;
  }

  private boolean _jspx_meth_h_password_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:password
    org.apache.struts.taglib.html.PasswordTag _jspx_th_h_password_0 = (org.apache.struts.taglib.html.PasswordTag) _jspx_tagPool_h_password_size_property_nobody.get(org.apache.struts.taglib.html.PasswordTag.class);
    _jspx_th_h_password_0.setPageContext(_jspx_page_context);
    _jspx_th_h_password_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_password_0.setSize("21");
    _jspx_th_h_password_0.setProperty("password");
    int _jspx_eval_h_password_0 = _jspx_th_h_password_0.doStartTag();
    if (_jspx_th_h_password_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_password_size_property_nobody.reuse(_jspx_th_h_password_0);
      return true;
    }
    _jspx_tagPool_h_password_size_property_nobody.reuse(_jspx_th_h_password_0);
    return false;
  }

  private boolean _jspx_meth_h_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_h_submit_0 = (org.apache.struts.taglib.html.SubmitTag) _jspx_tagPool_h_submit_value_property_nobody.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_h_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_h_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_submit_0.setProperty("submit");
    _jspx_th_h_submit_0.setValue("submit");
    int _jspx_eval_h_submit_0 = _jspx_th_h_submit_0.doStartTag();
    if (_jspx_th_h_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_submit_value_property_nobody.reuse(_jspx_th_h_submit_0);
      return true;
    }
    _jspx_tagPool_h_submit_value_property_nobody.reuse(_jspx_th_h_submit_0);
    return false;
  }
}
