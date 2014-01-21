/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author Sony
 */
public class BookReturnBean extends org.apache.struts.action.ActionForm {
    
    private String bide;

    public String getBide() {
        return bide;
    }

    public void setBide(String bide) {
        this.bide = bide;
    }

    void reset() {
        bide="";
    }



}
