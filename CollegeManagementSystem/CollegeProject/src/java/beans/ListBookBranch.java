/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import java.sql.ResultSet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Sony
 */
public class ListBookBranch extends org.apache.struts.action.Action {
    
   
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        ListBookBranchBean asu=(ListBookBranchBean)form;
        String bid=asu.getCode();
        int c=0;
        HttpSession s=request.getSession();
        String que1="select * from library where Branch='"+bid+"';";
        ResultSet rs1=Databa.dbdet.selectData(que1);
        if(rs1.next())
             {
            rs1.previous();
            while(rs1.next())
            {
             c++;
                 }
             s.setAttribute("que1",que1+"");
             s.setAttribute("count1",c+"");
             return mapping.findForward("po");
        }
       else
        {
            String msg="*please enter correct Bookid";
            request.setAttribute("msg",msg);
            return mapping.getInputForward();
       }
    }
}
