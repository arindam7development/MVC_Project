<%--
    Document   : Library
    Created on : 25 Nov, 2012, 8:45:47 PM
    Author     : Chandan
--%>

<%@page import="java.sql.ResultSet"%>
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
        <%
        String str=(String)request.getAttribute("stdid");
        request.setAttribute("ide",str);
        String query="select * from stud_finance where College_id='"+str+"';";
        ResultSet st=Databa.dbdet.selectData(query);
         %>
	<div id="banner"><img src="css/images/pics01.jpg" width="1000" height="361" alt="" /></div>
        <div id="column2">
            <table align="center" bgcolor="lightgray">
                <tr><td><h1>FINE DETAIL </h1></td></tr>
                     </table>
            <table align="center" bgcolor="lightgray" border="2">
                <tr>
                    <th>STUDENT_ID</th>
                    <th>STUDENT_NAME</th>
                    <th>FINE</th>
                    <th>TYPE</th>
                </tr>
               <%
               while(st.next())
               {
                %>
                <tr>
                    <td bgcolor="white"><%=st.getString("College_id")%></td>
                    <%
                    String q="select Stu_Name from studentrecord where College_id='"+str+"';";
                    ResultSet df=Databa.dbdet.selectData(q);
                    while(df.next())
                        {
                    %>
                    <td bgcolor="white"><%=df.getString("Stu_Name")%></td>
                    <% } %>
                    <td bgcolor="white"><%=st.getString("col_fine")%></td>
                    <td bgcolor="white"><%=st.getString("type")%></td>
                    <% String type=st.getString("type");
                    request.setAttribute("typee",type);
                    %>
                    <td><a href="deletefine.jsp?dog=${ide}&cat=${typee}"/>delete</td>
            <% } %>
            </table>
            <table align="center">
                <tr>
                    <td>
                        <a href="FinanceHome.jsp">click here for home page</a>
                    </td>
                </tr>
            </table>


		</div>
         </div>
</body>
</html>
