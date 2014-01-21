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
public class StudentDetailBean extends org.apache.struts.action.ActionForm {
    
   
    private String stu_Name;
    private String password;
    private String user_Name;
    private String branch;
    private String college_id;
    private String fathers_Name;
    private String email_id;
    private String address;
    private long contact_No;
    private String blood_Group;
    private String gen;
    private String d_O_B;
    private String year;
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBlood_Group() {
        return blood_Group;
    }

    public void setBlood_Group(String blood_Group) {
        this.blood_Group = blood_Group;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getCollege_id() {
        return college_id;
    }

    public void setCollege_id(String college_id) {
        this.college_id = college_id;
    }

    public long getContact_No() {
        return contact_No;
    }

    public void setContact_No(long contact_No) {
        this.contact_No = contact_No;
    }

    public String getD_O_B() {
        return d_O_B;
    }

    public void setD_O_B(String d_O_B) {
        this.d_O_B = d_O_B;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getFathers_Name() {
        return fathers_Name;
    }

    public void setFathers_Name(String fathers_Name) {
        this.fathers_Name = fathers_Name;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStu_Name() {
        return stu_Name;
    }

    public void setStu_Name(String stu_Name) {
        this.stu_Name = stu_Name;
    }

    public String getUser_Name() {
        return user_Name;
    }

    public void setUser_Name(String user_Name) {
        this.user_Name = user_Name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    void reset() {
    stu_Name="";
    password="";
    user_Name="";
    branch="";
    college_id="";
    fathers_Name="";
    email_id="";
    address="";
    contact_No=0;
    blood_Group="";
    d_O_B="";
    year="";

    }






    

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
   
}
