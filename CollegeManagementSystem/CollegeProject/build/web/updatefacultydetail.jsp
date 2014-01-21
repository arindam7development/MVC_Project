<%--
    Document   : Library
    Created on : 25 Nov, 2012, 8:45:47 PM
    Author     : Chandan
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
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
			<li class="current_page_item"><a href="#"></a></li>
			<li><a href="#"></a></li>
			<li><a href="FacultyHomePage.jsp"">WELCOME</a></li>
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
        String cid=(String)session.getAttribute("fac_id");
        String query="select * from facultyrecord where Faculty_ID='"+cid+"';";
        Connection con=Databa.dbdet.getConnection();
        ResultSet rs=Databa.dbdet.selectData(query);
%>

<table width="500" align="center" bgcolor="lightgrey"">
    <%
    while(rs.next())
        {
        %>
    <tr>
        <td><b>FACULTY NAME</b></td>
        <td bgcolor="white"><%=rs.getString("Faculty_Name")%></td>
    </tr>
    <tr>
        <td><b>USER NAME</b></td>
        <td bgcolor="white"><%=rs.getString("FUser_Name")%></td>
    </tr>
    <tr>
        <td><b>PASSWORD</b></td>
        <td bgcolor="white"><%=rs.getString("FPassword")%></td>
    </tr>
     <tr>
        <td><b>EMAIL_ID</b></td>
        <td bgcolor="white"><%=rs.getString("FEmail_id")%></td>
    </tr>
     <tr>
        <td><b>FATHERS_NAME</b></td>
        <td bgcolor="white"><%=rs.getString("FFather_Name")%></td>
    </tr>
     <tr>
        <td><b>FACULTY_ID</b></td>
        <td bgcolor="white"><%=rs.getString("Faculty_ID")%></td>
    </tr>
     <tr>
        <td><b>BRANCH</b></td>
        <td bgcolor="white"><%=rs.getString("FBranch")%></td>
    </tr>
          <tr>
        <td><b>CONTACT_NO</b></td>
        <td bgcolor="white"><%=rs.getString("FPhone_No")%></td>
    </tr>
     <tr>
        <td><b>ADDRESS</b></td>
        <td bgcolor="white"><%=rs.getString("FAddress")%></td>
    </tr>
     <tr>
        <td><b>SEX</b></td>
        <td bgcolor="white"><%=rs.getString("FSex")%></td>
    </tr>
     <tr>
        <td><b>BLOOD_GROUP</b></td>
        <td bgcolor="white"><%=rs.getString("FBloodGroup")%></td>
    </tr>
     <tr>
        <td><b>D_O_B</b></td>
        <td bgcolor="white"><%=rs.getString("FD_O_B")%></td>
    </tr>
        <%
    }
        %>
</table>
<table align="center">
    <tr>
         <td align="right" bgcolor="white"><a href="upd_facinfo.jsp?sop=${fac_id}">update</a></td>
    </tr>
</table>

             </div>
</body>
</html>
