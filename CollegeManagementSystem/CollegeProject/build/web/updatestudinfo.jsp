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
			<li><a href="StudentHomePage.jsp"">WELCOME</a></li>
                        <li><a href="#"></a></li>

                        <li><a href="index.jsp"">LOGOUT</a></li>
			<li><a href="#"></a></li>
			<li><a href="#"></a></li>
			<li class="last"><a href="#"></a></li>
		</ul>
	</div>

	<div id="banner"><img src="css/images/pics01.jpg" width="1000" height="361" alt="" /></div>
         <%@taglib uri="/WEB-INF/struts-html.tld" prefix="h"%>
              <table>
                    <tr><td><h1>UPDATE INFORMATION</h1></td></tr>
                </table>
			<h:form action="UpdateStudDetail">
                        <table width="800" height="300" bgcolor="LightGray">
                            <tr><td>NAME:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<h:text property="sname" size="30" /></td>
                                <td>USER NAME:<h:text property="uname" size="30"/></td></tr>
                                <tr><td>PASSWORD:<h:password property="pass" size="31" /></td>
                                <td>BRANCH:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<h:text property="br" size="30"/></td></tr>
                                <tr><td>YEAR:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<h:text property="ye" size="30"/></td>
                                <td>FATHER'S NAME:<h:text property="fname" size="25"/></td></tr>
                                <tr><td>Email Id:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<h:text property="eid" size="30"/></td>
                                <td>ADDRESS:&nbsp;&nbsp;&nbsp;&nbsp;<h:textarea rows="4" cols="25" property="add"/></td></tr>
                                <tr><td>PHONE NUMBER:<h:text property="cno" size="25"/></td>
                                <td>BLOOD GROUP:<h:text property="bgroup" size="27"/></td></tr>
                                <tr><td>GENDER:<h:radio property="geno" value="male"/> Male <h:radio property="geno" value="female"/>Female</td>
                                <td>Date Of Birth:<h:text property="dob" />yyyy/mm/dd</td></tr>
                                <tr><td>Click Here To Submit</td><td>
                                <h:submit property="submit" value="submit" /></td></tr>
                            </table>
                        </h:form>
        </div>
        </html>

