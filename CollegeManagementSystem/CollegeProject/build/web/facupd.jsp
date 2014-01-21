<%--
    Document   : updjsp
    Created on : 8 Mar, 2013, 4:47:36 PM
    Author     : Sony
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
              <%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="h" %>
<s:setDataSource driver="com.mysql.jdbc.Driver"
                 url="jdbc:mysql://localhost:3306/project"
                 user="root" password=""/>

        <%
        String userid=(String)session.getAttribute("fac_id");
        String sname=(String)request.getAttribute("sname");
        String uname=(String)request.getAttribute("uname");
        String pass=(String)request.getAttribute("pass");
        String bran=(String)request.getAttribute("bran");
        String fname=(String)request.getAttribute("fname");
        String eid=(String)request.getAttribute("eid");
        String add=(String)request.getAttribute("add");
        String bgroup=(String)request.getAttribute("bgroup");
        String gen=(String)request.getAttribute("gen");
        String dob=(String)request.getAttribute("dob");
        String cn=(String)request.getAttribute("cn");
        long cno=Long.parseLong(cn);
        String query="update facultyrecord set Faculty_Name='"+sname+"',FUser_Name='"+uname+"',FPassword='"+pass+"',FEmail_id='"+eid+"',FFather_Name='"+fname+"',FBranch='"+bran+"',FPhone_No="+cno+",FAddress='"+add+"',FSex='"+gen+"',FBloodGroup='"+bgroup+"',FD_O_B='"+dob+"' where Faculty_ID='"+userid+"';";
        Connection con=Databa.dbdet.getConnection();
       int rs=Databa.dbdet.updateData(query);
        %>
        <h3>updated successfully</h3>
        <a href="updatefacultydetail.jsp">see your detail</a>
    </body>
</html>
