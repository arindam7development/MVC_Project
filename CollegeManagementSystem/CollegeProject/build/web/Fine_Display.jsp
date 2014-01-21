<%--
    Document   : Library
    Created on : 25 Nov, 2012, 8:45:47 PM
    Author     : Chandan
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
			<h1><a href="#">D.I.T. DEHRADUN</a></h1>

		</div>
	</div>
             <div id="menu">
		<ul>
			<li class="current_page_item"><a href="#"></a></li>
			<li><a href="#"></a></li>
			<li><a href="StudentHomePage.jsp">Home</a></li>
                        <li><a href="#"></a></li>

                        <li><a href="index.jsp"">LOGOUT</a></li>
			<li><a href="#"></a></li>
			<li><a href="#"></a></li>
			<li class="last"><a href="#"></a></li>
		</ul>
	</div>
	<div id="banner"><img src="css/images/pics01.jpg" width="1000" height="361" alt="" /></div>
        <%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="h" %>
<s:setDataSource driver="com.mysql.jdbc.Driver"
                 url="jdbc:mysql://localhost:3306/project"
                 user="root" password=""/>

        <%
        String userid=(String)session.getAttribute("stud_id");
        String sql="select * from stud_finance where College_id='"+userid+"';";
        Connection con=Databa.dbdet.getConnection();
        ResultSet rs=Databa.dbdet.selectData(sql);
        String stun="";
        %>
<table width="300" align="center" bgcolor="lightgray" border="1" align="left">
    <tr>
        <th>STUDENT_ID</th>
        <th>FINE</th>
        <th>TYPE</th>
        </tr>
        <% while(rs.next())
        {
        %>
        <tr bgcolor="white">
        <td><%=rs.getString("College_id")%></td>
        <td><%=rs.getString("col_fine")%></td>
        <td><%=rs.getString("type")%></td>
        </tr>
        <%
        }
        %>
   </table>
    </div>
    </body>
    </html>

