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

/**
 *
 * @author Sony
 */
public class updatemarks123 extends org.apache.struts.action.Action {
    
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
        String id=request.getParameter("cid");
        String ye=request.getParameter("pid");
        String br=request.getParameter("cbd");
        String po=request.getParameter("pop");
     HttpSession hs=request.getSession();
     hs.setAttribute("stid",id);
     hs.setAttribute("year",ye);
     hs.setAttribute("branch",br);
     hs.setAttribute("subid",po);

        
        return mapping.findForward("lol");
    }
}
