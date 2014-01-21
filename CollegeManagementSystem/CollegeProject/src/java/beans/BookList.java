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
public class BookList extends org.apache.struts.action.Action {
    

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        BookListBean bl=(BookListBean)form;
        String sel=bl.getGene();
        if(sel.equals("id"))
        {
            return mapping.findForward("id");
        }
        else
        {
        return mapping.findForward("branch");
        }
    }
}
