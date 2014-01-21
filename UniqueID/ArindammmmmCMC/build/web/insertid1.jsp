<%-- 
    Document   : insertid1
    Created on : 15 Jul, 2012, 3:17:29 PM
    Author     : ARINDAM
--%>

<%@page import="java.sql.*,java.util.*"%>
<%
     String name = request.getParameter("name");
String FatherNAME  = request.getParameter("Father_NAME");
String address = request.getParameter("address");
String phone = request.getParameter("Phone");
String pan = request.getParameter("pan");
String NATION = request.getParameter("NATION");

String employ = request.getParameter("employ");
String m = request.getParameter("m");
String dob = request.getParameter("dob");
String email = request.getParameter("email");
String appId = request.getParameter("applicationId");
String city = request.getParameter("city");
String state = request.getParameter("state");
String verified = request.getParameter("verified");
String approved = request.getParameter("approved");
String ms = request.getParameter("MaritalStatus");

        try{
         Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/roseindia", "root", "root");
           Statement st=con.createStatement();
           int i=st.executeUpdate("insert into id1 values('"+name+"','"+FatherNAME+"','"+address+"','"+phone+"','"+pan+"','"+NATION+"',"+employ+",'"+m+"','"+dob+"','"+email+"','"+appId+"','"+city+"',"+state+","+verified+","+approved+","+ms+")");
        out.println("Data is successfully inserted!");
        }
        catch(Exception e){
        System.out.print(e);
        e.printStackTrace();
        }
        %>
