/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap2;

import java.util.Date;

/**
 *
 * @author AL MASA
 */
public class Employee extends Person
{
  String office;
    double salary;
    Date date_hired = new Date();
    public Employee(
            String n, String a, String p, String e, String o, double s) {
        super(n, a, p, e);
        this.office = o;
        this.salary = s;
    }

    Employee(String roshdy, String mania, String string, String rrcjkjgmail, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String toString() {
        return name + " Employee";
    }
  
}
