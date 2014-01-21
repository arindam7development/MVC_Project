<%-- 
    Document   : verifierhome
    Created on : 15 Jul, 2012, 4:18:53 PM
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
                        <h2>Hello Verifier !</h2>

                    </div>
                    <div class="post">

                        <p>
        <form action="" method="post">
        <ul type="circle">
            <li><a class="test3" href="CheckStatus.jsp">CHECK STATUS</a></li>
            <li> <a class="test3" href="verify.jsp">VERIFY THE APPLICATIONS</a></li>
            <li><a class="test3" href="assigned.jsp">VIEW REGISTERED APPLICATIONS</a></li>

        </ul>

           
 <a href="logout.jsp"> <input type="button" value="LOGOUT " /></a>

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