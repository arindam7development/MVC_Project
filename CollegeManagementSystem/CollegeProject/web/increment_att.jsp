<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
             <%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="h" %>
    <%@ page import="java.sql.*;" %><form name="ak" action="update_att.jsp" method="get">
        <table align="center">
            <tr>
                <td>
                    <h2>WELCOME TO ATTENDENCE SECTION</h2>
                </td>
            </tr>
        </table>
        <%
        Calendar currentDate = Calendar.getInstance();
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy/M/dd");
        String datenow = formatter.format(currentDate.getTime());
        SimpleDateFormat formatter1= new SimpleDateFormat("EEE");
        String dayNow = formatter1.format(currentDate.getTime());

        %>
        <table align="center" cellpadding="5" cellspacing="5">
            <tr>
                <td>
                    <h3>DATE:<%=datenow%></h3>
                     <h3>DAY:<%=dayNow%></h3>
                </td>
            </tr>
        </table>
        <table class="b" border ="2" cellpadding="5" cellspacing="5" align="center">
            <th>STUDENT_NAME</th>
            <th>STUDENT_ID</th>
            <th>BRANCH</th>
            <th>YEAR</th>
            <th>MARK ATTENDANCE</th>

    <%try
    {
        Class.forName("com.mysql.jdbc.Driver");
    int i=1;

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from attendance");
session= request.getSession(true);
session.setAttribute("n",i );
%>
    <%
    while(rs.next())
    {
        %>

    <tr><td><%=rs.getString(1)%></td>
    <td><%=rs.getString(2)%></td>
    <td><%=rs.getString(3)%></td>
    <td><%=rs.getString(4)%></td>
    <td><input type="checkbox" name="attendance" value="<%=rs.getString(2)%>"></td></br></tr>
         <%i=i++;%>
    <%}%>

        </table> <%}catch(Exception e){out.println(e);}%><table align="center"><tr><td><input type="submit" value="submit" align="center"></td></tr></table> </form>
 <div id="three-columns">

	 </div>
         </div>
    </body>
</html>
