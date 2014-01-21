<%--
    Document   : FacultyHomePage
    Created on : 26 Nov, 2012, 9:11:07 AM
    Author     : Sony
--%>

<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <meta name="keywords" content="" />
        <meta name="description" content="" />


        <title>College Faculty,Student and Book System Management</title>
         <link rel="stylesheet" type="text/css" href="css/style.css" />
    </head>
    <body>
         <marquee behavior="scroll" direction="left"><img src="css/images/dit.jpg" width="100" height="100" alt="WELCOME TO D.I.T.DEHRADUN"/></marquee>
         <div id="wrapper">
	<div id="header">
		<div id="logo">
			<h1><a href="#">D.I.T. MANAGEMENT SYSTEM</a></h1>

		</div>
	</div>
             <div id="menu">
		<ul>
			<li class="current_page_item"><a href="FacultyHomePage.jsp">WELCOME</a></li>
			<li><a href="#"></a></li>
			<li><a href="#"></a></li>
			<li><a href="#"></a></li>
			<li><a href="#"></a></li>
			<li class="last"><a href="index.jsp">Logout</a></li>
		</ul>
	</div>
	<div id="banner"><img src="css/images/pics01.jpg" width="1000" height="361" alt="" /></div>
	<div id="welcome">
             <%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="h" %>
<s:setDataSource driver="com.mysql.jdbc.Driver"
                 url="jdbc:mysql://localhost:3306/project"
                 user="root" password=""/>
<%
String bran=session.getAttribute("branch").toString();
String ye=session.getAttribute("year").toString();
String side=session.getAttribute("sid").toString();
String sql="select * from marks_table where branch='"+bran+"' and Year='"+ye+"' and sub_id='"+side+"';";
Connection con=Databa.dbdet.getConnection();
ResultSet rs=Databa.dbdet.selectData(sql);
%>
         
               <table class="b" border ="10" cellpadding="5" cellspacing="5" align="center" title="ENTER MARKS">
               <tr><th>STUDENT NAME</th><th>College_id</th><th>branch</th><th>1st SESSIONAL</th><th>2nd SESSIONAL</th><th>TEST1</th><th>TEST2</th><th>TEST3</th></tr>
               <%
               while(rs.next())
                   {
                   %>
               <tr bgcolor="white">
               <td><%=rs.getString("stuname")%></td>
               <td><%=rs.getString("College_id")%></td>
               <% String pu=rs.getString("College_id");
               request.setAttribute("ide",pu);
                %>
               <td><%=rs.getString("branch")%></td>
               <td><%=rs.getString("sessional_1")%></td>
               <td><%=rs.getString("sessional_2")%></td>
               <td><%=rs.getString("test_1")%></td>
               <td><%=rs.getString("test_2")%></td>
               <td><%=rs.getString("test_3")%></td>
               <td><a href="updatemarks123.do?cid=${ide}&cbd=${branch}&pid=${year}&pop=${sid}">update</a></td>
               </tr>
               <%
                }
               %>
               </table>
               </div>
	 <div id="three-columns">

	 </div>
         </div>
    </body>
</html>
