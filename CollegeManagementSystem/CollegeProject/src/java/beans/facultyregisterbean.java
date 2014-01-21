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
public class facultyregisterbean extends org.apache.struts.action.ActionForm {
    
   private String faculty_Name;
   private String ffaculty_id;
   private String fuser_Name;
   private String fpassword;
   private String emailid;
   private String ffathers_Name;
   private String faddress;
   private long fphone_No;
   private String gen;
   private String fdob;
   private String fdesig;
   private String fbranch;
   private String fbg;

    public String getFaculty_Name() {
        return faculty_Name;
    }

    public void setFaculty_Name(String faculty_Name) {
        this.faculty_Name = faculty_Name;
    }

    public String getFaddress() {
        return faddress;
    }

    public void setFaddress(String faddress) {
        this.faddress = faddress;
    }

    public String getFbg() {
        return fbg;
    }

    public void setFbg(String fbg) {
        this.fbg = fbg;
    }

    public String getFbranch() {
        return fbranch;
    }

    public void setFbranch(String fbranch) {
        this.fbranch = fbranch;
    }

    public String getFdesig() {
        return fdesig;
    }

    public void setFdesig(String fdesig) {
        this.fdesig = fdesig;
    }

    public String getFdob() {
        return fdob;
    }

    public void setFdob(String fdob) {
        this.fdob = fdob;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

   

    public String getFfaculty_id() {
        return ffaculty_id;
    }

    public void setFfaculty_id(String ffaculty_id) {
        this.ffaculty_id = ffaculty_id;
    }

    public String getFfathers_Name() {
        return ffathers_Name;
    }

    public void setFfathers_Name(String ffathers_Name) {
        this.ffathers_Name = ffathers_Name;
    }

    public String getFpassword() {
        return fpassword;
    }

    public void setFpassword(String fpassword) {
        this.fpassword = fpassword;
    }

    public long getFphone_No() {
        return fphone_No;
    }

    public void setFphone_No(long fphone_No) {
        this.fphone_No = fphone_No;
    }

    public String getFuser_Name() {
        return fuser_Name;
    }

    public void setFuser_Name(String fuser_Name) {
        this.fuser_Name = fuser_Name;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    void reset() {
   faculty_Name="";
   ffaculty_id="";
   fuser_Name="";
   fpassword="";
   emailid="";
   ffathers_Name="";
   faddress="";
   fphone_No=0;
   fdob="";
   fbranch="";
   fbg="";

    }

   

   

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
   
}
