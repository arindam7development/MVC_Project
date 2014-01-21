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
public class ComplainPage extends org.apache.struts.action.Action {
    
  @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
      ComplainPageBean pj=(ComplainPageBean)form;
      String add=pj.getAdd();
      ResultSet r= Databa.dbdet.selectData("select ComplainId from complain order by ComplainId desc;");
      r.next();
      int cid=Integer.parseInt(r.getString(1));
      int gid=cid+1;
      String qaz="insert into complain values('"+gid+"','"+add+"');";
      int q=Databa.dbdet.updateData(qaz);
      pj.reset();
      String msg="*Complain registered successfully";
      request.setAttribute("msg",msg);
      return mapping.getInputForward();
        
    }
}
