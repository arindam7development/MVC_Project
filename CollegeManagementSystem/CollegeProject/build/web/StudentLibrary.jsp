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
			<h1><a href="#">D.I.T. DEHRADUN</a></h1>

		</div>
	</div>
             <div id="menu">
		<ul>
			<li class="current_page_item"><a href="#"></a></li>
			<li><a href="#"></a></li>
			<li><a href="StudentHomePage.jsp"">HOME</a></li>
                        <li><a href="#"></a></li>

                        <li><a href="index.jsp"">LOGOUT</a></li>
			<li><a href="#"></a></li>
			<li><a href="#"></a></li>
			<li class="last"><a href="#"></a></li>
		</ul>
	</div>

	<div id="banner"><img src="css/images/pics01.jpg" width="1000" height="361" alt="" /></div>
         <%@taglib uri="/WEB-INF/struts-html.tld" prefix="h"%>
              <table align="center">
                    <tr><td><h1 align="center">BOOKS INFORMATION</h1></td></tr>
                </table>
<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="h" %>
<s:setDataSource driver="com.mysql.jdbc.Driver"
                 url="jdbc:mysql://localhost:3306/project"
                 user="root" password=""/>
  <%
        String userid=(String)session.getAttribute("stud_id");
        String query="select * from bookissued where College_id='"+userid+"';";
         Connection con=Databa.dbdet.getConnection();
         ResultSet st=Databa.dbdet.selectData(query);

      %>
        <table align="center" border="2">
            <tr>
                <th>BOOK_ID</th>
                <th>BOOK_NAME</th>
                <th>ISSUE_DATE</th>
                <th>RETURN_DATE</th>
                <th>FINE</th>
            </tr>
            <%
            while(st.next())
                {
                %>
               <tr bgcolor="white">
                   <td><%=st.getString("BookId")%></td>
                   <%
                   String query1="select BookName from library where BookId='"+st.getString("BookId")+"';";
                   ResultSet stu=Databa.dbdet.selectData(query1);
                   while(stu.next())
                      {
                 %>
                   <td><%=stu.getString("BookName")%></td>
                   <%
                   }
                   %>
                   <td><%=st.getString("IssueDate")%></td>
                   <td><%=st.getString("ReturnDate")%></td>
                   <td><%=st.getString("fine")%></td>
               </tr>
               <%
               }
               %>
        </table>
          </div>
</body>
</html>