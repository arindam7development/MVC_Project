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
public class ListBookId extends org.apache.struts.action.Action {
    
    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    
    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        ListBookIdBean as=(ListBookIdBean)form;
        String bid=as.getBid();
        int count=0;
        HttpSession s=request.getSession();
        String que="select * from library where BookId='"+bid+"';";
        ResultSet rs=Databa.dbdet.selectData(que);
        as.reset();
        if(rs.next())
        {  count++;
             String name1=bid;
             s.setAttribute("name1",name1+"");
             s.setAttribute("que",que+"");
             s.setAttribute("count",count+"");
             return mapping.findForward("pop");
        }
       else
        {
            String msg="*please enter correct Bookid";
            request.setAttribute("msg",msg);
            return mapping.getInputForward();
       }
        
        
    }
}
