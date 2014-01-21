/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package myPack;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ARINDAM
 */
public class SendRedirectUser extends HttpServlet {

    @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse
    response)throws ServletException, IOException {
  response.setContentType("text/html");
  PrintWriter pw = response.getWriter();
  String name = request.getParameter("name");
  String password = request.getParameter("password");
 try{
  if(name.equals("")&& password.equals("")){
  response.sendRedirect("client.jsp");
  }
  else{
  pw.println("re-login");
  }
        }
  finally{
      response.sendRedirect("client.jsp");
  }
  }
}
