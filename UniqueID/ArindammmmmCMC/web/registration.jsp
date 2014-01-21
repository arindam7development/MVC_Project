<%-- 
    Document   : registration
    Created on : 18 Jul, 2012, 10:50:51 PM
    Author     : ARINDAM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="content-type" content="text/html; charset=utf-8" />
        <meta name="description" content="" />
        <meta name="keywords" content="" />
        <title>UID</title>

        <link rel="stylesheet" type="text/css" href="css/style.css" />
        <script  type="text/javascript">
            function validateForm()
            {
                var x=document.forms["myForm"]["email"].value;

                var atpos=x.indexOf("@");
                var dotpos=x.lastIndexOf(".");
                if (atpos<1 || dotpos<atpos+2 || dotpos+2>=x.length)
                {
                    alert("Not a valid e-mail address");
                    return false;
                }
                var y=document.forms["myForm"]["name"].value;
                if (y==null || y=="")
                {
                    alert("Name must be filled out");
                    return false;
                }
                var p=document.forms["myForm"]["Phone"].value;
                p.maxlen=10;
                if(p.length!=10 || p!="numeric")
                {
                    alert("enter the phone number correctly");
                    return false;
                }
            }
             
        </script>
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
                        <li><a href="registration.jsp">Registration</a></li>
                        <li><a href="AdminLogin.jsp">Admin Login</a></li>
                        <li><a href="verifierlogin.jsp">Verifier Login</a></li>
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
                        <h2>Login for Registered Users</h2>
                        
                              <form action="SendRedirectUser" method="post">
         <table align ="center"><tr><td class="test1">User NAME&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="name"><br>
                     <tr><td class="test1"> PASSWORD&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="password" name="password"><br>
                     <tr><td class="test1"><input type="submit" value="submit"></td></tr>


        </table>

        </form>

                    </div>
                    <div class="post">
                        <h3>Registration Form</h3>
                        <p>
                        <form action="ServletUserEnquiryForm" onsubmit="validateForm();" method="post" name="myform" >
                            <table>


                                <tr><td>NAME</td><td><input type="text" name="name" size="30"  ></td></tr>
                                <tr><td>FATHER'S NAME</td><td><input type="text" name="FATHER_NAME" size="30"  ></td></tr>
                                <tr><td>ADDRESS</td><td><textarea name="address" rows="4" cols="25"></textarea></td></tr>
                                <tr><td>PHONE NUMBER</td><td><input type="text" name="Phone" ></td></tr>
                                <tr><td>PAN CARD NUMBER</td><td><input type="text" name="pan" size="30"  ></td></tr>
                                <tr><td>NATIONALITY</td><td><input type="text" name="NATION" size="30"  ></td></tr>
                                <tr><td>EMPLOYMENT</td><td><input type="text" name="employ" size="30"  ></td></tr>
                                <tr><td>GENDER</td><td><input type="radio" name="m" value="Male" checked="true"/> Male  <input type="radio" name="m" value="Female"/>Female</td></tr>
                                <tr><td>Date Of Birth</td><td><input type="text" name="dob" >yyyy/mm/dd</td></tr>
                                <tr><td>Email Id</td><td><input type="text" name="email" size="30"  ></td></tr>
                                <tr><td>APPLICATION I.D.</td><td><input type="text" name="applicationId"size="30"  ></td></tr>
                                <tr><td>CITY</td><td><input type="text" name="city"size="30"  ></td></tr>
                                <tr><td>STATE</td><td><input type="text" name="state"size="30"  ></td></tr>
                                 <tr><td>UserName</td><td><input type="text" name="UN"size="30"  ></td></tr>
                                <tr><td>Password</td><td><input type="password" name="ps"size="30"  ></td></tr>
                                <tr><td>VERIFIED put 0(not verified)1(verified)2(waiting)</td><td><input type="text" name="verified"size="30"  ></td></tr>
                                <tr><td>APPROVED put  0(not approved)1(approved)2(waiting) </td><td><input type="text" name="approved"size="30"  ></td></tr>
                                <tr><td>MARITAL STATUS</td><td><input type="text" name="MaritalStatus"size="30"  ></td></tr>
                                <tr><td>Click Here To Submit</td><td>
                                        <input type="submit" name="register" value="REGISTER" ></td></tr>
                            </table>
                        </form>
                    </div>
                    <br class="clearfix" />
                </div>
                <br class="clearfix" />
            </div>
        </div>
        <div id="footer">
            &copy; 2012 Untitled | Design by <a href="http://www.freecsstemplates.org/">ARINDAM</a> | Images by <a href="http://fotogrph.com/">arindam</a>
        </div>
    </body>
</html>
