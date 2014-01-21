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
public class UpdateFacDetailBean extends org.apache.struts.action.ActionForm
{
private String fname;
private String funame;
private String fpass;
private String fbr;
private String ffname;
private String feid;
private String fadd;
private long fcno;
private String fbgroup;
private String fgeno;
private String fdob;

    public String getFadd() {
        return fadd;
    }

    public void setFadd(String fadd) {
        this.fadd = fadd;
    }

    public String getFbgroup() {
        return fbgroup;
    }

    public void setFbgroup(String fbgroup) {
        this.fbgroup = fbgroup;
    }

    public String getFbr() {
        return fbr;
    }

    public void setFbr(String fbr) {
        this.fbr = fbr;
    }

    public long getFcno() {
        return fcno;
    }

    public void setFcno(long fcno) {
        this.fcno = fcno;
    }

    

    public String getFdob() {
        return fdob;
    }

    public void setFdob(String fdob) {
        this.fdob = fdob;
    }

    public String getFeid() {
        return feid;
    }

    public void setFeid(String feid) {
        this.feid = feid;
    }

    public String getFfname() {
        return ffname;
    }

    public void setFfname(String ffname) {
        this.ffname = ffname;
    }

    public String getFgeno() {
        return fgeno;
    }

    public void setFgeno(String fgeno) {
        this.fgeno = fgeno;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFpass() {
        return fpass;
    }

    public void setFpass(String fpass) {
        this.fpass = fpass;
    }

    public String getFuname() {
        return funame;
    }

    public void setFuname(String funame) {
        this.funame = funame;
    }


}
