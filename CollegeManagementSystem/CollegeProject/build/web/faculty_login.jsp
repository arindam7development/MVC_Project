<%--
    Document   : Faculty
    Created on : 24 Nov, 2012, 11:29:43 PM
    Author     : ARINDAM
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
			<li class="current_page_item"><a href="index.jsp">Home</a></li>
			<li><a href="AboutUs.jsp">About Us</a></li>
			<li><a href="stud_login.jsp"">User_Login</a></li>
			<li><a href="faculty_login.jsp">Admin</a></li>
			<li><a href="Complain.jsp">Complaint</a></li>
			<li class="last"><a href="contact.jsp">Contact</a></li>
		</ul>
	</div>
	<div id="banner"><img src="css/images/pics01.jpg" width="1000" height="361" alt="" /></div>
	<div id="welcome">
		
                <div id="three-columns">
            <div id="column1">
			<h2></h2>
			<p></p>

		</div>

		<div id="column2">
			<h2>ADMIN LOGIN</h2>
			 <%@taglib uri="/WEB-INF/struts-html.tld" prefix="h"%>
                        <h:form action="FacultyAuthen">
                            <table align ="center" bgcolor="lightgray"><tr><td class="test1">ADMIN NAME<h:text size="30" property="facultyname" /><br>
                     <tr><td class="test1"> PASSWORD<h:password size="30" property="password" /><br>
                     <tr><td class="test1"><h:submit property="submit" value="submit" /></td></tr>
                      <tr><td class="test1" bgcolor="red"><i>${requestScope.msg}</i></td></tr>
        </table>

        </h:form>

		</div>

	</div>
         </div>


        <h1></h1>
    </body>
</html>