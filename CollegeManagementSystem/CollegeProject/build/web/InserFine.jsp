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
			<li><a href="FinanceHome.jsp"">FINANCE MANAGEMENT</a></li>
                        <li><a href="#"></a></li>

                        <li><a href="index.jsp"">LOGOUT</a></li>
			<li><a href="#"></a></li>
			<li><a href="#"></a></li>
			<li class="last"><a href="#"></a></li>
		</ul>
	</div>
	<div id="banner"><img src="css/images/pics01.jpg" width="1000" height="361" alt="" /></div>
        <div id="column2">
            <table align="center" bgcolor="lightgray">
                <tr><td><h1>INSERT FINE </h1></td></tr>
                     </table>
                     <%@taglib uri="/WEB-INF/struts-html.tld" prefix="h"%>
                     <h:form action="InsertFine">
                     <table align ="center">
                     <tr><td class="test1">STUDENT_ID:<h:text size="20" property="studid" /></td></tr>
                     <tr><td class="test1">AMOUNT:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<h:text size="20" property="amount" /></td></tr>
                     <tr><td class="test1">TYPE OF FINE:<h:radio property="type" value="dress fine"/>DRESS FINE<h:radio property="type" value="late fee"/>LATE FEE FINE<h:radio property="type" value="late registeration"/>LATE REGISTERATION<h:radio property="type" value="discipline fine"/>DISCIPLINE FINE</td></tr>
                     <tr><td class="test1"><h:submit property="submit" value="submit" /></td></tr><br>
                     <tr><td class="test1" bgcolor="cyan"><i>${requestScope.msg}</i></td></tr>
                     </table>
                     </h:form>

		</div>
         </div>
</body>
</html>