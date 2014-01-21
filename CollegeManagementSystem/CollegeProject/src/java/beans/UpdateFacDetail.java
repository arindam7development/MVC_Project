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
public class UpdateFacDetail extends org.apache.struts.action.Action {
    
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
        UpdateFacDetailBean fb=(UpdateFacDetailBean)form;
         String sname=fb.getFname();
        String uname=fb.getFuname();
        String pass=fb.getFpass();
        String bran=fb.getFbr();
        String fname=fb.getFfname();
        long cno=fb.getFcno();
        String eid=fb.getFeid();
        String add=fb.getFadd();
        String bgroup=fb.getFbgroup();
        String gen=fb.getFgeno();
        String dob=fb.getFdob();
        String cn=""+cno;
        request.setAttribute("sname",sname);
        request.setAttribute("uname",uname);
        request.setAttribute("pass",pass);
        request.setAttribute("bran",bran);
        request.setAttribute("fname",fname);
        request.setAttribute("eid",eid);
        request.setAttribute("add",add);
        request.setAttribute("bgroup",bgroup);
        request.setAttribute("gen",gen);
        request.setAttribute("dob",dob);
        request.setAttribute("cn",cn);
        return mapping.findForward("fupd");
        
    }
}
