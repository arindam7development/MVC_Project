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
public class FacultyAuthen extends org.apache.struts.action.Action {
   
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        FacultyAuthnBean ab=(FacultyAuthnBean)form;
        String fuser=ab.getFacultyname();
        String pass=ab.getPassword();
        String que="select * from admin where UserName='"+fuser+"' and Password='"+pass+"';";
        ResultSet rs=Databa.dbdet.selectData(que);
        ab.reset();
        if(rs.next())
        {
            String name2=fuser;
            request.setAttribute("name",name2);
         return mapping.findForward("add");
        }
       else
        {
            String msg="*UserName or password invalid";
            request.setAttribute("msg",msg);
            return mapping.getInputForward();
       }
    }
        
        
    
}
