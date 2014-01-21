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
public class entermarksbean extends org.apache.struts.action.ActionForm {
    
   private int sess1;
   private int sess2;
   private int test1;
   private int test2;
   private int test3;

    public int getSess1() {
        return sess1;
    }

    public void setSess1(int sess1) {
        this.sess1 = sess1;
    }

    public int getSess2() {
        return sess2;
    }

    public void setSess2(int sess2) {
        this.sess2 = sess2;
    }

    public int getTest1() {
        return test1;
    }

    public void setTest1(int test1) {
        this.test1 = test1;
    }

    public int getTest2() {
        return test2;
    }

    public void setTest2(int test2) {
        this.test2 = test2;
    }

    public int getTest3() {
        return test3;
    }

    public void setTest3(int test3) {
        this.test3 = test3;
    }

    void reset() {
        sess1=0;
        sess2=0;
        test1=0;
        test2=0;
        test3=0;
    }

}
