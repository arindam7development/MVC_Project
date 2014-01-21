/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

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
public class StudentDetail extends org.apache.struts.action.Action {
    
   
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        StudentDetailBean sd=(StudentDetailBean)form;
        String Stu_Name=sd.getStu_Name();
        String User_Name=sd.getUser_Name();
        String Password=sd.getPassword();
        String Branch=sd.getBranch();
        String College_id=sd.getCollege_id();
        String Fathers_Name=sd.getFathers_Name();
        String Email_id=sd.getEmail_id();
        String Address=sd.getAddress();
        String Blood_Group=sd.getBlood_Group();
        long Contact_No=sd.getContact_No();
        String Gen=sd.getGen();
        String D_O_B=sd.getD_O_B();
        String yr=sd.getYear();
        String dat="date";
        String day="day";
        //int yr1=Integer.parseInt("yr");
        String query="insert into studentrecord values('"+Stu_Name+"','"+User_Name+"','"+Password+"','"+Email_id+"','"+Fathers_Name+"','"+College_id+"','"+Branch+"',"+Contact_No+",'"+Address+"','"+Gen+"','"+Blood_Group+"','"+D_O_B+"','"+yr+"');";
        Connection con=Databa.dbdet.getConnection();
        String query1="insert into attendance values('"+Stu_Name+"','"+College_id+"','"+Branch+"','"+yr+"','"+dat+"','"+day+"',"+0+","+0+","+0+");";
        int updateData = Databa.dbdet.updateData(query);
        int updateData1 = Databa.dbdet.updateData(query1);
        sd.reset();
        return mapping.findForward("ok");
    }
}
