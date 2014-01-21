package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;;

public final class update_005fatt_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html> \n");
      out.write("    <body>\n");
      out.write("        ");

        String sname[]=request.getParameterValues("attendance");
      
        
      out.write("\n");
      out.write("\n");
      out.write("        ");

        try{
        Class.forName("com.mysql.jdbc.Driver");

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");

Statement st=con.createStatement();

ResultSet rs=st.executeQuery("select * from attendance");

session=request.getSession(true);

int i=0;
float per=0;
int o,m,n=0;
int q=0;
int k=0;
//String sname[]=request.getParameterValues("attendance");
//out.println(sname[0]);
//out.println(sname[1]);
//out.print("hello");
while(rs.next())
{
 n =Integer.parseInt(rs.getString(8));
 o=(n+1);
String l =rs.getString(2);
if(l.equals(sname[q])){
 Statement sto=con.createStatement();
 i=Integer.parseInt(rs.getString(7));
 m=(i+1);
 per=(m*100)/o;
  sto.executeUpdate("update attendance set Totall="+o+"");
  sto.executeUpdate("update attendance set Totalp="+m+" where College_id='"+l+"'");
  //sto.executeUpdate("update attendance set percent="+per+" where College_id='"+l+"'");
 ++q;
}
}
Statement st1=con.createStatement();
  ResultSet rs1=st1.executeQuery("select * from attendance");
  while(rs1.next())
    {
     int ttl =Integer.parseInt(rs1.getString(8));
     int ttp =Integer.parseInt(rs1.getString(7));
     float p=(ttp*100)/ttl;
     st1.executeUpdate("update attendance set percent="+p+" where Totall="+ttl+" and Totalp="+ttp+"");
    }


      out.write('\n');
 }catch(Exception e)
               {
                System.out.println(e);
    }
      out.write("\n");
      out.write("    \n");
      out.write("    <h3>attendence entered successfully</h3>\n");
      out.write("    <a href=\"FacultyHomePage.jsp\">click here to go to home page</a>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("\n");
      out.write("\n");
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
