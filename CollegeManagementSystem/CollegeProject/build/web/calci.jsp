<%-- 
    Document   : calci
    Created on : 7 Mar, 2013, 4:48:48 PM
    Author     : Sony
--%>

<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
    </body>
     <%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="h" %>
<s:setDataSource driver="com.mysql.jdbc.Driver"
                 url="jdbc:mysql://localhost:3306/project"
                 user="root" password=""/>
    <%
  String studid=(String)session.getAttribute("stid");
  String yee=(String)session.getAttribute("year");
  String bran=(String)session.getAttribute("branch");
  String subj=(String)session.getAttribute("subid");
  String p1=(String)request.getAttribute("s1");
  String p2=(String)request.getAttribute("s2");
  String q1=(String)request.getAttribute("t1");
  String q2=(String)request.getAttribute("t2");
  String q3=(String)request.getAttribute("t3");
  String p3=(String)request.getAttribute("s3");
  String q4=(String)request.getAttribute("t4");
  String q5=(String)request.getAttribute("t5");
  int s1=Integer.parseInt(p1);
  int s2=Integer.parseInt(p2);
  int t1=Integer.parseInt(q1);
  int t2=Integer.parseInt(q2);
  int t3=Integer.parseInt(q3);
  int s3=Integer.parseInt(p3);
  int t4=Integer.parseInt(q4);
  int t5=Integer.parseInt(q5);
  int y=Integer.parseInt(yee);
  int m=0;
  Connection con=Databa.dbdet.getConnection();
  String query="update marks_table set sessional_1="+s1+",sessional_2="+s2+",sessional="+s3+",test_1="+t1+",test_2="+t2+",test_3="+t3+",test="+t4+",total="+t5+" where College_id='"+studid+"' and branch='"+bran+"' and Year="+y+" and sub_id='"+subj+"';";
  int updateData = Databa.dbdet.updateData(query);
  m=m+1;
    %>
 

    <% if(m==1)
        {
        %>
        <h1>entered successfully</h1>
        <a href="marks2.jsp"/>click here to go to marks page
        <% }%>
</html>
