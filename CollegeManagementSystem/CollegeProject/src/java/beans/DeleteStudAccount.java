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
public class DeleteStudAccount extends org.apache.struts.action.Action {
    
    /* forward name="success" path="" */
    
    
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception 
    {
         String query="delete from studentrecord where College_id='"+request.getParameter("dell")+"';";
        Databa.dbdet.updateData(query);
        return mapping.getInputForward();
        
    }
}
