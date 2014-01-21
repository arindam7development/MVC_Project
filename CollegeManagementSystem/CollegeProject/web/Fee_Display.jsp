<%--
    Document   : Library
    Created on : 25 Nov, 2012, 8:45:47 PM
    Author     : Chandan
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
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
			<li><a href="StudentHomePage.jsp"">WELCOME</a></li>
                        <li><a href="#"></a></li>

                        <li><a href="index.jsp"">LOGOUT</a></li>
			<li><a href="#"></a></li>
			<li><a href="#"></a></li>
			<li class="last"><a href="#"></a></li>
		</ul>
	</div>

	<div id="banner"><img src="css/images/pics01.jpg" width="1000" height="361" alt="" /></div>
         <%@taglib uri="/WEB-INF/struts-html.tld" prefix="h"%>

         <%
         String sid=(String)session.getAttribute("stud_id");
         String qwerty="select * from stud_fee where College_id='"+sid+"';";
         String qwerty1="select * from studentrecord where College_id='"+sid+"';";
         ResultSet st1=Databa.dbdet.selectData(qwerty1);
         ResultSet st=Databa.dbdet.selectData(qwerty);
         %>
         <%
         String name="";
         String year="";
         String fname="";
         String br="";
         while(st1.next())
             {
             name=st1.getString("Stu_Name");
             year=st1.getString("year");
             fname=st1.getString("Fathers_Name");
             br=st1.getString("Branch");
             }
         %>
         <%int t=0;
         if(st.next())
         {t++;
         st.previous();
         %>

         <table align="center" height="100" width="700" bgcolor="green">
             <tr><td>Received with thanks from <b><%=name%></b></td><td align="center">DIT</td></tr>
             <tr><td>W/0:<b><%=fname%></b></td><td align="center">Management System</td></tr>
             <tr><td>branch:BTech(<b><%=br%></b>)</td><td>year:<b><%=year%></b></td></tr>
         </table>
  <table align="center" height="200" width="700" bgcolor="cyan" border="2">
      <% while(st.next())
          {
          %>
   
      <tr>
          <td>
              <b>TUTION FEES:</b>
          </td>
          <td>
           <%=st.getString("tution")%>/-
          </td>
      </tr>
      <tr>
          <td>
              <b>HOSTEL FEES:</b>
          </td>
          <td>
             <%=st.getString("hostel")%>/-
          </td>
      </tr>
      <tr>
          <td>
              <b>WIFI FEES:</b>
          </td>
          <td>
             <%=st.getString("wifi")%>/-
          </td>
      </tr>
      <tr>
          <td>
              <b>DRESS CAMP:</b>
          </td>
          <td>
              <%=st.getString("dress")%>/-
          </td>
      </tr>
      <tr>
          <td>
              <b>TOTAL(Rs):</b>
          </td>
          <td>
             <%=st.getString("total")%>/-
          </td>
      </tr>
      <% }%>
  </table>
  <%
      }
       %>
 <% if(t==0)
     {
    %>
    <table align="center"><tr><td><h1>you have not submitted the fees</h1></td></tr></table>
    <%
 }
         %>
        </div>
        </html>



