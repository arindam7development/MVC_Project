<%--
    Document   : FacultyHomePage
    Created on : 26 Nov, 2012, 9:11:07 AM
    Author     : Sony
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
	       <h2 class="title"><a href="#">WELCOME TO THE MARKS SECTION</a></h2>
               <%@taglib uri="/WEB-INF/struts-html.tld" prefix="h"%>
               <h:form action="branch_valid">
               <table class="b" border ="10" cellpadding="5" cellspacing="5" align="center" title="ENTER SPECIFIC DETAILS"  >
               <tr><td>ENTER YOUR ID</td><td><h:text size="20" property="fid" /></td>
               <tr><td>ENTER SUB ID</td><td><h:text size="20" property="subid" /></td>
               <tr><td>ENTER THE BRANCH</td><td><h:radio property="branch" value="IT"/>IT<h:radio property="branch" value="CSE"/>CS<h:radio property="branch" value="ME"/>ME<h:radio property="branch" value="ECE"/>ECE</td></tr>
               <tr><td>ENTER THE YEAR</td><td><h:radio property="year" value="1"/>1st<h:radio property="year" value="2"/>2nd<h:radio property="year" value="3"/>3rd<h:radio property="year" value="4"/>4th</td></tr>
              </table>
              <table class="b" align="center" title="SUBMIT" >
               <tr><td class="test1" align="center"><h:submit property="submit" value="submit" /></td></tr>
               <tr><td class="test1"><i>${requestScope.msge}</i></td></tr>
               </table>
               </h:form>
	</div>
	 <div id="three-columns">

	 </div>
         </div>
          <h1></h1>
    </body>
</html>
