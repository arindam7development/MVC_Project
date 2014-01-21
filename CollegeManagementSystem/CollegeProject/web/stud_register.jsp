<%--
    Document   : StudentRegistration
    Created on : 24 Nov, 2012, 11:15:54 PM
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
			<h1><a href="#">D.I.T. MANGEMENT SYSTEM</a></h1>

		</div>
	</div>
             <div id="menu">
		<ul>
			<li class="current_page_item"><a href="index.jsp">Home</a></li>
			<li><a href="AboutUs.jsp">About Us</a></li>
			<li><a href="stud_login.jsp"">User_login</a></li>
			<li><a href="faculty_login.jsp">Admin</a></li>
			<li><a href="Complain.jsp">Complaint</a></li>
			<li class="last"><a href="contact.jsp">Contact</a></li>
		</ul>
	</div>
	<div id="banner"><img src="css/images/pics01.jpg" width="1000" height="361" alt="" /></div>
	<div id="welcome">
            <div class="entry">
                <%@taglib uri="/WEB-INF/struts-html.tld" prefix="h"%>
                <table>
                    <tr><td><h1>REGISTERATION PAGE</h1></td></tr>
                </table>
			<h:form action="StudentDetail">
                            <table bgcolor="LightGray">


                                <tr><td>NAME</td><td><h:text property="stu_Name" size="30" /></td></tr>
                                <tr><td>USER NAME</td><td><h:text property="user_Name" size="30"/></td></tr>
                                <tr><td>PASSWORD</td><td><h:password property="password" size="31" /></td></tr>
                                <tr><td>BRANCH</td><td><h:text property="branch" size="30"/></td></tr>
                                <tr><td>YEAR</td><td><h:text property="year" size="30"/></td></tr>
                                <tr><td>COLLEGE I.D.</td><td><h:text property="college_id" size="30"/></td></tr>
                                <tr><td>FATHER'S NAME</td><td><h:text property="fathers_Name" size="30"/></td></tr>
                                <tr><td>Email Id</td><td><h:text property="email_id" size="30"/></td></tr>
                                <tr><td>ADDRESS</td><td><h:textarea rows="4" cols="25" property="address"/></td></tr>
                                <tr><td>PHONE NUMBER</td><td><h:text property="contact_No" size="30"/></td></tr>
                                <tr><td>BLOOD GROUP</td><td><h:text property="blood_Group" size="30"/></td></tr>
                                <tr><td>GENDER</td><td><h:radio property="gen" value="male"/> Male <h:radio property="gen" value="female"/>Female</td></tr>
                                <tr><td>Date Of Birth</td><td><h:text property="d_O_B" />yyyy/mm/dd</td></tr>
                                <tr><td>Click Here To Submit</td><td>
                                <h:submit property="submit" value="submit" /></td></tr>
                            </table>
                        </h:form>
        </div>
        </html>