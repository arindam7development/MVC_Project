/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;
import java.sql.Connection;
import java.util.Calendar;
import java.text.SimpleDateFormat;
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
public class BookReturn extends org.apache.struts.action.Action {
    
   
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        Connection con=Databa.dbdet.getConnection();
        BookReturnBean brt=(BookReturnBean)form;
        String bbi=brt.getBide();
        String str="";
        String iss="";
        String ret="";
        int fin=0;
        String que="select College_id,IssueDate,ReturnDate,fine from bookissued where BookId='"+bbi+"';";
        ResultSet st=Databa.dbdet.selectData(que);
        if(st.next())
        {
            st.previous();
            while(st.next())
            {
            str=st.getString(1);
            iss=st.getString(2);
            ret=st.getString(3);
            fin=Integer.parseInt(st.getString(4));
            }
           if(fin==0)
           {
           String que1="delete from bookissued where UserId='"+str+"';";
           int oop=Databa.dbdet.updateData(que1);

           String que2="update library set Issued='NO' where BookId='"+bbi+"';";
           int upa=Databa.dbdet.updateData(que2);
           String msg="*Book Returned Successfully";
           brt.reset();
           request.setAttribute("msg",msg);
           return mapping.getInputForward();
            }
            else
            {
                request.setAttribute("bid",bbi);
            return mapping.findForward("fail");
            }

        }
        else
        {
            String msg="**invalid bookid";
        request.setAttribute("msg",msg);
        brt.reset();
        return mapping.getInputForward();
 }

 }
}
