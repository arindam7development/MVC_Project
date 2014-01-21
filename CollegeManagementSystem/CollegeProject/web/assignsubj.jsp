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
			<li><a href="AdminHomePage.jsp"">WELCOME</a></li>
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

<s:query var="rs" sql="select *from faculty_lecture"/>
<table width="300" align="center" bgcolor="lightgray" border="1" align="left">
    <tr>
        <th>FACULTY ID</th>
        <th>SUB ID</th>
        <th>YEAR</th>
        <th>BRANCH</th>
    </tr>
    <c:forEach var="data" items="${rs.rows}" varStatus="s">
    <c:if test="${s.count%2 == 0}">
    <tr bgcolor="white">
        <td>${data.Faculty_ID}</td>
        <td>${data.sub_id}</td>
        <td>${data.year}</td>
        <td>${data.branch}</td>
        <td>
           <a href="DeleteAssignSubj.do?code=${data.sub_id}">Delete</a></td>
     </tr>
    </c:if>
    <c:if test="${s.count%2 != 0}">
    <tr>
        <td>${data.Faculty_ID}</td>
        <td>${data.sub_id}</td>
        <td>${data.year}</td>
        <td>${data.branch}</td>
        <td>
            <a href="DeleteAssignSubj.do?code=${data.sub_id}">Delete</a>
        </td>
     </tr>
    </c:if>
    </c:forEach>
        <h:form action="AssignSubj">
    <tr>
        <td><h:text property="fid"/></td>
        <td><h:text property="sid"/></td>
        <td><h:text property="year"/></td>
        <td><h:text property="bran"/></td>
        <td><h:submit value="Add"/></td>
     </tr>
    </h:form>
   </table>
         </div>
</body>
</html>