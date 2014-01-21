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

/**
 *
 * @author Sony
 */
public class InsertFine extends org.apache.struts.action.Action {
    
    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception
    {
     InserFineBean ifb=(InserFineBean)form;
     String stid=ifb.getStudid();
     String type=ifb.getType();
     long amount=ifb.getAmount();
     String query="insert into stud_finance values('"+stid+"',"+amount+",'"+type+"');";
     int as=Databa.dbdet.updateData(query);
     ifb.reset();
     String msg="fine insert successfully";
     request.setAttribute("msg",msg);
     return mapping.getInputForward();
    }
}
