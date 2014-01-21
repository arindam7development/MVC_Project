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
        <%
        String id=(String)session.getAttribute("stid");
        String yr=(String)session.getAttribute("year");
        String br=(String)session.getAttribute("branch");
        String sd=(String)session.getAttribute("subid");
        request.setAttribute("id1",id);
        request.setAttribute("yr1",yr);
        request.setAttribute("br1",br);
        request.setAttribute("sd1",sd);
        %>
	<div id="banner"><img src="css/images/pics01.jpg" width="1000" height="361" alt="" /></div>
	<div id="welcome">
	       <h2 class="title"><a href="#">ENTER THE MARKS</a></h2>
               <%@taglib uri="/WEB-INF/struts-html.tld" prefix="h"%>
               <h:form action="entermarks">
               <table class="b" border ="10" cellpadding="5" cellspacing="5" align="center" title="ENTER SPECIFIC DETAILS"  >
                   <tr>
                       <th>Student_id</th><th>Sessional_1(60)</th><th>Sessional_2(60)</th><th>test_1(10)</th><th>test_2(10)</th><th>test_3(20)</th>
                   </tr>
               <tr>
               <td><%=id%></td>
               <td><h:text size="20" property="sess1"/></td>
               <td><h:text size="20" property="sess2" /></td>
               <td><h:text size="20" property="test1" /></td>
               <td><h:text size="20" property="test2" /></td>
               <td><h:text size="20" property="test3" /></td>
               <tr><td class="test1" align="center"><h:submit property="submit" value="submit" /></td></tr>
               </table>
              </h:form>
	</div>
	 <div id="three-columns">

	 </div>
         </div>
          <h1></h1>
    </body>
</html>