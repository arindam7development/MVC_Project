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
public class UpdateStudDetail extends org.apache.struts.action.Action {
    
    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        UpdateStudDetailBean sb=(UpdateStudDetailBean)form;
        String sname=sb.getSname();
        String uname=sb.getUname();
        String pass=sb.getPass();
        String bran=sb.getBr();
        String fname=sb.getFname();
        long cno=sb.getCno();
        String eid=sb.getEid();
        String add=sb.getAdd();
        String bgroup=sb.getBgroup();
        String gen=sb.getGeno();
        String dob=sb.getDob();
        String ye=sb.getYe();
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
        request.setAttribute("ye",ye);
        request.setAttribute("cn",cn);
        return mapping.findForward("upd");
    }
}
