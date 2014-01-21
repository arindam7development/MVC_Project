<%-- 
    Document   : deletefine
    Created on : 9 Mar, 2013, 1:24:52 AM
    Author     : Sony
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
     <%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="h" %>
<s:setDataSource driver="com.mysql.jdbc.Driver"
                 url="jdbc:mysql://localhost:3306/project"
                 user="root" password=""/>
    <body>
        <%
        String sid=request.getParameter("dog");
        String ty=request.getParameter("cat");
        String que="delete from stud_finance where College_id='"+sid+"' and type='"+ty+"';";
        int j=Databa.dbdet.updateData(que);
        %>
        <h2>removed successfully</h2>
        <a href="FinanceHome.jsp">home page</a>
    </body>
</html>
