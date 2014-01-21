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
        <title>JSP Page</title>
      
          <meta name="description" content="" />
        <meta name="keywords" content="" />
        <title>Hello Admin !</title>

        <link rel="stylesheet" type="text/css" href="css/style.css" />
        
    </head>
    <body >
        <div id="wrapper">
            <div id="header">
                <div id="logo">
                    <h1><a href="#">UID</a></h1>
                </div>

                <div id="menu">
                    <ul>

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
                        <h2>Verifier Login !</h2>

                    </div>
                    <div class="post">

                        <p>
        <form action="sendredirect" method="post">
         <table align ="center"><tr><td class="test1">VERIFIER NAME&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="name"><br>
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
            &copy; 2012 Untitled | Design by <a href="http://www.freecsstemplates.org/">ARINDAM</a> | Images by <a href="http://fotogrph.com/">Arindam</a>
        </div>
    </body>
</html>
