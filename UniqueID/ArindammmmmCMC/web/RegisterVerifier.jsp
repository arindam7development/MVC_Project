<%-- 
    Document   : RegisterVerifier
    Created on : 13 Jul, 2012, 12:01:54 PM
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
        <title>Registeration for VERIFIER !</title>

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
<li><a  href="AdminHome.jsp">Back</a> </li>
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
                        <h2>Register yourself with us</h2>
                       
                    </div>
                    <div class="post">
                        <h3>Registration Form</h3>
                        <p>
        <form action="verifyServlet" method="post">
<table align="center" title="REGISTRATION DETAILS"  >



<tr><td>VERIFIER ID</td><td><input type="text" name="vid" size="30"  ></td></tr>
<tr><td>NAME</td><td><input type="text" name="vname" size="30"  ></td></tr>
<tr><td>PHONE NUMBER</td><td><input type="text" name="vphone" ></td></tr>
<tr><td>ADDRESS</td><td><textarea name="vaddress" rows="4" cols="25"></textarea></td></tr>
<tr><td>STATE</td><td><input type="text" name="state" size="30"  ></td></tr>
<tr><td>CITY</td><td><input type="text" name="city" size="30"  ></td></tr>

<tr><td>GENDER</td><td><input type="radio" name="gender" value="Male" checked="true"/> Male  <input type="radio" name="m" value="Female"/>Female</td></tr>



    <tr><td>Click Here To Submit</td><td>
            <input type="submit" name="register" value="REGISTER" ></td></tr>
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
