<%-- 
    Document   : Approve
    Created on : 15 Jul, 2012, 3:55:03 PM
    Author     : ARINDAM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <meta name="description" content="" />
        <meta name="keywords" content="" />
        <title>Hello Admin !</title>

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
<li class="first current_page_item"><a href="index.jsp">Logout</a></li>
<li><a  href="verifierhome.jsp">Back</a> </li>
                    </ul>
                    <br class="clearfix" />
                </div>
            </div>
            <div id="splash">
                <img src="css/images/arr.jpg" width="1100" height="250" alt="" />
            </div>
            <div id="page">
                <div id="content">
                    <div class="post">
                        <h2>Hello Admin !</h2>

                    </div>
                    <div class="post">

                        <p>
        <form action="approve" method="get">
            <table class="b" border ="20" cellpadding="10" cellspacing="10" bgcolor="cyan" align="center" title="REGISTRATION DETAILS"  >
               <tr><td>ENTER THE APPLICATION I.D.</td><td><input type="text" name="applicationId" size="30"  ></td></tr>
                <tr><td>APPROVED put  0(not approved)1(approved)2(waiting) </td><td><input type="text" name="app2"size="30"  ></td></tr>
               <tr><td>Click Here To Submit</td><td>
                    <input type="submit" name="register" value="CHANGE APPROVAL STATUS" ></td></tr>
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
            &copy; 2012 Untitled | Design by <a href="http://www.freecsstemplates.org/">ARINDAM</a> | Images by <a href="http://fotogrph.com/">Arindam</a>
        </div>
    </body>
</html>
