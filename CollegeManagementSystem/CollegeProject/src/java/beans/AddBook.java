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
public class AddBook extends org.apache.struts.action.Action {
    
   
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        AddBookBean ad=(AddBookBean)form;
        String id=ad.getId();
        String name=ad.getName();
        String issue=ad.getIssue();
        String branch=ad.getBranch();
        String queree="insert into library values('"+id+"','"+name+"','"+issue+"','"+branch+"');";
        int zxc=Databa.dbdet.updateData(queree);
        ad.reset();
        return mapping.getInputForward();
    }
}
