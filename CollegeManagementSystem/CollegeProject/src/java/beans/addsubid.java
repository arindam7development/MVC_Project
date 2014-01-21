/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import java.sql.Connection;
import java.sql.ResultSet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Sony
 */
public class addsubid extends org.apache.struts.action.Action {
    
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
        
        addsubidbean ad=(addsubidbean)form;
        String sid=ad.getSid();
        String sname=ad.getSname();
        int year=ad.getYear();
        String branch=ad.getBranch();
        String y="";
        String yee=y+year;
        int b=0;
         Connection con=Databa.dbdet.getConnection();
         String query="insert into sub_detail values('"+sid+"','"+sname+"',"+year+",'"+branch+"');";
        int zxc=Databa.dbdet.updateData(query);
        String q="select College_id,Stu_Name from studentrecord where Branch='"+branch+"';";
        ResultSet rst=Databa.dbdet.selectData(q);
        while(rst.next())
        {
          String query2="insert into marks_table values('"+rst.getString("College_id")+"','"+sid+"',"+year+","+b+","+b+","+b+","+b+","+b+","+b+","+b+","+b+",'"+branch+"','"+rst.getString("Stu_Name")+"');";
          int zc=Databa.dbdet.updateData(query2);
        }
        ad.reset();
        return mapping.getInputForward();

    }
}
