<%-- 
    Document   : AdminLogin
    Created on : 13 Jul, 2012, 11:37:30 AM
    Author     : ARINDAM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <meta name="description" content="" />
        <meta name="keywords" content="" />
        <title>Admin Login</title>

        <link rel="stylesheet" type="text/css" href="css/style.css" />
    </head>
    <body>
        <div id="wrapper">
            <div id="header">
                <div id="logo">
                    <h1><a href="#">UID</a></h1>
                </div>
                
                <div id="menu">
                    <ul>
                        <li class="first current_page_item"><a href="index.jsp">Homepage</a></li>
                        <li><a href="about.jsp">About Us</a></li>
                       
                        <li class="last"><a href="contact.jsp">Contact</a></li>
                    </ul>
                    <br class="clearfix" />
                </div>
            </div>
            <div id="splash">
                <img src="css/images/ae.jpg" width="1100" height="250" alt="" />
            </div>
            <div id="page">
                <div id="content">
                    <div class="post">
                        <h2>Admin Login</h2>
                       
                    </div>
                    <div class="post">
                    
                        <p>
        <form action="SendRedirectServlet" method="post">
         <table align ="center"><tr><td class="test1">ADMIN NAME&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="name"><br>
                     <tr><td class="test1"> PASSWORD&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="password" name="password"><br>
                     <tr><td class="test1"><input type="submit" value="submit"></td></tr>


        </table>

        </form>
        </p>
                    </div>
                    <br class="clearfix" />
                </div>
                <br class="clearfix" />
            </div>
        </div>
        <div id="footer">
            <a href="http://www.freecsstemplates.org/"></a> | Images by <a href="http://fotogrph.com/"></a>
        </div>
    </body>
</html>
