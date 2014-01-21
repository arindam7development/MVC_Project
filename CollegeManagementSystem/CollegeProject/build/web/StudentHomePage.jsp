<%-- 
    Document   : StudentHomePage
    Created on : 26 Nov, 2012, 9:08:24 AM
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
			<li class="current_page_item"><a href="StudentHomePage.jsp">WELCOME </a></li>
			<li><a href="#"></a></li>
			<li><a href="#"></a></li>
			<li><a href="#"></a></li>
			<li><a href="#"></a></li>
			<li class="last"><a href="index.jsp">Logout</a></li>
		</ul>
	</div>
	<div id="banner"><img src="css/images/pics01.jpg" width="1000" height="361" alt="" /></div>
	<div id="welcome">
            <%
                        String userid=(String)session.getAttribute("stud_id");
                        String username=(String)session.getAttribute("stu_name");
                       %>
                       <h2 class="title"><a href="#">WELCOME <%=username%></a></h2>
		<div class="entry">
                   <ul type="circle">
                       
     
             <li class="test3"><a href="UpdateStudDetail.jsp">Update your personal details</a></li>
            <li class="test2"><a href="StudentLibrary.jsp">Check your Library Books Status</a></li>
            <li class="test2"><a href="check_attendance.jsp">Check your Attendance Percentage</a></li>
            <li class="test2"><a href="Fee_Display.jsp">Check your Fee Details</a></li>
            <li class="test2"><a href="Fine_Display.jsp">Check your Fine Details</a></li>
            <li class="test2"><a href="checkmarks.jsp">Check your Marks</a></li>


        </ul>
		</div>
	</div>
	<div id="three-columns">

	</div>
         </div>


        <h1></h1>
    </body>
</html>


