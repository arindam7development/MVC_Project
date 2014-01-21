<%--
    Document   : StudentRegistration
    Created on : 24 Nov, 2012, 11:15:54 PM
    Author     : CHANDAN
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

	<div id="three-columns">
             <div id="column1">
			<h2></h2>
			<p></p>

		</div>

		<div id="column2">
			<h2>USER'S LOGIN</h2>
                        <%@taglib uri="/WEB-INF/struts-html.tld" prefix="h"%>
                        <h:form action="StudentAuthen">
                     <table align ="center" bgcolor="lightgray">
                     <tr><td><h:radio property="gen" value="student"/>STUDENT<h:radio property="gen" value="faculty"/>FACULTY<h:radio property="gen" value="library"/>LIBRARIAN<h:radio property="gen" value="accountant"/>ACCOUNTANT</td></tr>
                     <tr><td class="test1">NAME&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<h:text size="20" property="studname" /><br>
                     <tr><td class="test1">PASSWORD&nbsp;&nbsp;<h:password size="22" property="password" /><br>
                     <tr><td class="test1"><h:submit property="submit" value="submit" /></td></tr>
                     <tr><td class="test1"><a href="stud_register.jsp">click here for new registration </a></td></tr>
                     <tr><td class="test1" bgcolor="red"><i>${requestScope.msg}</i></td></tr>
                     </table>

        </h:form>

		</div>

	</div>
         </div>


        <h1></h1>
      
    </body>
</html>
