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
public class AssignSubj extends org.apache.struts.action.Action {
    
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
        AssignSubjBean asb=(AssignSubjBean)form;
        String fid=asb.getFid();
        String sid=asb.getSid();
        String year=asb.getYear();
        String bran=asb.getBran();
        String query="insert into faculty_lecture values('"+fid+"','"+year+"','"+sid+"','"+bran+"');";
        int a=Databa.dbdet.updateData(query);
        asb.reset();
        return mapping.findForward("succ");
    }
}
