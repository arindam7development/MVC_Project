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
			<h1><a href="#">D.I.T. DEHRADUN</a></h1>

		</div>
	</div>
             <div id="menu">
		<ul>
			<li class="current_page_item"><a href="#"></a></li>
			<li><a href="#"></a></li>
			<li><a href="Library.jsp"">LIBRARY MANAGEMENT</a></li>
                        <li><a href="#"></a></li>

                        <li><a href="index.jsp"">LOGOUT</a></li>
			<li><a href="#"></a></li>
			<li><a href="#"></a></li>
			<li class="last"><a href="#"></a></li>
		</ul>
	</div>
	<div id="banner"><img src="css/images/pics01.jpg" width="1000" height="361" alt="" /></div>
        <%
String que1=(String)session.getAttribute("que1");
ResultSet r2=Databa.dbdet.selectData(que1);
int count=Integer.parseInt(session.getAttribute("count1").toString());
%>

      <%if(count!=0) {%>

        <table align="center" border="3" bgcolor="lightgray">
            <tr><th>BOOK_ID</th><th>BOOK_NAME</th><th>BRANCH</th><th>ISSUED</th></tr>
            <% for(int i=1;i<=count;i++)

            {
                r2.next();
            %>
            <tr><td><%=r2.getString(1)%></td><td><%=r2.getString(2)%></td><td><%=r2.getString(4)%></td><td><%=r2.getString(3)%></td></tr>
       <%}%>
        </table>
         <%}%>
         </div>
</body>
</html>
