<%--
    Document   : index
    Created on : 24 Nov, 2012, 9:58:41 PM
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
			<li><a href="stud_login.jsp">User_Login</a></li>
			<li><a href="faculty_login.jsp">Admin</a></li>
			<li><a href="Complain.jsp">Complaint</a></li>
			<li class="last"><a href="contact.jsp">Contact</a></li>
		</ul>
	</div>
	<div id="banner"><img src="css/images/pics01.jpg" width="1000" height="361" alt="" /></div>
        	<div id="column2">
                    <table align="center"><tr><td><h2>Enter Your Complain</h2></td></tr>
                    </table>
                        <%@taglib uri="/WEB-INF/struts-html.tld" prefix="h"%>
                        <h:form action="ComplainPage">
                     <table align ="center">
                     <tr><td class="test1"><<h:textarea rows="20" cols="40" property="add" /></td></tr>><br>
                     <tr><td class="test1"><h:submit property="submit" value="submit" /></td></tr>
                     <tr><td class="test1" bgcolor="lightgray"><i>${requestScope.msg}</i></td></tr>
                     </table>

        </h:form>

		</div>

	</div>
         </div>
</body>
</html>
