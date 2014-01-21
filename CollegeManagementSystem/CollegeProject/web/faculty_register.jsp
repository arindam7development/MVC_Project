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
			<li><a href="AdminHomePage.jsp"">ADMIN</a></li>
                        <li><a href="#"></a></li>

                        <li><a href="index.jsp"">LOGOUT</a></li>
			<li><a href="#"></a></li>
			<li><a href="#"></a></li>
			<li class="last"><a href="#"></a></li>
		</ul>
	</div>
	<div id="banner"><img src="css/images/pics01.jpg" width="1000" height="361" alt="" /></div>
        <div id="column2">
           
                     <%@taglib uri="/WEB-INF/struts-html.tld" prefix="h"%>
                      <table align="center">
                    <tr><td><h1>REGISTERATION PAGE</h1></td></tr>
                     </table>
			<h:form action="FacultyRegister">
                            <table bgcolor="LightGray" align="center">
                                <tr><td>NAME</td><td><h:text property="faculty_Name" size="30" /></td></tr>
                                <tr><td>FACULTY I.D.</td><td><h:text property="ffaculty_id" size="30" /></td></tr>
                                <tr><td>USER NAME</td><td><h:text property="fuser_Name" size="30" /></td></tr>
                                <tr><td>PASSWORD</td><td><h:password property="fpassword" size="31.5" /></td></tr>
                                <tr><td>EMAIL ID</td><td><h:text property="emailid" size="30" /></td></tr>
                                <tr><td>DESIGNATION</td><td><h:radio property="fdesig" value="faculty" />FACULTY<h:radio property="fdesig" value="librarian" />LIBRARIAN<h:radio property="fdesig" value="accountant" />ACCOUNTANT</td></tr>
                                <tr><td>BRANCH</td><td><h:text property="fbranch" size="30"/></td></tr>
                                <tr><td>FATHER'S NAME</td><td><h:text property="ffathers_Name" size="30"  /></td></tr>
                                <tr><td>ADDRESS</td><td><h:textarea property="faddress" rows="4" cols="25" /></td></tr>
                                <tr><td>PHONE NUMBER</td><td><h:text property="fphone_No" size="30"/></td></tr>
                                <tr><td>GENDER</td><td><h:radio property="gen" value="male" />Male<h:radio property="gen" value="female" />Female</td></tr>
                                <tr><td>DATE OF BIRTH</td><td><h:text property="fdob" size="30" />yyyy/mm/dd</td></tr>
                                <tr><td>BLOOD GROUP</td><td><h:text property="fbg" size="30" /></td></tr>
                                <tr><td>Click Here To Submit</td><td>
                                <h:submit property="submit" value="submit" /></td></tr>
                            </table>
                        </h:form>
		</div>
	</div>
         </html>