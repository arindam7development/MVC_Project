/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import java.sql.Connection;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Sony
 */
public class FacultyRegister extends org.apache.struts.action.Action {
    
    
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        facultyregisterbean fb =(facultyregisterbean)form;


           String faculty_Name=fb.getFaculty_Name();
  String ffaculty_id=fb.getFfaculty_id();
  String fuser_Name=fb.getFuser_Name();
  String fpassword=fb.getFpassword();
  String femail_id=fb.getEmailid();
   String ffathers_Name=fb.getFfathers_Name();
    String faddress=fb.getFaddress();
    long fphone_No=fb.getFphone_No();
    String gen=fb.getGen();
  String fdob=fb.getFdob();
    String fdesig=fb.getFdesig();
    String fbranch=fb.getFbranch();
   String fbg=fb.getFbg();

    String query="insert into facultyrecord values('"+faculty_Name+"','"+fuser_Name+"','"+fpassword+"','"+femail_id+"','"+ffathers_Name+"','"+fdesig+"','"+fbranch+"',"+fphone_No+",'"+faddress+"','"+gen+"','"+fdob+"','"+fbg+"','"+ffaculty_id+"');";
        Connection con=Databa.dbdet.getConnection();
        int updateData = Databa.dbdet.updateData(query);
        fb.reset();
        return mapping.findForward("pwd");
    }
}
