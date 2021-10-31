/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap2;

/**
 *
 * @author AL MASA
 */
public class Faculty extends Employee 
{
   double work_hour;
    String rank;
    public Faculty(
            String n, String a, String p, String e, String o, double s, double w, String r) {
        super(n, a, p, e, o, s);
        this.work_hour = w;
        this.rank = r;
    }

    Faculty(String roshdy, String mania, String string, String rrcjkjgmail, int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    public String toString() {
        return name + " Faculty";
    } 
}
