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
 <%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="h" %>
<s:setDataSource driver="com.mysql.jdbc.Driver"
                 url="jdbc:mysql://localhost:3306/project"
                 user="root" password=""/>

<s:query var="rs" sql="select *from library"/>
<table width="300" align="center" bgcolor="lightgray" border="1" align="left">
    <tr>
        <th>BOOK ID</th>
        <th>BOOK NAME</th>
        <th>ISSUED</th>
        <th>BRANCH</th>
    </tr>
    <c:forEach var="data" items="${rs.rows}" varStatus="s">
    <c:if test="${s.count%2 == 0}">
    <tr bgcolor="white">
        <td>${data.BookId}</td>
        <td>${data.BookName}</td>
        <td>${data.Issued}</td>
        <td>${data.Branch}</td>
        <td>
           <a href="DeleteBook.do?cid=${data.BookId}">Delete</a></td>
     </tr>
    </c:if>
    <c:if test="${s.count%2 != 0}">
    <tr>
        <td>${data.BookId}</td>
        <td>${data.BookName}</td>
         <td>${data.Issued}</td>
        <td>${data.Branch}</td>
        <td>
            <a href="DeleteBook.do?cid=${data.BookId}">Delete</a>
        </td>
     </tr>
    </c:if>
    </c:forEach>
        <h:form action="AddBook">
    <tr>
        <td><h:text property="id"/></td>
        <td><h:text property="name"/></td>
        <td><h:text property="issue"/></td>
        <td><h:text property="branch"/></td>
        <td><h:submit value="Add"/></td>
     </tr>
    </h:form>
   </table>
         </div>
</body>
</html>