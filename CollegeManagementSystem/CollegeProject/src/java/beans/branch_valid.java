/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;
import javax.servlet.http.HttpSession;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class branch_valid extends org.apache.struts.action.Action {
    
   
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception 
    {
        HttpSession sb=request.getSession();
        branch_validbean bv=(branch_validbean)form;
        String yr=bv.getYear();
        String br=bv.getBranch();
        String fuid=bv.getFid();
        String suid=bv.getSubid();
        HttpSession gs=request.getSession();
        String a="";
        String b="";
        Connection con=Databa.dbdet.getConnection();
       String que1="select branch,year from faculty_lecture where Faculty_ID='"+fuid+"' and sub_id='"+suid+"';";
       ResultSet rst1=Databa.dbdet.selectData(que1);
        while(rst1.next())
        {
            a=rst1.getString("branch");
            b=rst1.getString("year");
        }
         if(a.equals(br)&&b.equals(yr))
       {    sb.setAttribute("branch",br);
            sb.setAttribute("year",yr);
            sb.setAttribute("sid", suid);
            bv.reset();
            return mapping.findForward("mila");
       }
        else
       {
           String msg="*You are not permitted!!!";
           bv.reset();
            request.setAttribute("msge",msg);
            return mapping.getInputForward();

        }

 }
         
        
        
    }

