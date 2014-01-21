/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import java.sql.*;

/**
 *
 * @author Sony
 */
public class StudentAuthen extends org.apache.struts.action.Action {
    
   
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception
    {   HttpSession sess=request.getSession();
        StudentAuthenBean sd=(StudentAuthenBean)form;
        String uname=sd.getStudname();
        String studid="";
        String nameu="";
        String Faculid="";
        String FaculName="";
        String pass=sd.getPassword();
        String gen=sd.getGen();
        String psp="faculty";
        String pol="librarian";
        String pop="accountant";
        if(gen.equals("student"))
        {
            String query = "select * from studentrecord where User_Name='" + uname + "' and Password='" + pass + "';";
            ResultSet rs=Databa.dbdet.selectData(query);
            sd.reset();
            if(rs.next())
            {
            studid=(rs.getString("College_id"));
            nameu=(rs.getString("Stu_Name")).toUpperCase();
            String name1=uname;
            sess.setAttribute("stu_name",nameu);
            sess.setAttribute("stud_id",studid);
            return mapping.findForward("correct");
            }
           else
            {
            String msg="*UserName or password invalid";
            request.setAttribute("msg",msg);
            return mapping.getInputForward();
            }
        }
            else if(gen.equals("faculty"))
            {
        String que="select * from facultyrecord where FUser_Name='"+uname+"' and FPassword='"+pass+"' and Designation='"+psp+"';";
        ResultSet rs=Databa.dbdet.selectData(que);
        
        sd.reset();
        if(rs.next())
        {
            Faculid=(rs.getString("Faculty_ID"));
            FaculName=(rs.getString("Faculty_Name")).toUpperCase();
            String name1=uname;
            sess.setAttribute("fac_id",Faculid);
            sess.setAttribute("fac_name",FaculName);
         String name2=uname;
         request.setAttribute("name",name2);

         return mapping.findForward("good");
        }
        else
        {
            String msg="*UserName or password invalid";
            request.setAttribute("msg",msg);
            return mapping.getInputForward();
        }
            }
         else if(gen.equals("accountant"))
            {
        String que="select * from facultyrecord where FUser_Name='"+uname+"' and FPassword='"+pass+"' and Designation='"+pop+"';";
        ResultSet rs=Databa.dbdet.selectData(que);

        sd.reset();
        if(rs.next())
        {
         String name2=uname;
         request.setAttribute("name",name2);

         return mapping.findForward("okji");
        }
        else
        {
            String msg="*UserName or password invalid";
            request.setAttribute("msg",msg);
            return mapping.getInputForward();
        }
            }

       else
        {
            String que="select * from facultyrecord where FUser_Name='"+uname+"' and FPassword='"+pass+"' and Designation='"+pol+"';";

        ResultSet rs=Databa.dbdet.selectData(que);
        sd.reset();
        if(rs.next())
        {
            String name2=uname;
            request.setAttribute("name",name2);
         return mapping.findForward("exe");
        }
       else
        {
            String msg="*UserName or password invalid";
            request.setAttribute("msg",msg);
            return mapping.getInputForward();
       }

        }
 }

        
    }

