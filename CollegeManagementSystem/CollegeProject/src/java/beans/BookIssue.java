/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import java.sql.Connection;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Sony
 */
public class BookIssue extends org.apache.struts.action.Action {
    
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
        int op=0;
             int qd=0;
        String str="";
        String iss="";
        String ret="";
        int fine=0;
        Connection con=Databa.dbdet.getConnection();
        String que="select BookId from bookissued;";
        ResultSet stu=Databa.dbdet.selectData(que);
        while(stu.next())
        {
            String que1="select ReturnDate from bookissued where BookId='"+stu.getString(1)+"';";
            ResultSet sto=Databa.dbdet.selectData(que1);
             while(sto.next())
            {
            ret=sto.getString(1);
            Calendar currentDate = Calendar.getInstance();
            SimpleDateFormat formatter= new SimpleDateFormat("yyyy/M/dd");
            String datenow = formatter.format(currentDate.getTime());
            char[] cha = datenow.toCharArray();
            String mon=""+cha[5];
            String d=""+cha[7];
            String a=""+cha[8];
            String dat=d+a;
             int mon1=Integer.parseInt(mon);
             int dat1=Integer.parseInt(dat);
             char[] ch=ret.toCharArray();
             String da="";
             String mo="";
             if(ch[1]=='/')
             {
                da=""+ch[0];
                if(ch[3]=='/')
                {
                    mo=""+ch[2];
                }
                else
                {
                    mo=ch[2]+""+ch[3];
                }
             }
             else
             {
                 da=ch[0]+""+ch[1];
                 if(ch[4]=='/')
                {
                    mo=""+ch[3];
                }
                else
                {
                    mo=ch[3]+""+ch[4];
                }
             }
             int mon2=Integer.parseInt(mo);
             int dat2=Integer.parseInt(da);
             if(mon2>mon1)
             {
              fine=0;
             }
            else if (mon2==mon1)
             {
                 if(dat2>dat1)
                 {
                 fine=0;
                 }
                 else
                 {
                 fine=(dat1-dat2)*5;
                 }
             }
            else
             {
                 if((mon2==4)||(mon2==6)||(mon2==9)||(mon2==11))
                    {
                    op=30-dat2;
                    mon2++;
                    while(mon2<mon1)
                        {
                        if((mon2==4)||(mon2==6)||(mon2==9)||(mon2==11))
                            {
                            op=op+30;
                            }
                        else if(mon2==2)
                        {
                            op=op+28;
                        }
                         else
                        {
                            op=op+31;
                        }
                        mon2++;
                       }
                      if(mon2==mon1)
                        {
                       op=op+dat1;
                        }
                    fine=op*5;
                  }
                    else if(mon2==2)
                    {
                      op=28-dat2;
                    mon2++;
                    while(mon2<mon1)
                        {
                        if((mon2==4)||(mon2==6)||(mon2==9)||(mon2==11))
                            {
                            op=op+30;
                            }
                        else if(mon2==2)
                        {
                            op=op+28;
                        }
                         else
                        {
                            op=op+31;
                        }
                        mon2++;
                       }
                      if(mon2==mon1)
                        {
                       op=op+dat1;
                        }
                    fine=op*5;
                    }

                   else
                    {
                         op=31-dat2;
                        mon2++;
                    while(mon2<mon1)
                        {
                        if((mon2==4)||(mon2==6)||(mon2==9)||(mon2==11))
                            {
                            op=op+30;
                            }
                        else if(mon2==2)
                        {
                            op=op+28;
                        }
                         else
                        {
                            op=op+31;
                        }
                        mon2++;
                       }
                      if(mon2==mon1)
                        {
                       op=op+dat1;
                        }
                        fine=op*5;
                   }

             }
            }
            String que2="update bookissued set fine="+fine+" where BookId='"+stu.getString(1)+"';";
            int s=Databa.dbdet.updateData(que2);

        }

        BookIssueBean ab=(BookIssueBean)form;
        String UserId=ab.getUserid();
        String BookId=ab.getBookid();
        String dat=ab.getDat();
        char[] reto=dat.toCharArray();
        String d=""+reto[0];
        String ate=""+reto[1];
        String date=d+ate;
        String m=""+reto[3];
        String onth=""+reto[4];
        String month=m+onth;
        String y=""+reto[6];
        String e=""+reto[7];
        String a=""+reto[8];
        String r=""+reto[9];
        String year=y+e+a+r;
        int intdat=Integer.parseInt(date);
        int intmon=Integer.parseInt(month);
        int intyer=Integer.parseInt(year);
        int intdat1;
        if((intmon==4)||(intmon==6)||(intmon==9)||(intmon==11))
        {
            intdat1=intdat%30;
            intdat1=(intdat1+15)%30;
        }
        else if((intmon==1)||(intmon==3)||(intmon==5)||(intmon==7)||(intmon==8)||(intmon==10)||(intmon==12))
        {
            intdat1=intdat%31;
            intdat1=(intdat1+15)%31;
        }
       else
        {
            intdat1=intdat%28;
            intdat1=(intdat1+15)%28;
        }
        if(intdat1<intdat)
        {
        intmon=intmon+1;
        }
        String returnd=intdat1+"/"+intmon+"/"+intyer;
        String issue="";
        String paa="select Issued from library where BookId='"+BookId+"';";
        ResultSet st=Databa.dbdet.selectData(paa);
        while(st.next())
        {
        issue=st.getString(1);
        }
        if(issue.equals("NO"))
        {
        String query="insert into bookissued values('"+UserId+"','"+BookId+"','"+dat+"','"+returnd+"',"+0+");";
        int updateData = Databa.dbdet.updateData(query);
        String upd="update library set Issued='Yes' where BookId='"+BookId+"';";
        int upa=Databa.dbdet.updateData(upd);
        String msg="*Book issued successfully";
        request.setAttribute("msg",msg);
        ab.reset();
        return mapping.findForward("nice");
        }
       else if((UserId=="")||(BookId=="")||(dat==""))
        {
         String msg="*Please enter all details";
         ab.reset();
         request.setAttribute("msg",msg);
         return mapping.getInputForward();
       }

        else
        {
         String msg="*Book is already issued";
         request.setAttribute("msg",msg);
         ab.reset();
         return mapping.getInputForward();
        }
    }
}
