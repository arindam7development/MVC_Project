/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;
import java.sql.Connection;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSession.*;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Sony
 */
public class entermarks extends org.apache.struts.action.Action {
    
   
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
     // String studid=(String)request.getAttribute("id1");
      //String year=(String)request.getAttribute("yr1");
      //String bran=(String)request.getAttribute("br1");
      //String subj=(String)request.getAttribute("sd1");
        //int yee=Integer.parseInt(year);
        entermarksbean eb=(entermarksbean)form;
        int s11=eb.getSess1();
        int s22=eb.getSess2();
        int t12=eb.getTest1();
        int t22=eb.getTest2();
        int t31=eb.getTest3();
        int s32=(s11+s22)/4;
        int t41=(t12+t22+t31)/2;
        int t51=s32+t41;
        String s1=""+s11;
        String s2=""+s22;
        String t1=""+t12;
        String t2=""+t22;
        String t3=""+t31;
        String s3=""+s32;
        String t4=""+t41;
        String t5=""+t51;
        request.setAttribute("s1",s1);
        request.setAttribute("s2",s2);
        request.setAttribute("t1",t1);
        request.setAttribute("t2",t2);
        request.setAttribute("t3",t3);
        request.setAttribute("t4",t4);
        request.setAttribute("s3",s3);
        request.setAttribute("t5",t5);
        eb.reset();
        //request.setAttribute("yr",yee);

       // Connection con=Databa.dbdet.getConnection();
        //String query="update marks_table set sessional_1="+s1+",sessional_2="+s2+",sessional="+s3+",test_1="+t1+",test_2="+t2+",test_3="+t3+",test="+t4+",total="+t5+" where College_id='"+studid+"' and branch='"+bran+"' and Year="+yee+" and sub_id='"+subj+"';";
        //int updateData = Databa.dbdet.updateData(query);
       return mapping.findForward("main");

    }
}
