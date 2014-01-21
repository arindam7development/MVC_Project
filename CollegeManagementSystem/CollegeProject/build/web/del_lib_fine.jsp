<%--
    Document   : Library
    Created on : 25 Nov, 2012, 8:45:47 PM
    Author     : Chandan
--%>

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
			<li class="current_page_item"><a href="#"></a></li>
			<li><a href="#"></a></li>
			<li><a href="Library.jsp"">WELCOME</a></li>
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
        String q="select * from bookissued where BookId='"+request.getAttribute("bid")+"';";
        ResultSet st=Databa.dbdet.selectData(q);
        %>
<table width="300" align="center" bgcolor="lightgray" border="1" align="left">
    <tr>
        <th>COLLEGE ID</th>
        <th>BOOK ID</th>
        <th>ISSUE DATE</th>
        <th>RETURN DATE</th>
        <th>FINE</th>

    </tr>
    <%
    while(st.next())
    {
        %>

    <tr bgcolor="white">
        <td><%=st.getString(1)%></td>
        <td><%=st.getString(2)%></td>
        <td><%=st.getString(3)%></td>
        <td><%=st.getString(4)%></td>
        <td><%=st.getString(5)%></td>
        <td>
           <a href="del_fine.do?dell=${bid}">Delete</a></td>
     
     </tr>
     <%
    }
        %>
        
   </table>
        <table align="center">
        <tr>
            <td><a href="Library.jsp">home page</a></td>
        </tr>
        </table>
         </div>
</body>
</html>
