
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html> <%@ page import="java.sql.*;" %>
    <body>
        <%
        String sname[]=request.getParameterValues("attendance");
      
        %>

        <%
        try{
        Class.forName("com.mysql.jdbc.Driver");

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");

Statement st=con.createStatement();

ResultSet rs=st.executeQuery("select * from attendance");

session=request.getSession(true);

int i=0;
int per=0;
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
     int p=(ttp*100)/ttl;
     st1.executeUpdate("update attendance set percent="+p+" where Totall="+ttl+" and Totalp="+ttp+"");
    }

%>
<% }catch(Exception e)
               {
                System.out.println(e);
    }%>
    
    <h3>attendence entered successfully</h3>
    <a href="FacultyHomePage.jsp">click here to go to home page</a>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>



    </body>
</html>
