<%--
    Document   : Library
    Created on : 25 Nov, 2012, 8:45:47 PM
    Author     : Chandan
--%>

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
			<li><a href="AdminHomePage.jsp"">LIBRARY MANAGEMENT</a></li>
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

<s:query var="rs" sql="select *from complain"/>
<table width="300" align="center" bgcolor="lightgray" border="1" align="left">
    <tr>
        <th>COMPLAINT NO</th>
        <th>COMPLAIN</th>

    </tr>
    <c:forEach var="data" items="${rs.rows}" varStatus="s">
    <c:if test="${s.count%2 == 0}">
    <tr bgcolor="white">
        <td>${data.ComplainId}</td>
        <td>${data.Comp}</td>
        <td>
           <a href="DeleteComplain.do?del=${data.ComplainId}">Delete</a></td>
     </tr>
    </c:if>
    <c:if test="${s.count%2 != 0}">
    <tr>
        <td>${data.ComplainId}</td>
        <td>${data.Comp}</td>
        <td>
            <a href="DeleteComplain.do?del=${data.ComplainId}">Delete</a>
        </td>
     </tr>
    </c:if>
    </c:forEach>

   </table>
         </div>
</body>
</html>