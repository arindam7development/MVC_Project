/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

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
public class StudFees extends org.apache.struts.action.Action {
    
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
        StudFee sd=(StudFee)form;
        String colid=sd.getStid();
        String msge="";
        long tution=0;
        long hostel=0;
        long wifi=0;
        long dress=0;
        long total=0;
        String y="";
        int year=0;
        String q="select year from studentrecord where College_id='"+colid+"';";
        ResultSet st=Databa.dbdet.selectData(q);
        if(st.next())
        {
        st.previous();
        while(st.next())
        {
            y=st.getString("year");
        }
        year=Integer.parseInt(y);
        if(year==1)
        {
           tution=80000;
           hostel=70000;
           dress=5000;
           wifi=5000;
        }
 else if(year==2)
            {
           tution=75000;
           hostel=60000;
           dress=0;
           wifi=5000;

         }
        else if(year==3)
            {
           tution=72000;
           hostel=50000;
           dress=0;
           wifi=5000;

         }
        else
            {
           tution=70000;
           hostel=50000;
           dress=0;
           wifi=5000;
            }
        total=tution+hostel+dress+wifi;
        String qwer="insert into stud_fee values('"+colid+"',"+tution+","+hostel+","+wifi+","+dress+","+total+");";
        int t=Databa.dbdet.updateData(qwer);
        msge="successfully entered";
        request.setAttribute("msg",msge);
        sd.reset();
        return mapping.getInputForward();
    }
 else
        {
            msge="wrong student id";
            sd.reset();
            request.setAttribute("msg",msge);
            return mapping.getInputForward();
 }

        }
}
